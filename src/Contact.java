/**
 * The Contact class represents a contact with a first name, last name and a phone number
 */
public class Contact {
    // The contact's first name
    String firstName;
    // The contact's last name
    String lastName;
    // The contact's phone number
    String phoneNumber;

    /**
     * Constructs a new Contact with the given first and last names and the phone number
     * @param firstName the first name of the contact
     * @param lastName  the last name of the contact
     * @param phoneNumber the contact's phone number
     */
    public Contact(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.phoneNumber = phoneNumber;
    }

}
