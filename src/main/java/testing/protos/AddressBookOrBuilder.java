// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package testing.protos;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tutorial.PersonProtos people = 1;</code>
   */
  java.util.List<PersonProtos>
      getPeopleList();
  /**
   * <code>repeated .tutorial.PersonProtos people = 1;</code>
   */
  PersonProtos getPeople(int index);
  /**
   * <code>repeated .tutorial.PersonProtos people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .tutorial.PersonProtos people = 1;</code>
   */
  java.util.List<? extends PersonProtosOrBuilder>
      getPeopleOrBuilderList();
  /**
   * <code>repeated .tutorial.PersonProtos people = 1;</code>
   */
  PersonProtosOrBuilder getPeopleOrBuilder(
      int index);
}
