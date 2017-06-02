import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Swapnil.Walke on 6/1/2017.
 */
public class Node {
    private String data;
    private Node parent;
    private LinkedList<Node> children;
    private Integer count;

    @Override
    public boolean equals(Object o) {
        return (this.data.equals(((Node)o).data));
    }

    Node(String data){
        this.data = data;
        this.parent = null;
        this.count = 1;
        this.children = new LinkedList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public LinkedList<Node> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<Node> children) {
        this.children = children;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
