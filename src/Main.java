import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final String file = "person.txt";

        Person p1 = new Person("Michael"
                , LocalDate.of(1960, 5, 5)
                , "M"
                , "1122334455");

        // Write object to file
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(p1);
//        objectOutputStream.flush();
//        objectOutputStream.close();

        // Read object from file
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();

        // Print object references
        System.out.println(p1);
        System.out.println(p2);

    }
}