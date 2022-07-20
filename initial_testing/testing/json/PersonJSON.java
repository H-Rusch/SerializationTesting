package testing.json;

import java.util.List;

public class PersonJSON {

    private String name;
    private int id;
    private String email;
    private List<PhoneNumberJSON> phones;

    public PersonJSON() {
    }

    public PersonJSON(String name, int id, String email, List<PhoneNumberJSON> phones) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public List<PhoneNumberJSON> getPhones() {
        return phones;
    }
}
