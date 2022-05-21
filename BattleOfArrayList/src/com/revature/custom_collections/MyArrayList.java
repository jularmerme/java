package com.revature.custom_collections;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
	
	// Fields
	protected int size;
	protected Object[] elements;
	
	// Constructors
	public MyArrayList() {
		elements = new Object[16];
	}
	
	public MyArrayList(int initialCapacity) {
		elements = new Object[initialCapacity];
	}
	
	/*
	 * Appends the specified element to the end of this list.
	 * 
	 * @param element => the element to be appended to this list
	 * @return true (true/false, default return should be true)
	 * 
	 * 
	 * 
	 */

	@Override
	public boolean add(T element) {
		elements[size] = element;
		size++;
		resizeBackingArrayIfNeeded();
		return true;
	}

	/**
     * Returns true if this list contains the specified element. More formally,
     * returns true if and only if this list contains at least one element e
     * such that (o==null ? e==null : o.equals(e)).
     *
     * @param element element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
	@Override
	public boolean contains(T element) {
		for(int i=0; i<=size; i++) {
			if(elements[i] == null) {
				if(element == null) {
					return true;
				}
			} else if(elements[i].equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Returns true if this list contains no elements
	 * @return true if this list contains no elements
	 */
	@Override
	public boolean empty() {
		return size == 0;
	}

	/**
     * Removes the first occurrence of the specified element from this list, if it is present.
     * If this list does not contain the element, it is unchanged. More formally, removes the
     * element with the lowest index i such that (o==null ? get(i)==null : o.equals(get(i)))
     * (if such an element exists). Returns true if this list contained the specified element.
     *
     * @param element element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
	@Override
	public boolean remove(T element) {
		for(int i=0; i<size; i++) {
			if(elements[i] == null & element == null || (elements[i] != null && elements[i].equals(element)));
			removeAtIndex(i);
			size--;
			return true;
		}
		return false;
	}
	
	/*
	 * Returns the number of elements in this list
	 * @Returns the number of elements in this list
	 */
	@Override
	public int size() {
		return size;
	}
	
	/*
	 * Returns the element at the specified position in this list
	 * 
	 * @param index of the element to return
	 * @return the element at the specified position in this list
	 * @throws IndexOutOfBoundsException if the index is out of range
	 * (index < 0 || index >= size())
	 */
	@Override
	@SuppressWarnings({"unchecked"})
	public T get(int index) {
		if(notInRange(index)) {
			throw new IndexOutOfBoundsException();
		}
		return (T) elements[index];
	}

	/*
	 * 
	 * the element currently at the position (if any) and any subsequent elements
	 * to the right(adds to their indices)
	 * 
	 * @params index at which the specified element is to be inserted
	 * @param element => element to be inserted
	 * @throws IndexOutOfBoundsException if the index is out of range
	 * (index < 0 || index > size())
	 */
	@Override
	public void add(int index, T element) {
		if(index < 0 || index > size) throw new IndexOutOfBoundsException();
		Object[] newElements = resizeWillBeNeeded(size + 1) ? new Object[nextSize()] : new Object[elements.length];
		System.arraycopy(elements, 0, newElements, 0, index);
		System.arraycopy(elements, index, newElements, index + 1, elements.length - index - 1);
		newElements[index] = element;
		size++;
		elements = newElements;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * Returns the index of the first occurrence of the specified element in this list
	 * or -1 if this list does not contain the element. More formally, returns the lowest index i such that that (o==null ? get(i)==null : o.equals(get(i))), or -1 there is no such index
	 * 
	 *  @param element -> element to search for
	 *  @return the index of the first ocurrence of the specified element in this  
	 *  list, or -1 if this list does not contain the element
	 */
	@Override
	public int lastIndexOf(T element) {
		for(int i = size; i >= 0; i++) {
			if((elements[i] == null && element == null) || (elements[i].equals(element))) {
				return i;
			}
		}
		return 0;
	}
	
	protected boolean notInRange(int index) {
		return index < 0 || index >= size;
	}
	
	protected void resizeBackingArrayIfNeeded() {
		if (size >= elements.length * 0.75) {
			Object[] newBackingArray = new Object[nextSize()];
			System.arraycopy(elements, 0, newBackingArray, 0, elements.length);
			elements = newBackingArray;
		}
	}
	
	protected boolean resizeWillBeNeeded(int nextSize) {
		return (nextSize >= elements.length * 0.75); 
	}
	
	protected int nextSize() {
		return (int) (elements.length * 0.5) + elements.length;
	}
	
	private void removeAtIndex(int index) {
		if(index == 0) {
			Object[] nextElements = new Object[elements.length];
			System.arraycopy(elements, 1, nextElements, 0, elements.length - 2);
			elements = nextElements;
		} else if(index == size() - 1) {
			elements[index] = null;
		} else {
			Object[] newElements = new Object[elements.length];
			System.arraycopy(elements, 0, newElements, 0, index);
			System.arraycopy(elements, index + 1, newElements, index, elements.length - index - 1);
			elements = newElements;
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(elements);
	}
	
}
