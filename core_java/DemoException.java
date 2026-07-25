
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }

}

class Age {
    // private int age;

    // public Age(int age) {
    //     this.age = age;
    // }
    public void checkAge(int age) throws InvalidAgeException {
        if (age >= 18) {
            System.out.println("Access Granted");
        } else if (age < 18) {
           throw new InvalidAgeException("Age must be 18 or older");
        }
    }
}

public class DemoException {

    public static void main(String[] args) {
        Age a = new Age();

        try {
            a.checkAge(10);
        } catch (Exception ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }
}
