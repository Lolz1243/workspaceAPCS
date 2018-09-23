import java.util.Iterator;

/**
    Implements a singly-linked list.
    
    @author  Nikhil Vytla
    @version 12/5/17
    
    @author  Period - 1
    @author  Assignment - Singly-LinkedList JMCh20_4
    
    @author  Sources - Maria & Gary Litvin
 */
public class SinglyLinkedList<E> implements Iterable<E>
{
    private ListNode<E> head;
    private int nodeCount;

    // Constructor: creates an empty list
    public SinglyLinkedList()
    {
        head = null;
        nodeCount = 0;
    }

    /**
        Constructor: creates a list that contains all elements from the
        array values, in the same order
        @param values  array containing all elements for this list
     */
    public SinglyLinkedList(E[] values)
    {
        ListNode<E> tail = null;
        for (E value : values) // for each value to insert
        {
            ListNode<E> node = new ListNode<E>(value, null);
            if (head == null)
                head = node;
            else
                tail.setNext(node);
            tail = node;    // update tail
        }

        nodeCount = values.length;
    }

    /**
        Return true if this list is empty; otherwise returns false.
        @return true if this list is empty; otherwise returns false.
     */
    public boolean isEmpty()
    {
        return nodeCount == 0;
    }

    /**
        Returns the number of elements in this list.
        @return  number of elements in this list.
     */
    public int size()
    {
        return nodeCount;
    }

    /**
        Returns true if this list contains an Object equal to obj; otherwise returns false.
        @return true if this list contains an Object equal to obj
     */
    public boolean contains(Object obj)
    {
        for(ListNode<E> node = head; node != null; node = node.getNext())
        {
            Object value = node.getValue();
            
            if(value.equals( obj ))
            {
                return true;
            }
        }
        
        return false;
    }

    /**
        Returns the index of the first Object equal to obj; if not found,
        returns -1.

        @param obj  Object to find
        @return  the index of the first Object in equal to obj; if not found,
                  returns -1.
     */
    public int indexOf(Object obj)
    {
    	int count = 0;
    	
        for(ListNode<E> node = head; node != null; node = node.getNext())
        {
            Object value = node.getValue();
            
            if(value.equals(obj))
            {
                return count;
            }
            
            count++;
        }

        return -1;
    }

    /**
        Adds obj to this collection.  Returns true if successful;
        otherwise returns false.
        
        @param obj  element to add to this collection
        @return  true if successful; otherwise returns false.
     */
    public boolean add(E obj)
    {
    	if(nodeCount == 0)
    	{
    		head = new ListNode<E>(obj, null);
    		
    		nodeCount++;
    		return true;
    	}
    	
    	ListNode<E> node1 = head;
    	
    	while(node1.getNext() != null)
    	{
    		node1 = node1.getNext();
    	}
    	
    	node1.setNext(new ListNode<E>(obj, null));
    	nodeCount++;
    	return true;
    }

    /**
        Removes the first element that is equal to obj, if any.
        Returns true if successful; otherwise returns false.

        @param obj  element to remove
        @return  true if successful; otherwise returns false.
     */
    public boolean remove(E obj)
    {
    	try
    	{
    		this.remove(indexOf(obj));
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    }

    /**
        Returns the i-th element.

        @param i  element to get from the list
        @return element at index i
        @throws IndexOutOfBoundsException 
     */
    public E get(int i)
    {
    	int a = 0;
    	
    	for (E x : this)
    	{
    		if(a == i)
    		{
    			return x;
    		}
    		else
    		{
    			a++;
    		}
    	}
    	
    	throw new IndexOutOfBoundsException();
    }

    /**
        Replaces the i-th element with obj and returns the old value.
        
        @param i index of element to replace
        @param obj replacement element of element at index i
        @return old value previously located at index i
        @throws IndexOutOfBoundsException 
     */
    public E set(int i, E obj)
    {
    	ListNode<E> node1 = head;
    	
    	if(i >= nodeCount || i < 0)
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	
    	for(int j = 0; j < i; j++)
    	{
    		node1 = node1.getNext();
    	}
    	
    	E val = node1.getValue();
    	node1.setValue(obj);
    	node1.setNext(node1.getNext());
    	
    	return val;
    }

    /**
        Inserts obj to become the i-th element. Increments the size
        of the list by one.
        
        @param i  insertion point in list for obj
        @param obj element to insert into list
        @throws IndexOutOfBoundsException 
     */
    public void add(int i, E obj)
    {
    	ListNode<E> node1 = head;
    	
    	if(i > nodeCount || i < 0)
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	
    	if(this.size() == 0)
    	{
    		head = (new ListNode<E>(obj, null));
    	}
    	else
    	{
        	for(int j = 0; j < i; j++)
        	{
        		node1 = node1.getNext();
        	}
        	
        	node1.setNext(new ListNode<E>(obj, null));
    	}
    	
    	nodeCount++;

    }

    /**
        Removes the i-th element and returns its value.
        Decrements the size of the list by one.

        @param i index of element to remove
        @return element removed from this list
     */
    public E remove(int i)
    {
    	ListNode<E> node1 = head;
    	
    	if(i >= nodeCount || i < 0)
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	
    	if(i == 0)
    	{
    		nodeCount -= 1;
    		E val = head.getValue();
    		head.setValue(null);
    		return val;
    	}
    	
    	for(int j = 0; j < i-1; j++)
    	{
    		node1 = node1.getNext();
    	}
    	
    	E nextVal = node1.getNext().getValue();
    	
    	node1.setNext(node1.getNext().getNext());
    	nodeCount -= 1;
    	
    	return nextVal;
    }

    /**
        Returns a string representation of this list.
        @return  a string representation of this list.
     */
    public String toString()
    {
    	String string = null;
    	
    	for(E x : this)
    	{
    		string += x.toString() + ", ";
    	}
    	
    	return string;
    }

    /**
        Returns an iterator for this collection.
        @return  an iterator for this collection.
     */
    public Iterator<E> iterator()
    {
        return new SinglyLinkedListIterator<E>(head);
    }
}

