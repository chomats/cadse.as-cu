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
 */

package fr.imag.adele.cadse.core.util;

import java.lang.reflect.Array;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The Class ArraysUtil.
 * 
 * @author <a href="mailto:stephane.chomat@imag.fr">Stephane Chomat</a>
 */
public class ArraysUtil {

	/**
	 * Merge.
	 * 
	 * @param clazz
	 *            the clazz (not null)
	 * @param one
	 *            the one (not null)
	 * @param two
	 *            the two (not null)
	 * 
	 * @return the t[]
	 */
	public static <T> T[] merge(Class<T> clazz, T[] one, T[] two) {
		T[] ret = (T[]) Array.newInstance(clazz, one.length + two.length);
		System.arraycopy(one, 0, ret, 0, one.length);
		System.arraycopy(two, 0, ret, one.length, two.length);
		return ret;
	}

	/**
	 * Adds the list.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param array
	 *            the array
	 * @param addObject
	 *            the add object. Ne peut pas etre null
	 * 
	 * @return the t[]
	 */
	public static <T> T[] addList(Class<T> clazz, T[] array, T[] addObject) {
		if (addObject == null || addObject.length == 0) {
			// In an ideal world, we would do an assertion here
			// to help developers know they are probably doing
			// something wrong
			return array;
		}
		if (array == null) {
			// if this is the first listener added,
			// initialize the lists
			T[] ret = (T[]) Array.newInstance(clazz, addObject.length);
			System.arraycopy(addObject, 0, ret, 0, addObject.length);

			return ret;
		} else {
			// Otherwise copy the array and add the new listener
			int i = array.length;
			T[] tmp = (T[]) Array.newInstance(clazz, i + addObject.length);
			System.arraycopy(array, 0, tmp, 0, i);
			System.arraycopy(addObject, 0, tmp, i, addObject.length);

			return tmp;
		}
	}

	public static <T> T[] addList2(Class<T> clazz, T[] array, T... addObject) {
		if (addObject == null || addObject.length == 0) {
			// In an ideal world, we would do an assertion here
			// to help developers know they are probably doing
			// something wrong
			return array;
		}
		if (array == null) {
			// if this is the first listener added,
			// initialize the lists
			T[] ret = (T[]) Array.newInstance(clazz, addObject.length);
			System.arraycopy(addObject, 0, ret, 0, addObject.length);

			return ret;
		} else {
			// Otherwise copy the array and add the new listener
			int i = array.length;
			T[] tmp = (T[]) Array.newInstance(clazz, i + addObject.length);
			System.arraycopy(array, 0, tmp, 0, i);
			System.arraycopy(addObject, 0, tmp, i, addObject.length);

			return tmp;
		}
	}

	/**
	 * Adds the list.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param array
	 *            the array
	 * @param addObject
	 *            the add object
	 * 
	 * @return the t[]
	 */
	public static <T> T[] addList(Class<T> clazz, T[] array, List<T> addObject) {
		if (addObject == null || addObject.size() == 0) {
			// In an ideal world, we would do an assertion here
			// to help developers know they are probably doing
			// something wrong
			return array;
		}
		if (array == null) {
			// if this is the first listener added,
			// initialize the lists
			T[] ret = (T[]) Array.newInstance(clazz, addObject.size());
			ret = addObject.toArray(ret);
			return ret;
		} else {
			// Otherwise copy the array and add the new listener
			int i = array.length;
			T[] tmp = (T[]) Array.newInstance(clazz, i + addObject.size());
			System.arraycopy(array, 0, tmp, 0, i);

			for (int j = 0; j < addObject.size(); j++, i++) {
				tmp[i] = addObject.get(j);
			}

			return tmp;
		}
	}

	/**
	 * Adds the.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param array
	 *            the array
	 * @param l
	 *            the l
	 * 
	 * @return the t[]
	 */
	static public <T> T[] add(Class<T> clazz, T[] array, T l) {
		if (l == null) {
			// In an ideal world, we would do an assertion here
			// to help developers know they are probably doing
			// something wrong
			return array;
		}

		if (array == null) {
			// if this is the first listener added,
			// initialize the lists
			T[] ret = (T[]) Array.newInstance(clazz, 1);
			ret[0] = l;
			return ret;
		} else {
			// Otherwise copy the array and add the new listener
			int i = array.length;
			T[] tmp = (T[]) Array.newInstance(clazz, i + 1);
			System.arraycopy(array, 0, tmp, 0, i);

			tmp[i] = l;

			return tmp;
		}
	}

