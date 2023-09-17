public class Student { //instaNCE variable
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;

    //constructor with parameterized initialization of some data members
    public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee) {
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
        this.courseName = "";
        this.dateOfEnrollment = "";
        this.enrollmentID = 0;
    }

    //Getter methods to access private data members
    public int getEnrollmentID() {
        return this.enrollmentID;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public String getDateOfEnrollment() {
        return this.dateOfEnrollment;
    }

    public int getCourseDuration() {
        return this.courseDuration;
    }

    public int getTuitionFee() {
        return this.tuitionFee;
    }

    //Setter methods to modify private data members

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    //Display Method to display the details of a Student

    public void display() {
        //check if all necessary data members have values, if not, display error message

        if (enrollmentID == 0 || dateOfBirth.isEmpty() || studentName.isEmpty() || courseName.isEmpty() ||
                dateOfEnrollment.isEmpty() || tuitionFee== 0 || courseDuration==0) {
            System.out.println("Some parameter are missing.");
        }

        System.out.println("Enrollment ID: " + getEnrollmentID());
        System.out.println("Date-of-Birth: " + getDateOfBirth());
        System.out.println("Course-Name: " + getCourseName());
        System.out.println("Student-Name: " + getStudentName());
        System.out.println("Years-Enrolled: " + getDateOfEnrollment());
        System.out.println("Course_Duration: " + getCourseDuration());
        System.out.println("Tuition-fee: " + getTuitionFee());

    }

}