public class Regular extends Student {
    private int numOfModules;
    private int numOfCreditHours;
    private int daysPresent;
    private boolean isGrantedScholarship;

    public Regular(String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int enrollmentID,
                   String courseName, String dateOfEnrollment, int numOfModules, int numOfCreditHours, int daysPresent)
    {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
       super.setEnrollmentID(enrollmentID);
       super.setCourseName(courseName);
       super.setDateOfEnrollment(dateOfEnrollment);
        //assigning parameters
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }

    //Accessor

    public int getNumOfModules() {
        return numOfModules;
    }

    public int getNumOfCreditHours() {
        return numOfCreditHours;
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public boolean isGrantedScholarship() {
        return isGrantedScholarship;
    }

    //Method to get present percentage
    public double presentPercentage(int daysPresent) {
        double presentPercentage = ( daysPresent / (double)getCourseDuration() )*100 ;
        char attendanceGrade='E';
        if (presentPercentage >= 80) {
            this.isGrantedScholarship = true;
            attendanceGrade = 'A';
        }
        else if (presentPercentage >= 60) {
            attendanceGrade = 'B';
        } else if (presentPercentage >= 40) {
            attendanceGrade = 'C';
        } else if (presentPercentage >= 20) {
            attendanceGrade = 'D';
        } else if (presentPercentage>100) {
            System.out.println("Error Occurred! Please check your input again.");
        } else {
            attendanceGrade = 'E';
        }
        return presentPercentage;
    }

    //Method to grant certificate
    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment){
        System.out.println("The student has Graduated successfully.");
        System.out.println("Course: " + courseName);
        System.out.println("Enrollment ID: " + enrollmentID);
        System.out.println("Date of Enrollment: " + dateOfEnrollment);
        if (isGrantedScholarship== true){
            System.out.println("The scholarship has been granted.");
        }
        else  {
            System.out.println("Sorry, the scholarship has not been granted.");
        }

    }

    //Method to display details of Regular and Parent class
    public void






    display() {
        super.display();
        System.out.println("Number of Modules: " + getNumOfModules());
        System.out.println("Number of Credit: " + getNumOfCreditHours());
        System.out.println("Days Present: " + getDaysPresent());
    }

}