	/**
	 * Adds the.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param array
	 *            the array
	 * @param l
	 *            the l
	 * 
	 * @return the t[]
	 */
	static public int[] add(int[] array, int l) {

		if (array == null) {
			// if this is the first listener added,
			// initialize the lists
			int[] ret = new int[1];
			;
			ret[0] = l;
			return ret;
		} else {
			// Otherwise copy the array and add the new listener
			int i = array.length;
			int[] tmp = new int[i + 1];
			System.arraycopy(array, 0, tmp, 0, i);
			tmp[i] = l;
			return tmp;
		}
	}

	/**
	 * Adds the.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param array
	 *            the array
	 * @param l
	 *            the l
	 * 
	 * @return the t[]
	 */
	static public int[] add(int[] array, int[] l) {
		if (l == null) {
			return array;
		}

		if (array == null) {
			// if this is the first listener added,
			// initialize the lists
			return l.clone();
		} else {
			// Otherwise copy the array and add the new listener
			int i = array.length;
			int[] tmp = new int[i + l.length];
			System.arraycopy(array, 0, tmp, 0, i);
			System.arraycopy(l, 0, tmp, i, l.length);
			return tmp;
		}
	}

	/**
	 * Adds the.
	 * 
	 * @param clazz
	 *            the clazz
	 * @param array
	 *            the array
	 * @param l
	 *            the l
	 * @parem index position � mettre l'�l�ment � copier
	 * 
	 * @return the t[]
	 */
	static public <T> T[] add(Class<T> clazz, T[] array, T l, int index) {
		if (l == null) {
			// In an ideal world, we would do an assertion here
			// to help developers know they are probably doing
			// something wrong
			return array;
		}

		if (array == null) {
			if (index != 0) {
				throw new NoSuchElementException();
			}

			// if this is the first listener added,
			// initialize the lists
			T[] ret = (T[]) Array.newInstance(clazz, 1);
			ret[0] = l;
			return ret;
		} else {
			// Otherwise copy the array and add the new listener
			int i = array.length;
			if (index < -1 || index > i) {
				throw new NoSuchElementException();
			}
			T[] tmp = (T[]) Array.newInstance(clazz, i + 1);

			if (index == 0) {
				System.arraycopy(array, 0, tmp, 1, i);
			} else if (index == i) {
				System.arraycopy(array, 0, tmp, 0, i);
			} else {
				System.arraycopy(array, 0, tmp, 0, index);
				System.arraycopy(array, index, tmp, index + 1, i - index);
			}

			tmp[index] = l;

			return tmp;
		}
	}

	/**
	 * Removes the listener as a listener of the specified type.
	 * 
	 * @param l
	 *            the listener to be removed
	 * @param clazz
	 *            the clazz
	 * @param array
	 *            the array
	 * 
	 * @return the t[]
	 */
	static public <T> T[] remove(Class<T> clazz, T[] array, T l) {
		if (l == null) {
			// In an ideal world, we would do an assertion here
			// to help developers know they are probably doing
			// something wrong
			return array;
		}
		if (array == null) {
			return array;
		}

		// Is l on the list?
		int index = indexOfEquals(array, l);
		return remove(clazz, array, index);
	}

	public static <T> T[] remove(Class<T> clazz, T[] array, int index, int count) {
		// If so, remove it
		if (index != -1) {
			if (array.length == count) {
				return null;
			}

			T[] tmp = (T[]) Array.newInstance(clazz, array.length - count);
			// Copy the list up to index
			System.arraycopy(array, 0, tmp, 0, index);
			// Copy from two past the index, up to
			// the end of tmp (which is two elements
			// shorter than the old list)
			if (index < tmp.length) {
				System.arraycopy(array, index + count, tmp, index, tmp.length - index + 1 - count);
			}

			return tmp;
		}
		return array;
	}

	public static <T> T[] remove(Class<T> clazz, T[] array, int index) {
		// If so, remove it
		if (index != -1) {
			if (array.length == 1) {
				return null;
			}

			T[] tmp = (T[]) Array.newInstance(clazz, array.length - 1);
			// Copy the list up to index
			System.arraycopy(array, 0, tmp, 0, index);
			// Copy from two past the index, up to
			// the end of tmp (which is two elements
			// shorter than the old list)
			if (index < tmp.length) {
				System.arraycopy(array, index + 1, tmp, index, tmp.length - index);
			}
			// set the listener array to the new array or null
			return tmp;
		}
		return array;
	}

