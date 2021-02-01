package kata.kyu7.getFullName;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName).trim();
    }

}
