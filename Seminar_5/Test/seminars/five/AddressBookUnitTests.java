package seminars.five;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.five.AddressBook_Project.*;

import java.util.List;

public class AddressBookUnitTests {
    private AddressBook addressBook;

    @BeforeEach
    public void setUp() {
        addressBook = new AddressBook();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("John Doe", "john@example.com", "1234567890");
        addressBook.addContact(contact);

        List<Contact> contacts = addressBook.getAllContacts();
        Assertions.assertEquals(1, contacts.size());
        Assertions.assertEquals(contact, contacts.get(0));
    }

    @Test
    public void testEditContact() {
        Contact contact = new Contact("John Doe", "john@example.com", "1234567890");
        addressBook.addContact(contact);

        Contact updatedContact = new Contact("John Smith", "john@example.com", "9876543210");
        addressBook.editContact(0, updatedContact);

        List<Contact> contacts = addressBook.getAllContacts();
        Assertions.assertEquals(1, contacts.size());
        Assertions.assertEquals(updatedContact, contacts.get(0));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("John Doe", "john@example.com", "1234567890");
        addressBook.addContact(contact);

        addressBook.deleteContact(0);

        List<Contact> contacts = addressBook.getAllContacts();
        Assertions.assertEquals(0, contacts.size());
    }

    @Test
    public void testGetAllContacts() {
        Contact contact1 = new Contact("John Doe", "john@example.com", "1234567890");
        Contact contact2 = new Contact("Jane Smith", "jane@example.com", "9876543210");
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        List<Contact> contacts = addressBook.getAllContacts();
        Assertions.assertEquals(2, contacts.size());
        Assertions.assertEquals(contact1, contacts.get(0));
        Assertions.assertEquals(contact2, contacts.get(1));
    }
}