	public static int[] remove(int[] array, int index) {
		// If so, remove it
		if (index != -1) {
			if (array.length == 1) {
				return null;
			}

			int[] tmp = new int[array.length - 1];
			// Copy the list up to index
			System.arraycopy(array, 0, tmp, 0, index);
			// Copy from two past the index, up to
			// the end of tmp (which is two elements
			// shorter than the old list)
			if (index < tmp.length) {
				System.arraycopy(array, index + 1, tmp, index, tmp.length - index);
			}
			// set the listener array to the new array or null
			return tmp;
		}
		return array;
	}

	/**
	 * Inverser.
	 * 
	 * @param array
	 *            the array
	 */
	public static <T> void inverser(T[] array) {

		int l = array.length;
		int mid = l / 2;
		l--;
		for (int i = 0; i < mid; i++) {
			T tmp = array[i];
			array[i] = array[l - i];
			array[l - i] = tmp;
		}
	}

	/**
	 * Return l'index de l � partir de la fin du tableau en utilisant le
	 * comparateur ==
	 * 
	 * @param <T>
	 *            Le type du tableau
	 * @param array
	 *            le tableau qui peut etre null
	 * @param l
	 *            l'element � rechercher qui peut etre null;
	 * @return l'index de l'element ou -1 si non trouv�.
	 */
	public static <T> int indexOf(T[] array, T l) {
		if (array != null) {
			for (int i = array.length - 1; i >= 0; i -= 1) {
				if (array[i] == l) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * Return l'index de l � partir de la fin du tableau en utilisant le
	 * comparateur equals
	 * 
	 * @param <T>
	 *            Le type du tableau
	 * @param array
	 *            le tableau qui peut etre null
	 * @param l
	 *            l'element � rechercher. si l est null retourne -1.
	 * @return l'index de l'element ou -1 si non trouv�.
	 */
	public static <T> int indexOfEquals(T[] array, T l) {
		if (array != null && l != null) {
			for (int i = array.length - 1; i >= 0; i -= 1) {
				if ((array[i].equals(l) == true)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static <T> boolean move(OrderWay kind, T[] array, T e1, T e2) {
		if (e2 == e1) {
			return false;
		}

		int i1 = indexOf(array, e1);
		int i2 = indexOf(array, e2);
		if (i1 == -1) {
			throw new IllegalArgumentException("Bad object: " + e1); //$NON-NLS-1$
		}
		if (i2 == -1) {
			throw new IllegalArgumentException("Bad object: " + e2); //$NON-NLS-1$
		}
		if (kind == OrderWay.move_after) {
			if (i1 == i2 + 1) {
				return false; // nothing to do;
			}
			if (i1 < i2) {
				moveDown(array, e1, i1, i2);
			} else {
				moveUp(array, e1, i2 + 1, i1);
			}

		} else {
			if (i1 == i2 - 1) {
				return false; // nothing to do;
			}
			if (i1 < i2) {
				moveDown(array, e1, i1, i2 - 1);
			} else { // i2 < i1
				moveUp(array, e1, i2, i1);
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * Je d�cale d'un cran vers le haut du tableau les �lement allant de begin �
	 * end-1 � begin. Et met dans end, l'�l�ment e. Je met le i-1 dans le i en
	 * partant de la fin (begin) to au d�but (end)
	 * 
	 * @param <T>
	 * @param array
	 * @param e
	 * @param end
	 * @param begin
	 */
	private static <T> void moveUp(T[] array, T e, int begin, int end) {
		assert end > begin;
		for (int i = end; i > begin; i--) {
			array[i] = array[i - 1];
		}
		array[begin] = e;
	}

	/**
	 * Je d�cale d'un cran vers le bas du tableau les �lement allant de begin+1 �
	 * end. Et met dans end l'�l�ment e.
	 * 
	 * Je prend le [i+1] et le met dans le [i] en partant du d�but � la fin
	 * 
	 * @param <T>
	 * @param array
	 * @param e
	 * @param begin
	 * @param end
	 */
	private static <T> void moveDown(T[] array, T e, int begin, int end) {
		assert begin < end;
		for (int i = begin; i < end; i++) {
			array[i] = array[i + 1];
		}
		array[end] = e;
	}

	public static <T> T[] clone(T[] array) {
		if (array == null) {
			return null;
		}
		return array.clone();
	}

}
