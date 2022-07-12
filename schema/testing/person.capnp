@0xd2b030febae69765;

using Java = import "java.capnp";
$Java.package("testing.capnp");
$Java.outerClassname("PersonCapnp");

struct Person {
  name @0 :Text;
  id @1: Int32;

  email @2 :Text;
  phones @3 :List(PhoneNumber);

  struct PhoneNumber {
    number @0 :Text;
    type @1 :Type;

    enum Type {
      mobile @0;
      home @1;
      work @2;
    }
  }
}
