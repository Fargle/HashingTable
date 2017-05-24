import java.util.Scanner;
import java.io.File;

/**
 * Created by iancampbell on 3/12/17.
 */
public class p5 {
    public static void main(String[] args){
        HashTable table = new HashTable();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to HashTable; The menu below lists the operations that can be executed");
        System.out.println("For inserting new Records via file: type 1");
        System.out.println("For inserting a Record via keyboard: type 2");
        System.out.println("For deleting a Record via its key value: type 3");
        System.out.println("For searching via key value: type 4");
        System.out.println("To clear all Records: type 5");
        System.out.println("To save all contents of the hash table: type 6");
        System.out.println("To quit: type 7");
        while(scan.hasNextInt()){
            int menuChoice = scan.nextInt();
            if(menuChoice == 1){
                System.out.println("Please type the fileName exactly as it looks");
                String file = scan.nextLine();
                try {
                    Scanner fileRead = new Scanner(new File(file));
                    while(fileRead.hasNext()){
                        int key = fileRead.nextInt();
                        String data = fileRead.next();
                        Record record = new Record(key, data);
                        table.insert(record);
                    }
                }catch(Exception e){
                    System.err.println("FILE NOT FOUND");
                }
            }
            if(menuChoice == 2){
                System.out.println("On the same line, type the key value followed by a space and then the data");
                int key = scan.nextInt();
                String data = scan.next();
                Record record = new Record(key, data);
                table.insert(record);
            }
            if(menuChoice == 6){
                table.printAll();
            }
        }

    }
}
