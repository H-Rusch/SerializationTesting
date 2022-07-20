package testing.json;

public class PhoneNumberJSON {

    private String number;
    private PhoneTypeJSON type;

    public PhoneNumberJSON() {
    }

    public PhoneNumberJSON(String number, PhoneTypeJSON type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public PhoneTypeJSON getType() {
        return type;
    }
}
