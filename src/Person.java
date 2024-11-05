import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate dateOfBirth;
    private final Gender gender;

//    @Serial
//    private static final long serialVersionUID = 1L;

    public Person(final String name, final LocalDate dateOfBirth, final Gender gender) {
        System.out.println("Hello World from constructor person!");

//        if (Gender.ALIEN.equals(gender)) {
//            throw new IllegalArgumentException("Alien no longer supported");
//        }

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

//

    public enum Gender {
        MALE,
        FEMALE,
        UNSPECIFIED,
        ALIEN
    }

//    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
//        System.out.println("Reading person!");
//        in.defaultReadObject();
//    }

}
