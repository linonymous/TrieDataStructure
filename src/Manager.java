import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Swapnil.Walke on 6/2/2017.
 */
public class Manager {
    public static void main(String []args)throws Exception{
        FileReader file = new FileReader("C:\\Users\\Swapnil.Walke\\IdeaProjects\\Personal\\src\\input.in");
        BufferedReader br = new BufferedReader(file);
        String line;
        Trie tree = new Trie(new Node("*"));
        while((line = br.readLine())!=null){
            String []str = line.split(">");
            for(int i=0; i<str.length; i++){
                str[i] = str[i].trim();
            }
            tree.addNode(str);
        }
    }
}
