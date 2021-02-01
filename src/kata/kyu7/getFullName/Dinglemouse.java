package kata.kyu7.getFullName;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        firstName = firstName;
        lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
