import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Main {

    /*
    1. Interface + JavaDoc + runtime vs compile time
    2. Accessors??
    3. Magic + imperative
    4. Data consistency
     */

    private static final String file = "person.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p1 = new Person("Michael"
                , LocalDate.of(1960, 5, 5)
                , Person.Gender.MALE);

        // Naar bestand schrijven
        serializePerson(p1);
        System.out.println(p1);

        // Uit bestand lezen
        Person p2 = deserializePerson();
        System.out.println(p2);

//        Files.delete(Path.of(file));
    }


    private static void serializePerson(Person p1) throws IOException {
        // Write object to file
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p1);
        objectOutputStream.flush();
        objectOutputStream.close();
    }


    private static Person deserializePerson() throws IOException, ClassNotFoundException {
        // Read object from file
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();
        return p2;
    }


}