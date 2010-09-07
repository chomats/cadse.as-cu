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
package fr.imag.adele.cadse.core;

import fr.imag.adele.cadse.core.attribute.IAttributeType;

/**
 * This implementation of a string builder make easy way to manage text
 * indentation.
 * 
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class GenStringBuilder {

	/** The Constant TABS. */
	static public final char[][]	TABS	= { {}, { '\t' }, { '\t', '\t' }, { '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t' }, { '\t', '\t', '\t', '\t', '\t' }, { '\t', '\t', '\t', '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t', '\t', '\t', '\t' }, { '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t' },
			{ '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t' } };

	/**
	 * Instantiates a new string builder for generation of source code content.
	 */
	public GenStringBuilder() {
		_sb = new StringBuilder();
	}

	/** The sb. */
	protected StringBuilder	_sb;

	/** The tabs. */
	protected int						tabs		= 0;

	/** The DEBUG. */
	public boolean			DEBUG		= false;

	protected boolean			_appenTab	= false;

	/**
	 * Begin.
	 */
	public void begin() {
		tabs++;

	}

	/**
	 * End.
	 */
	public void end() {
		if (tabs == 0) {
			System.err.println("GenStringBuilder : tabs < 0");
			// to print stack trace
			try {
				throw new Throwable("GenStringBuilder : tabs < 0");
			} catch (Throwable e) {
				e.printStackTrace();
			}
		} else {
			tabs--;
		}
	}

	/**
	 * Newline.
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder newline() {
		_sb.append("\n");
		_appenTab = true;
		return this;
	}

	protected void appendTab() {
		if (!_appenTab) {
			return;
		}
		_appenTab = false;
		if (tabs < TABS.length) {
			_sb.append(TABS[tabs]);
		} else {
			_sb.ensureCapacity(_sb.length() + tabs);
			for (int i = 0; i < tabs; i++) {
				_sb.append('\t');
			}
		}
	}

	/**
	 * Append.
	 * 
	 * @param b
	 *            the b
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(boolean b) {
		appendTab();
		_sb.append(b);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param c
	 *            the c
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(char c) {
		appendTab();
		_sb.append(c);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param str
	 *            the str
	 * @param offset
	 *            the offset
	 * @param len
	 *            the len
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(char[] str, int offset, int len) {
		appendTab();
		_sb.append(str, offset, len);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param str
	 *            the str
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(char[] str) {
		appendTab();
		_sb.append(str);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param s
	 *            the s
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(CharSequence s, int start, int end) {
		appendTab();
		_sb.append(s, start, end);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param s
	 *            the s
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(CharSequence s) {
		appendTab();
		_sb.append(s);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param d
	 *            the d
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(double d) {
		appendTab();
		_sb.append(d);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param f
	 *            the f
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(float f) {
		appendTab();
		_sb.append(f);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param i
	 *            the i
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(int i) {
		appendTab();
		_sb.append(i);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param lng
	 *            the lng
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(long lng) {
		appendTab();
		_sb.append(lng);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param obj
	 *            the obj
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(Object obj) {
		appendTab();
		_sb.append(obj);
		return this;
	}

	/**
	 * Append.
	 * 
	 * @param str
	 *            the str
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append(String str) {
		appendTab();
		_sb.append(str);
		return this;
	}

	/**
	 * Append code point.
	 * 
	 * @param codePoint
	 *            the code point
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendCodePoint(int codePoint) {
		appendTab();
		_sb.appendCodePoint(codePoint);
		return this;
	}

	/**
	 * Capacity.
	 * 
	 * @return the int
	 */
	public int capacity() {
		return _sb.capacity();
	}

	/**
	 * Char at.
	 * 
	 * @param index
	 *            the index
	 * 
	 * @return the char
	 */
	public char charAt(int index) {
		return _sb.charAt(index);
	}

	/**
	 * Code point at.
	 * 
	 * @param index
	 *            the index
	 * 
	 * @return the int
	 */
	public int codePointAt(int index) {
		return _sb.codePointAt(index);
	}

	/**
	 * Code point before.
	 * 
	 * @param index
	 *            the index
	 * 
	 * @return the int
	 */
	public int codePointBefore(int index) {
		return _sb.codePointBefore(index);
	}

	/**
	 * Code point count.
	 * 
	 * @param beginIndex
	 *            the begin index
	 * @param endIndex
	 *            the end index
	 * 
	 * @return the int
	 */
	public int codePointCount(int beginIndex, int endIndex) {
		return _sb.codePointCount(beginIndex, endIndex);
	}

	/**
	 * Delete.
	 * 
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder delete(int start, int end) {
		_sb.delete(start, end);
		return this;
	}

	/**
	 * Delete char at.
	 * 
	 * @param index
	 *            the index
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder deleteCharAt(int index) {
		_sb.deleteCharAt(index);
		return this;
	}

	/**
	 * Ensure capacity.
	 * 
	 * @param minimumCapacity
	 *            the minimum capacity
	 */
	public void ensureCapacity(int minimumCapacity) {
		_sb.ensureCapacity(minimumCapacity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return _sb.equals(obj);
	}

	/**
	 * Gets the chars.
	 * 
	 * @param srcBegin
	 *            the src begin
	 * @param srcEnd
	 *            the src end
	 * @param dst
	 *            the dst
	 * @param dstBegin
	 *            the dst begin
	 * 
	 * @return the chars
	 */
	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		_sb.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return _sb.hashCode();
	}

	/**
	 * Index of.
	 * 
	 * @param str
	 *            the str
	 * @param fromIndex
	 *            the from index
	 * 
	 * @return the int
	 */
	public int indexOf(String str, int fromIndex) {
		return _sb.indexOf(str, fromIndex);
	}

	/**
	 * Index of.
	 * 
	 * @param str
	 *            the str
	 * 
	 * @return the int
	 */
	public int indexOf(String str) {
		return _sb.indexOf(str);
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param b
	 *            the b
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, boolean b) {
		_sb.insert(offset, b);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param c
	 *            the c
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, char c) {
		_sb.insert(offset, c);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param index
	 *            the index
	 * @param str
	 *            the str
	 * @param offset
	 *            the offset
	 * @param len
	 *            the len
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int index, char[] str, int offset, int len) {
		_sb.insert(index, str, offset, len);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param str
	 *            the str
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, char[] str) {
		_sb.insert(offset, str);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param dstOffset
	 *            the dst offset
	 * @param s
	 *            the s
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int dstOffset, CharSequence s, int start, int end) {
		_sb.insert(dstOffset, s, start, end);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param dstOffset
	 *            the dst offset
	 * @param s
	 *            the s
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int dstOffset, CharSequence s) {
		_sb.insert(dstOffset, s);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param d
	 *            the d
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, double d) {
		_sb.insert(offset, d);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param f
	 *            the f
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, float f) {
		_sb.insert(offset, f);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param i
	 *            the i
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, int i) {
		_sb.insert(offset, i);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param l
	 *            the l
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, long l) {
		_sb.insert(offset, l);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param obj
	 *            the obj
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, Object obj) {
		_sb.insert(offset, obj);
		return this;
	}

	/**
	 * Insert.
	 * 
	 * @param offset
	 *            the offset
	 * @param str
	 *            the str
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder insert(int offset, String str) {
		_sb.insert(offset, str);
		return this;
	}

	/**
	 * Last index of.
	 * 
	 * @param str
	 *            the str
	 * @param fromIndex
	 *            the from index
	 * 
	 * @return the int
	 */
	public int lastIndexOf(String str, int fromIndex) {
		return _sb.lastIndexOf(str, fromIndex);
	}

	/**
	 * Last index of.
	 * 
	 * @param str
	 *            the str
	 * 
	 * @return the int
	 */
	public int lastIndexOf(String str) {
		return _sb.lastIndexOf(str);
	}

	/**
	 * Length.
	 * 
	 * @return the int
	 */
	public int length() {
		return _sb.length();
	}

	/**
	 * Offset by code points.
	 * 
	 * @param index
	 *            the index
	 * @param codePointOffset
	 *            the code point offset
	 * 
	 * @return the int
	 */
	public int offsetByCodePoints(int index, int codePointOffset) {
		return _sb.offsetByCodePoints(index, codePointOffset);
	}

	/**
	 * Replace.
	 * 
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * @param str
	 *            the str
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder replace(int start, int end, String str) {
		_sb.replace(start, end, str);
		return this;
	}

	/**
	 * Reverse.
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder reverse() {
		_sb.reverse();
		return this;
	}

	/**
	 * Sets the char at.
	 * 
	 * @param index
	 *            the index
	 * @param ch
	 *            the ch
	 */
	public void setCharAt(int index, char ch) {
		_sb.setCharAt(index, ch);
	}

	/**
	 * Sets the length.
	 * 
	 * @param newLength
	 *            the new length
	 */
	public void setLength(int newLength) {
		_sb.setLength(newLength);
	}

	/**
	 * Sub sequence.
	 * 
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * 
	 * @return the char sequence
	 */
	public CharSequence subSequence(int start, int end) {
		return _sb.subSequence(start, end);
	}

	/**
	 * Substring.
	 * 
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * 
	 * @return the string
	 */
	public String substring(int start, int end) {
		return _sb.substring(start, end);
	}

	/**
	 * Substring.
	 * 
	 * @param start
	 *            the start
	 * 
	 * @return the string
	 */
	public String substring(int start) {
		return _sb.substring(start);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return _sb.toString();
	}

	/**
	 * Trim to size.
	 */
	public void trimToSize() {
		_sb.trimToSize();
	}

	/**
	 * Decrement length.
	 */
	public void decrementLength() {
		if (_sb.charAt(_sb.length() - 1) == ',') {
			_sb.setLength(_sb.length() - 1);
		}
	}

	/**
	 * Append string value_vir.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendStringValue_vir(String value) {
		_sb.ensureCapacity(_sb.length() + value.length() + 3);
		appendTab();
		_sb.append('\"').append(value).append('\"').append(',');
		return this;
	}

	/**
	 * Append string value.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendStringValue(String value) {
		if (value == null) {
			append("null");
			return this;
		}
		_sb.ensureCapacity(_sb.length() + value.length() + 2);
		value = value.replace("\"", "\\\"");
		value = value.replace("\\", "\\\\");
		appendTab();
		_sb.append('\"').append(value).append('\"');
		return this;
	}

	/**
	 * Append int value_vir.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendIntValue_vir(String value) {
		_sb.ensureCapacity(_sb.length() + value.length() + 1);
		appendTab();
		_sb.append(value).append(',');
		return this;
	}

	/**
	 * Append exp value_vir.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendExpValue_vir(String value) {
		_sb.ensureCapacity(_sb.length() + value.length() + 1);
		appendTab();
		_sb.append(value).append(',');
		return this;
	}

	/**
	 * Append new value.
	 * 
	 * @param value
	 *            the value
	 * @param vir
	 *            the vir
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendNewValue(String value, boolean vir) {
		appendTab();
		if (value == null) {
			_sb.append(" null");
		} else {
			value = getlastclassName(value);
			_sb.ensureCapacity(_sb.length() + value.length() + 8);
			_sb.append(" new ").append(value).append("()");
		}
		if (vir) {
			_sb.append(",");
		}
		return this;
	}

	/**
	 * Append new begin.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendNewBegin(String value) {
		appendTab();
		if (value == null) {
			_sb.append(" null");
		} else {
			value = getlastclassName(value);
			_sb.ensureCapacity(_sb.length() + value.length() + 8);
			_sb.append(" new ").append(value).append("(");
		}
		return this;
	}

	/**
	 * Append new end.
	 * 
	 * @param value
	 *            the value
	 * @param vir
	 *            the vir
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendNewEnd(String value, boolean vir) {
		if (value == null) {
		} else {
			appendTab();
			_sb.append(")");
		}
		if (vir) {
			appendTab();
		}
		_sb.append(",");
		return this;
	}

	/**
	 * Append new value.
	 * 
	 * @param value
	 *            the value
	 * @param vir
	 *            the vir
	 * @param param
	 *            the param
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendNewValue(String value, boolean vir, String param) {
		appendTab();
		if (value == null) {
			_sb.append(" null");
		} else {
			value = getlastclassName(value);
			_sb.ensureCapacity(_sb.length() + value.length() + 8);
			_sb.append(" new ").append(value).append("(").append(param).append(")");
		}
		if (vir) {
			_sb.append(",");
		}
		return this;
	}

	/**
	 * Gets the lastclass name.
	 * 
	 * @param value
	 *            the value
	 * 
	 * @return the lastclass name
	 */
	private String getlastclassName(String value) {
		int index = value.lastIndexOf('.');
		if (index == -1) {
			return value;
		}
		return value.substring(index + 1);
	}

	/**
	 * Append_exp_vir.
	 * 
	 * @param item
	 *            the item
	 * @param key
	 *            the key
	 * @param defaultValue
	 *            the default value
	 * 
	 * @return the gen string builder
	 */
	public <T> GenStringBuilder append_exp_vir(Item item, IAttributeType<T> key, T defaultValue) {
		Object v = item.getAttributeWithDefaultValue(key, defaultValue);
		appendExpValue_vir(v.toString());
		return this;
	}

	/**
	 * Append_string_vir.
	 * 
	 * @param item
	 *            the item
	 * @param key
	 *            the key
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder append_string_vir(Item item, IAttributeType<String> key) {
		Object v = item.getAttributeWithDefaultValue(key, "");
		appendStringValue(v.toString());
		append(",");
		return this;
	}

	/**
	 * Append generated tag.
	 * 
	 * @return the gen string builder
	 */
	public GenStringBuilder appendGeneratedTag() {
		newline().append("/**");
		newline().append("\t@generated");
		newline().append("*/");
		return this;
	}

}
