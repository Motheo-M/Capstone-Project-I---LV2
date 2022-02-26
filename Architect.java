public class Architect {

    /*
    All the attributes for Architect class
    All set to private
    As we'll be using setter and getter methods.
    */

    private String name;
    private String telephoneNumber;
    private String email;
    private String physicalAddress;

    // All these setter and getter methods are for the Architect class

    // Getter method for the Name
    public String getName() {
        System.out.println("Name: ");
        return name;
    }

    // Setter method for the Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the TelephoneNumber
    public String getTelephoneNumber() {
        System.out.println("\nTelephone Number: ");
        return telephoneNumber;
    }

    // Setter method for the TelephoneNumber
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    // Getter method for the Email
    public String getEmail() {
        System.out.println("\nEmail: ");
        return email;
    }

    // Setter method for the Email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method for the PhysicalAddress
    public String getPhysicalAddress() {
        System.out.println("\nPhysical Address: ");
        return physicalAddress;
    }

    // Setter method for the PhysicalAddress
    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }
}
