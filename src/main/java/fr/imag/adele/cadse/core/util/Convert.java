/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.core.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import java.util.UUID;
import fr.imag.adele.cadse.core.attribute.BooleanAttributeType;
import fr.imag.adele.cadse.core.attribute.DateAttributeType;
import fr.imag.adele.cadse.core.attribute.DoubleAttributeType;
import fr.imag.adele.cadse.core.attribute.EnumAttributeType;
import fr.imag.adele.cadse.core.attribute.IAttributeType;
import fr.imag.adele.cadse.core.attribute.LongAttributeType;
import fr.imag.adele.cadse.core.attribute.StringAttributeType;
import fr.imag.adele.cadse.core.transaction.delta.ItemDelta;

public class Convert {

	public static int[] toArray(List<Integer> value) {
		if (value == null || value.size() ==0)
			return null;
		int[] ret = new int[value.size()];
		int j = 0;
		for (int i : ret) {
			ret[j++] = i;
		}
		return ret;
	}
	
	
	public static boolean toBoolean(Object value) {
		if (value == null || "".equals(value)) {
			throw new NullPointerException("A boolean value is null : can't convert to primive boolean value");
		}
		if (value instanceof String) {
			return "true".equalsIgnoreCase((String) value);
		}
		if (value instanceof Boolean) {
			return Boolean.TRUE.equals(value);
		}
		throw new ClassCastException("Can't convert to primive boolean value the type " + value.getClass());
	}

