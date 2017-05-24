/**
 * Created by iancampbell on 3/22/17.
 */
public class Record {
    private int key;
    private String data;

    public Record(int newKey, String newData){
        key = newKey;
        data = newData;
    }

    public Record(Record rec){
        this.data = rec.data;
        this.key = rec.key;
    }

    public String getData(){
        return data;
    }

}
