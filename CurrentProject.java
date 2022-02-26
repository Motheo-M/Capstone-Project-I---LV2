// Imported scanner module
import javax.swing.*;

// Class
public class CurrentProject {
    public static void main(String[] args) {

        // Project Input Details
        // Allows user to enter the data for each question asked

        // Project Number
        int numProject = Integer.parseInt(JOptionPane.showInputDialog
                ("What project number is this?"));
        // Project Name
        String nameProject = JOptionPane.showInputDialog("""
                What is project name?
                If no name is provided, the name should be the clients name
                + the building being built. E.g. Building.""");
        // Type of building
        String buildingProject = JOptionPane.showInputDialog
                ("What type of building is being built?");
        // Physical address of new building
        String physical_addressProject = JOptionPane.showInputDialog
                ("What is the physical address of the project building?");
        // ERF Number of building
        int erfProject = Integer.parseInt(JOptionPane.showInputDialog
                ("What is the ERF number of the building?"));
        // Total Fee for project
        int total_feeProject = Integer.parseInt(JOptionPane.showInputDialog
                ("What is the total cost of the project?"));
        // Fee paid to date for project
        int paid_to_dateProject = Integer.parseInt(JOptionPane.showInputDialog
                ("What is the cost paid so far for the project to date?"));
        // Project deadline
        String deadlineProject = JOptionPane.showInputDialog
                ("When is the project deadline?");

        /*
        Project details
        We call the Project constructor here
        */
        Project Building = new Project();

        // The fields with the necessary data inputs for the Project class
        Building.setProjectNumber(numProject);
        Building.setProjectName(nameProject);
        Building.setBuilding(buildingProject);
        Building.setPhysicalAddress(physical_addressProject);
        Building.setERF(erfProject);
        Building.setTotalFee(total_feeProject);
        Building.setPaid_to_date(paid_to_dateProject);
        Building.setDeadline(deadlineProject);

        // Architect details
        // Allows user to enter the data for each question asked

        // Architect's name
        String nameArchitect = JOptionPane.showInputDialog
                ("What is the name of the Architect?");
        // Architect's telephone number
        String telephoneArchitect = JOptionPane.showInputDialog
                ("What is the phone number of the Architect?");
        // Architect's email address
        String emailArchitect = JOptionPane.showInputDialog
                ("What is the email address of the Architect?");
        // Architect's physical address
        String physical_addressArchitect = JOptionPane.showInputDialog
                ("What is the physical address of the Architect?");

        // We call the Architect constructor here
        Architect Designer = new Architect();

        // We've set the fields with the necessary data for Architect class
        Designer.setName(nameArchitect);
        Designer.setTelephoneNumber(telephoneArchitect);
        Designer.setEmail(emailArchitect);
        Designer.setPhysicalAddress(physical_addressArchitect);

        // Contractor details
        // Allows user to enter the data for each question asked

        // Contractor's name
        String nameContractor = JOptionPane.showInputDialog
                ("What is the name of the Contractor?");
        // Contractor's telephone number
        String telephoneContractor = JOptionPane.showInputDialog
                ("What is the phone number of the Contractor?");
        // Contractor's email address
        String emailContractor = JOptionPane.showInputDialog
                ("What is the email address of the Contractor?");
        // Contractor's physical address
        String physical_addressContractor = JOptionPane.showInputDialog
                ("What is the physical address of the Contractor?");

        // We call the Contractor constructor here
        Contractor Builder = new Contractor();

        // We've set the fields with the necessary data for Contractor class
        Builder.setName(nameContractor);
        Builder.setTelephoneNumber(telephoneContractor);
        Builder.setEmail(emailContractor);
        Builder.setPhysicalAddress(physical_addressContractor);

        // Customer details
        // Allows user to enter the data for each question asked

        // Customer's name
        String nameCustomer = JOptionPane.showInputDialog
                ("What is the name of the Customer?");
        // Customer's telephone number
        String telephoneCustomer = JOptionPane.showInputDialog
                ("What is the phone number of the Customer?");
        // Customer's email address
        String emailCustomer = JOptionPane.showInputDialog
                ("What is the email address of the Customer?");
        // Customer's physical address
        String physical_addressCustomer = JOptionPane.showInputDialog
                ("What is the physical address of the Customer?");

        // We call the Customer constructor here
        Customer Homeowner = new Customer();

        // We've set the fields with the necessary data for Customer class
        Homeowner.setName(nameCustomer);
        Homeowner.setTelephoneNumber(telephoneCustomer);
        Homeowner.setEmail(emailCustomer);
        Homeowner.setPhysicalAddress(physical_addressCustomer);

        // Print out the information of the Project
        System.out.println("Project:\n");
        System.out.println(Building.getProjectNumber());
        System.out.println(Building.getProjectName());
        System.out.println(Building.getBuilding());
        System.out.println(Building.getPhysicalAddress());
        System.out.println(Building.getERF());
        System.out.println(Building.getTotalFee());
        System.out.println(Building.getPaid_to_date());
        System.out.println(Building.getDeadline());

        // Prints out the information of the Architect
        System.out.println("\n\nArchitect:\n");
        System.out.println(Designer.getName());
        System.out.println(Designer.getTelephoneNumber());
        System.out.println(Designer.getEmail());
        System.out.println(Designer.getPhysicalAddress());

        // Prints out the information of the Contractor


        // Prints out the information of the Customer
        System.out.println("\n\nCustomer:\n");
        System.out.println(Homeowner.getName());
        System.out.println(Homeowner.getTelephoneNumber());
        System.out.println(Homeowner.getEmail());
        System.out.println(Homeowner.getPhysicalAddress());

        // Ask if user wants to change the deadline of the project
        String choice = JOptionPane.showInputDialog("""
                Do you want to change the deadline of the project?
                Yes - Enter Y
                No - Enter N:
                """);

        /*
        If statement
        Used to change the deadline and amount paid so far for project
        */
        if (choice.equals("Y")) {
            // Enter the new deadline for the project
            String date = JOptionPane.showInputDialog
                    ("Enter a new deadline: \n");
            Building.setDeadline(date);

            // Prints out the information of the Project
            System.out.println("\n\nProject:\n");
            System.out.println(Building.getProjectNumber());
            System.out.println(Building.getProjectName());
            System.out.println(Building.getBuilding());
            System.out.println(Building.getPhysicalAddress());
            System.out.println(Building.getERF());
            System.out.println(Building.getTotalFee());
            System.out.println(Building.getPaid_to_date());
            System.out.println(Building.getDeadline());
        }

        // Ask if user wants to change the fee paid so far for the project
        String fee = JOptionPane.showInputDialog("""
                Do you want to update the total fee paid so far?
                Yes - Enter Y
                No - Enter N:
                """);

        // If statement
        if (fee.equals("Y")) {
            // Enter the new fee paid so far for the project
            int paidFee = Integer.parseInt(JOptionPane.showInputDialog
                    ("Enter new updated fee paid so far: \n"));
            Building.setPaid_to_date(paidFee);

            // Print out the information of the Project
            System.out.println("\n\nProject:\n");
            System.out.println(Building.getProjectNumber());
            System.out.println(Building.getProjectName());
            System.out.println(Building.getBuilding());
            System.out.println(Building.getPhysicalAddress());
            System.out.println(Building.getERF());
            System.out.println(Building.getTotalFee());
            System.out.println(Building.getPaid_to_date());
            System.out.println(Building.getDeadline());
        }

        // Ask if user wants to change the contractors contact details
        String details = JOptionPane.showInputDialog("""
                Do you want to update the contractors details?
                Yes - Enter Y
                No - Enter N:
                """);

        /*
        If statement
        Used to change the contractors phone number and email address
        */
        if (details.equals("Y")) {
            // Ask if user wants to change the contractors phone numbers
            String telephone = JOptionPane.showInputDialog("""
                    Do you want to update the contractors phone number?
                    Yes - Enter Y
                    No - Enter N:
                    """);

            // If statement for phone number
            if (telephone.equals("Y")){
                // Ask the user to enter the contractors new phone numbers
                String number = JOptionPane.showInputDialog
                        ("Enter new phone numbers: \n");
                Builder.setTelephoneNumber(number);
            }

            // Ask if user wants to change the contractors email address
            String email = JOptionPane.showInputDialog("""
                    Do you want to update the contractors email?
                    Yes - Enter Y
                    No - Enter N:
                    """);

            if (email.equals("Y")){
                // Ask the user to enter the contractors new email address
                String address = JOptionPane.showInputDialog
                        ("Enter new email address: \n");
                Builder.setEmail(address);
            }

            // Print out the information of the Contractor
            System.out.println("\n\nContractor:\n");
            System.out.println(Builder.getName());
            System.out.println(Builder.getTelephoneNumber());
            System.out.println(Builder.getEmail());
            System.out.println(Builder.getPhysicalAddress());
        }
    }
}


/* Reference
Task 6 - Just to recall what I learnt

https://www.freecodecamp.org/news/java-getters-and-setters/#:~:
text=Getters%20and%20setters%20are%20used,sets%20or%20updates%20its%20value.

https://www.geeksforgeeks.org/getter-and-setter-in-java/

http://www.cs.utsa.edu/~cs3443/uml/uml.html
*/

