import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private final String name;
    private final LocalDate dateOfBirth;
    private final String gender;
    private final transient String socialSecurityNumber;
//    private final Pet pet;

    public Person(final String name, final LocalDate dateOfBirth, final String gender, final String socialSecurityNumber) {
        System.out.println("Created person!");

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.socialSecurityNumber = socialSecurityNumber;
//        this.pet = new Pet("Betsy");
    }


    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("Reading person!");
        in.defaultReadObject();
    }


}
