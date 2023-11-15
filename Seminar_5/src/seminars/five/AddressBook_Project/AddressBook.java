package seminars.five.AddressBook_Project;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(int index, Contact updatedContact) {
        if (index >= 0 && index < contacts.size()) {
            contacts.set(index, updatedContact);
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
        }
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }
}