	public static boolean toBoolean(Object value, boolean defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		}
		if (value instanceof String) {
			return "true".equalsIgnoreCase((String) value);
		}
		if (value instanceof Boolean) {
			return Boolean.TRUE.equals(value);
		}
		throw new ClassCastException("Can't convert to primive boolean value the type " + value.getClass());
	}

	public static boolean toBoolean(Object value, BooleanAttributeType type, boolean defaultValue) {
		if (value == null || "".equals(value)) {
			if (type != null) {
				return type.getDefaultValue();
			}
			return defaultValue;
		}
		if (value instanceof String) {
			return "true".equalsIgnoreCase((String) value);
		}
		if (value instanceof Boolean) {
			return Boolean.TRUE.equals(value);
		}
		throw new ClassCastException("Can't convert to primive boolean value the type " + value.getClass());
	}
	
	public static boolean toBoolean(String value,
			boolean defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		}
		if (value instanceof String) {
			return "true".equalsIgnoreCase((String) value);
		}
		throw new ClassCastException("Can't convert to primive boolean value the type " + value.getClass());
	}

	public static boolean toBooleanFalseIfNull(Object value) {
		return toBoolean(value, false);
	}

	public static Boolean toBoolean(Object value, Boolean defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		}
		if (value instanceof String) {
			return "true".equalsIgnoreCase((String) value);
		}
		if (value instanceof Boolean) {
			return Boolean.TRUE.equals(value);
		}
		throw new ClassCastException("Can't convert to primive boolean value the type " + value.getClass());
	}

	public static String toString(Object value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	public static String toString(Object value, StringAttributeType type, String dv) {
		if (value == null && type != null) {
			value = type.getDefaultValue();
		}
		if (value == null) {
			return dv;
		}
		return value.toString();
	}

	public static Date toDate(Object value, Date defaultValue, DateAttributeType attributType) {
		if (value == null) {
			return defaultValue;
		}
		if ("".equals(value)) {
			return defaultValue;
		}
		if (value instanceof Date) {
			return (Date) value;
		}
		if (value instanceof String) {
			try {
				// Fri Feb 13 15:22:19 CET 2009
				return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US).parse((String) value);
			} catch (ParseException e) {
				throw new IllegalArgumentException("Can't convert to date value the type " + value.getClass() + " : "
						+ e.getMessage(), e);
			}
		}
		throw new ClassCastException("Can't convert to date value the type " + value.getClass());
	}

	public static Double toDouble(Object value) {
		if (value == null || "".equals(value)) {
			return null;
		}
		if (value instanceof String) {
			return Double.valueOf((String) value);
		}
		if (value instanceof Number) {
			return ((Number) (value)).doubleValue();
		}
		throw new ClassCastException("Can't convert to Double value the type " + value.getClass());

	}

	public static double toDouble(Object value, double defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		}
		if (value instanceof String) {
			return Double.valueOf((String) value);
		}
		if (value instanceof Number) {
			return ((Number) (value)).doubleValue();
		}
		throw new ClassCastException("Can't convert to Double value the type " + value.getClass());

	}
	
	public static Double toDouble(Object value, Double defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		}
		if (value instanceof String) {
			return Double.valueOf((String) value);
		}
		if (value instanceof Number) {
			return ((Number) (value)).doubleValue();
		}
		throw new ClassCastException("Can't convert to Double value the type " + value.getClass());

	}

	public static double toDouble(Object value, DoubleAttributeType type, double defaultValue) {
		if (value == null || "".equals(value)) {
			if (type != null && type.getDefaultValue() != null) {
				return type.getDefaultValue();
			}
			return defaultValue;
		}
		if (value instanceof String) {
			return Double.valueOf((String) value);
		}
		if (value instanceof Number) {
			return ((Number) (value)).doubleValue();
		}
		throw new ClassCastException("Can't convert to Double value the type " + value.getClass());

	}

	public static long toLong(Object value, long defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		}
		if (value instanceof String) {
			return Long.valueOf((String) value);
		}
		if (value instanceof Number) {
			return ((Number) (value)).longValue();
		}
		if (value instanceof Date) {
			return ((Date) (value)).getTime();
		}
		throw new ClassCastException("Can't convert to Long value the type " + value.getClass());

	}
	
	public static Long toLong(Object value, Long defaultValue) {
		if (value == null || "".equals(value)) {
			return defaultValue;
		}
		if (value instanceof String) {
			return Long.valueOf((String) value);
		}
		if (value instanceof Number) {
			return ((Number) (value)).longValue();
		}
		if (value instanceof Date) {
			return ((Date) (value)).getTime();
		}
		throw new ClassCastException("Can't convert to Long value the type " + value.getClass());

	}
	
	public static long toLong(Object value, LongAttributeType type, long defaultValue) {
		if (value == null || "".equals(value)) {
			if (type != null && type.getDefaultValue() != null) {
				return type.getDefaultValue();
			}
			return defaultValue;
		}
		if (value instanceof String) {
			return Long.valueOf((String) value);
		}
		if (value instanceof Number) {
			return ((Number) (value)).longValue();
		}
		if (value instanceof Date) {
			return ((Date) (value)).getTime();
		}
		throw new ClassCastException("Can't convert to Long value the type " + value.getClass());

	}

	public static Integer toInteger(Object value) {
		if (value == null || "".equals(value)) {
			return null;
		}
		if (value instanceof String) {
			return Integer.valueOf((String) value);
		}
		if (value instanceof Number) {
			return ((Number) (value)).intValue();
		}
		throw new ClassCastException("Can't convert to Integer value the type " + value.getClass());

	}

	public static int toInt(Object value, IAttributeType<?> type) {
		return toInt(value, type, 0);

	}

	public static int toInt(Object value, IAttributeType<?> type, int defaultValue) {
		if (value == null || "".equals(value)) {
			if (type != null && type.getDefaultValue() != null) {
				return (Integer) type.getDefaultValue();
			}
			return defaultValue;
		}
		if (value instanceof String) {
			return Integer.valueOf((String) value);
		}
		if (value instanceof Integer) {
			return (Integer) (value);
		}
		throw new ClassCastException("Can't convert to Integer value the type " + value.getClass());

	}

	public static URL toURL(Object value) throws MalformedURLException {
		if (value instanceof String) {
			try {
				return new URL((String) value);
			} catch (Throwable e) {
				return null;
			}
		}
		return (URL) value;
	}

	public static Boolean toBoolean(ItemDelta item, BooleanAttributeType key, Boolean defaultValue) {
		Object value = item.getAttribute(key);
		if (value == null || "".equals(value)) {
			return defaultValue;
		}
		Boolean ret = toBoolean(value);
		if (ret == null) {
			return defaultValue;
		}
		return ret;
	}

	public static java.util.UUID toUUID(Object value) {
		if (value == null || "".equals(value)) {
			return null;
		}
		if (value instanceof UUID) {
			return (UUID) value;
		}
		if (value instanceof String) {
			try {
				return UUID.fromString(value.toString());
			} catch (IllegalArgumentException e) {
			}
		}
		return null;
	}

	public static <X extends Enum<X>> X toEnum(Object value, EnumAttributeType<X> type, X defaultV) {
		if (value == null) {
			X ret = type.getDefaultValue();
			;
			if (ret == null) {
				ret = defaultV;
			}
			return ret;
		}
		if (value == null) {
			value = defaultV;
		}
		try {
			return type.toEnum(value);
		} catch (Throwable t) {
		}
		X ret = type.getDefaultValue();
		;
		if (ret == null) {
			ret = defaultV;
		}
		return ret;
	}

	public static boolean equals(String v1, String v2) {
		if (v1 == null && v2 == null) {
			return true;
		}
		if (v1 != null && v2 != null && v1.length() == v2.length() && v1.equals(v2)) {
			return true;
		}
		return false;
	}

	public static <T> boolean equals(T v1, T v2) {
		if (v1 == null && v2 == null) {
			return true;
		}
		if (v1 != null && v2 != null && v1.equals(v2)) {
			return true;
		}
		return false;
	}


	public static List<Integer> toArray(int[] compatibleVersions) {
		if (compatibleVersions == null)
			return Collections.emptyList();
		ArrayList<Integer> ret = new ArrayList<Integer>(compatibleVersions.length);
		for (int i = 0; i < compatibleVersions.length; i++) {
			ret.add(compatibleVersions[i]);
		}
		return ret;
	}

	

}
