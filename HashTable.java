import com.sun.prism.impl.Disposer;
import sun.awt.image.ImageWatched;

/**
 * Created by iancampbell on 3/12/17.
 */
public class HashTable {
    private LinkedList[] hashList;
    private int size = 0;

    public HashTable(){
        hashList = new LinkedList[178000];
        for(int i = 0; i<178000; i++) {
            hashList[i] = new LinkedList();
        }
    }

    private int hash(Record data){
        return 0;
    }

    private int hash(int key){
        return 0;
    }

    public void insert(Record data){
        hashList[size].insertFront(data);
        size++;
     }

     public void printAll(){
        for(int i = 0; i < size; i++){
            hashList[i].printAllNodes();
        }
     }

}
