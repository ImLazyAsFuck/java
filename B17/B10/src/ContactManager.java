import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContactManager{
    private Set<Contact> contacts = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = new Contact(name, phoneNumber);
        if (contacts.contains(newContact)) {
            System.out.println("Error: Phone number already exists!");
        } else {
            contacts.add(newContact);
            System.out.println("Contact added successfully!");
        }
    }

    public void removeContact() {
        System.out.print("Enter phone number to delete: ");
        String phoneNumber = scanner.nextLine();

        Contact contactToRemove = null;
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contactToRemove = c;
                break;
            }
        }

        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    public void searchContact() {
        System.out.print("Enter phone number to search: ");
        String phoneNumber = scanner.nextLine();

        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Contact found: " + c);
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            System.out.println("Contact List:");
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: addContact(); break;
                case 2: removeContact(); break;
                case 3: searchContact(); break;
                case 4: displayContacts(); break;
                case 5: System.out.println("Exiting..."); System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.menu();
    }
}
