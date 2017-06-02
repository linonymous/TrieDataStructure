import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Swapnil.Walke on 6/1/2017.
 */
public class Trie {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    Trie(Node root){
        this.root = root;
    }

    public void addNode(String []str){
        Node troot = this.root;
        LinkedList<Node> que = troot.getChildren();
        for(int i=0; i<str.length; i++){
            Node node = new Node(str[i]);
            int found = que.indexOf(node);
            if(found == -1){
                //element not found
                node.setParent(troot);
                que.addLast(node);
                troot.setChildren(que);
                que = node.getChildren();
                troot = node;
            }else{
                //element found
                troot = que.get(found);
                troot.setCount(troot.getCount()+1);
                que = troot.getChildren();
            }
        }
        while(troot.getParent()!=null){
            System.out.println("Data : " + troot.getData() + " count " + troot.getCount());
            troot = troot.getParent();
        }
        this.root = troot;
    }
}
