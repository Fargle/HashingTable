/**
 * Created by iancampbell on 3/12/17.
 */
public class LinkedList {
private Linknode head = null;

    public class Linknode {
        private Record record;
        private Linknode next;

        public Linknode() {
            record = null;
            next = null;
        }
    }

    // inserts node at front
    public void insertFront(Record record) {
        Linknode currNode = new Linknode();
        Record cpyRec = new Record(record);
        currNode.record = cpyRec;
        currNode.next = head;
        head = currNode;
    }
    public void printAllNodes(){
        Linknode currnode = new Linknode();
        currnode = head;
        do {
            System.out.println(currnode.record.getData());
        }while(currnode.next != null);
    }
}