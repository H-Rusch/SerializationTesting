namespace java com.example.tutorial.thrift

enum PhoneTypeThrift {
    MOBILE,
    HOME,
    WORK
}

struct PhoneNumberThrift {
    1: optional string number;
    2: optional PhoneTypeThrift type = PhoneTypeThrift.HOME;
}

struct PersonThrift {
    1: optional string name;
    2: optional i32 id;
    3: optional string email;
    4: list<PhoneNumberThrift> phones;
}

struct AddressBookThrift {
    1: list<PersonThrift> people;
}