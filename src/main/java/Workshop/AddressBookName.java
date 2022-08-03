package Workshop;

public class AddressBookName {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressBookName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AddressBookName{" +
                "name='" + name + '\'' +
                '}';
    }
}
