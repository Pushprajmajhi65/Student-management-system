public class Dropout extends Student {
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    //Constructor
    public Dropout(String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int enrollmentID,
                   String courseName, String dateOfEnrollment, int numOfRemainingModules,
                   int numOfMonthsAttended, String dateOfDropout)
    {
        //calling parent class constructor
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);

        //Assigning the value
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended=numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;  //setting default value of remainingAmount to 0
        this.hasPaid = false;  //setting default value of hasPaid to false
    }

    //Accessor
    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }

    public int getNumOfMonthsAttended() {
        return numOfMonthsAttended;
    }

    public String getDateOfDropout() {
        return dateOfDropout;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }

    public boolean getHasPaid() {
        return hasPaid;
    }

    // Method for bills payable
    public void billsPayable() {
        remainingAmount = (getCourseDuration()/30- getNumOfMonthsAttended()) * getTuitionFee();
        System.out.println("Pending Tuition fees: " + remainingAmount);
        hasPaid = true;
    }

    //Method to remove data of the object students
    public void removeStudent() {
        if (hasPaid) {
            setDateOfBirth("");
            setCourseName("");
            setStudentName("");
            setDateOfEnrollment("");
            setCourseDuration(0);
            setTuitionFee(0);
            setEnrollmentID(0);
            numOfRemainingModules = 0;
            numOfMonthsAttended = 0;
            remainingAmount = 0;
            dateOfDropout = "";
        } else {
            System.out.println("All bills not cleared");
        }
    }

    //Method to display details of Parent class and Dropout class
    public void display() {
        super.display();
        System.out.println("The number of remaining modules: "+ getNumOfRemainingModules());
        System.out.println("The numbers of month attended: "+ getNumOfMonthsAttended());
        System.out.println("The date of Dropout: "+ getDateOfDropout());
        System.out.println("The remaining amount: "+ getRemainingAmount());
    }


}


