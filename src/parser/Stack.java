package ccallee.parser;

import ccallee.graph.*;
/*
 * A Generic stack data structure
 */
public class Stack<T>
{
    private List<T> myList;

    public Stack()
    {
        this.myList = new List<T>();
    }

    public void push(T t)
    {
        myList.insertAtHead(new Node<T>(t));
    }

    public T pop()
    {
        return myList.deleteAtHead().getKey();
    }

    public boolean isEmpty()
    {
        return myList.getHead() == null;
    }
}
