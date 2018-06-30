/**
   A doubly-linked implementation of the ADT list.

   @author Frank M. Carrano
   @author Joseph Erickson
   @version 4.0
 */
public class DoublyLList<T> implements ListInterface<T>
{
	private Node firstNode; // Reference to first node
	private int  numberOfEntries;

	public DoublyLList()
	{
		initializeDataFields();
	} // end default constructor

	public final void clear() // Note the final method
	{
		initializeDataFields();
	} // end clear

	public void add(T newEntry)				// OutOfMemoryError possible
	{
		Node newNode = new Node(newEntry);

		if (isEmpty())
			firstNode = newNode;
		else								// Add to end of non-empty list
		{
			Node lastNode = getNodeAt(numberOfEntries);
			lastNode.setNextNode(newNode);	// Make last node reference new node
			newNode.setPreviousNode(lastNode);
		} // end else

		numberOfEntries++;
	}  // end add

	public void add(int newPosition, T newEntry) // OutOfMemoryError possible
	{
		if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1))
		{
			Node newNode = new Node(newEntry);

			if (newPosition == 1)				// Case 1
			{
				newNode.setNextNode(firstNode);
				if (firstNode != null)
					firstNode.setPreviousNode(newNode);
				firstNode = newNode;
			} // end if
			else								// Case 2: List is not empty
			{									// and newPosition > 1
				Node nodeBefore = getNodeAt(newPosition - 1);
				Node nodeAfter = nodeBefore.getNextNode();
				newNode.setNextNode(nodeAfter);
				newNode.setPreviousNode(nodeBefore);
				nodeBefore.setNextNode(newNode);
				if (nodeAfter != null)
					nodeAfter.setPreviousNode(newNode);
			} // end else

			numberOfEntries++;
		} // end if
		else
			throw new IndexOutOfBoundsException("Illegal position given to add operation.");
	} // end add

	public T remove(int givenPosition)
	{
		T result = null;							// Return value

		if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
		{
			assert !isEmpty();

			if (givenPosition == 1)					// Case 1: Remove first entry
			{
				result = firstNode.getData();		// Save entry to be removed
				firstNode = firstNode.getNextNode();
				firstNode.setPreviousNode(null);
			} // end if
			else									// Case 2: Not first entry
			{
				Node nodeBefore = getNodeAt(givenPosition - 1);
				Node nodeToRemove = nodeBefore.getNextNode();
				
				if(givenPosition == numberOfEntries)
				{
					nodeToRemove.setNextNode(null);
				}
				else
				{
				Node nodeAfter = nodeToRemove.getNextNode();
				}
				result = nodeToRemove.getData();				
				
			} // end else

			numberOfEntries--;
			return result;
		} // end if
		else
			throw new IndexOutOfBoundsException("Illegal position given to remove operation.");
	} // end remove

	public T replace(int givenPosition, T newEntry)
	{
		if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
		{   
			assert !isEmpty();

			Node desiredNode = getNodeAt(givenPosition);
			T originalEntry = desiredNode.getData();
			desiredNode.setData(newEntry);
			return originalEntry;
		} // end if
		else
			throw new IndexOutOfBoundsException("Illegal position given to replace operation.");
	} // end replace

	public T getEntry(int givenPosition)
	{
		if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
		{
			assert !isEmpty();
			return getNodeAt(givenPosition).getData();
		} // end if
		else
			throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
	} // end getEntry

	public boolean contains(T anEntry)
	{
		boolean found = false;
		Node currentNode = firstNode;

		while (!found && (currentNode != null))
		{
			if (anEntry.equals(currentNode.getData()))
				found = true;
			else
				currentNode = currentNode.getNextNode();
		} // end while

		return found;
	} // end contains

	public int getLength()
	{
		return numberOfEntries;
	} // end getLength

	public boolean isEmpty()
	{
		boolean result;

		if (numberOfEntries == 0) // Or getLength() == 0
		{
			assert firstNode == null;
			result = true;
		} // end if
		else
		{
			assert firstNode != null;
			result = false;
		} // end else

		return result;
	} // end isEmpty

	public T[] toArray()
	{
		// The cast is safe because the new array contains null entries
		@SuppressWarnings("unchecked")
		T[] result = (T[])new Object[numberOfEntries];	// Unchecked cast

		int index = 0;
		Node currentNode = firstNode;
		while ((index < numberOfEntries) && (currentNode != null))
		{
			result[index] = currentNode.getData();
			currentNode = currentNode.getNextNode();
			index++;
		} // end while

			return result;
	} // end toArray

	// Initializes the class's data fields to indicate an empty list.
	private void initializeDataFields()
	{
		firstNode = null;
		numberOfEntries = 0;
	} // end initializeDataFields

	// Returns a reference to the node at a given position.
	// Precondition: List is not empty;
	//               1 <= givenPosition <= numberOfEntries
	private Node getNodeAt(int givenPosition)
	{
		assert !isEmpty() && (1 <= givenPosition) && (givenPosition <= numberOfEntries);
		Node currentNode = firstNode;

		// Traverse the chain to locate the desired node
		// (skipped if givenPosition is 1)
		for (int counter = 1; counter < givenPosition; counter++)
			currentNode = currentNode.getNextNode();

		assert currentNode != null;

		return currentNode;
	} // end getNodeAt

	private class Node
	{
		private T    data;		// Entry in list
		private Node next;		// Link to next node
		private Node previous;	// Link to previous node

		private Node(T dataPortion)
		{
			data = dataPortion;
			next = null;
			previous = null;
		} // end constructor

		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
			previous = null;
		} // end constructor

		private T getData()
		{
			return data;
		} // end getData

		private void setData(T newData)
		{
			data = newData;
		} // end setData

		private Node getNextNode()
		{
			return next;
		} // end getNextNode

		private void setNextNode(Node nextNode)
		{
			next = nextNode;
		} // end setNextNode

		private Node getPreviousNode()
		{
			return previous;
		} // end getPreviousNode

		private void setPreviousNode(Node previousNode)
		{
			previous = previousNode;
		} // end setPreviousNode
	} // end Node
} // end DoublyLList