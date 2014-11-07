package ccallee.graph;
import java.util.Iterator;

public class graphNode
{
    private Function key;
    private List<graphNode> inEdges;
    private List<graphNode> outEdges;

    public graphNode(Function key)
    {
        this.key = key;
        inEdges = new List<graphNode>();
        outEdges = new List<graphNode>();
    }

    public void addEdgeTo(graphNode other)
    {
        Node<graphNode> temp = new Node<graphNode>(other);
        outEdges.insertAtEnd(temp);
    }

    public void addEdgeFrom(graphNode other)
    {
        Node<graphNode> temp = new Node<graphNode>(other);
        inEdges.insertAtEnd(temp);
    }

    public Iterator<graphNode> outEdgeIterator()
    {
        return outEdges.iterator();
    }

    public Function getKey()
    {
        return this.key;
    }
}
