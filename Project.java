public class Project {

    /*
    All the attributes for Project class
    All set to private
    As we'll be using setter and getter methods.
    */

    private int projectNumber;
    private String projectName;
    private String building;
    private String physicalAddress;
    private int ERF;
    private int totalFee;
    private int paid_to_date;
    private String deadline;


    // All these setter and getter methods are for the Project class

    // Getter method for the ProjectNumber
    public int getProjectNumber() {
        System.out.println("Project Number: ");
        return projectNumber;
    }

    // Setter method for the ProjectNumber
    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }

    // Getter method for the ProjectName
    public String getProjectName() {
        System.out.println("\nProject Name: ");
        return projectName;
    }

    // Setter method for the ProjectName
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    // Getter method for the Building
    public String getBuilding() {
        System.out.println("\nBuilding: ");
        return building;
    }

    // Setter method for the Building
    public void setBuilding(String building) {
        this.building = building;
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

    // Getter method for the ERF
    public int getERF() {
        System.out.println("\nERF number: ");
        return ERF;
    }

    // Setter method for the ERF
    public void setERF(int ERF) {
        this.ERF = ERF;
    }

    // Getter method for the TotalFee
    public int getTotalFee() {
        System.out.println("\nTotal Fee: ");
        return totalFee;
    }

    // Setter method for the TotalFee
    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    // Getter method for the Paid_to_date
    public int getPaid_to_date() {
        System.out.println("\nAmount paid to date: ");
        return paid_to_date;
    }

    // Setter method for the Paid_to_date
    public void setPaid_to_date(int paid_to_date) {
        this.paid_to_date = paid_to_date;
    }

    // Getter method for the Deadline
    public String getDeadline() {
        System.out.println("\nDeadline to completion: ");
        return deadline;
    }

    // Setter method for the Deadline
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
