

import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.*;
import java.awt.*;


public class StudentGUI implements ActionListener {
    // Object for regular
    private JFrame frame;
    private JPanel panel;
    private JPanel panel1;
    private JLabel StudentName;
    private JLabel EnrollmentId;
    private JLabel CourseName;
    private JLabel CourseDuration;
    private JLabel TuitionFee;
    private JLabel NumberoFModules;
    private JLabel NumberofCreditHours;
    private JLabel NumberofDaysPresent;
    private JLabel EnrollmentId1;
    private JLabel Daypresent;
    private JLabel CourseName1;
    private JLabel DOB;
    private JLabel EnrollmentId2;
    private JLabel DateofEnrollment;
    private JLabel DateofEnrollmentgrant;

    // jtext field for rrgular

    private JTextField StudentNameText;
    private JTextField EnrollmentIdText;
    private JTextField CourseNameText;
    private JTextField CourseDurationText;
    private JTextField TuitionFeeText;
    private JTextField NumberoFModulesText;
    private JTextField NumberofCreditHoursText;
    private JTextField NumberofDaysPresentText;
    private JTextField EnrollmentId1Text;
    private JTextField DaypresentText;
    private JTextField CourseName1Text;
    private JTextField EnrollmentId2Text;


    //comboBox for regular//
    private JComboBox dateOfBirthYear;
    private JComboBox dateOfBirthDay;
    private JComboBox dateOfBirthMonth;

    private JComboBox dateOfEnrollmentDayComboBox;
    private JComboBox dateOfEnrollmentMonthComboBox;
    private JComboBox dateOfEnrollmentYearComboBox;

    private JComboBox dateOfEnrollmentDaygrantComboBox;
    private JComboBox dateOfEnrollmentYeargrantComboBox;
    private JComboBox dateOfEnrollmentMonthgrantComboBox;

    //JButton for regular//
    private JButton button;
    private JButton Regular;
    private JButton addregular;
    private JButton presentpercentage;
    private JButton grantcertificate;
    private JButton display;
    private JButton clear;
    //private JButton button6;


    // Dropout object


    // Jlabel for dropout
    private JLabel studentName10Label;
    private JLabel enrollmentId10Label;
    private JLabel courseName10Label;
    private JLabel numOfMonthAttendedLabel;
    private JLabel courseDuration10Label;
    private JLabel tuitionFee10Label;
    private JLabel RemainingModules10Label;
    private JLabel EnrollmentId20;
    private JLabel EnrollmentId21;
    private JLabel dateOfBirth10Label;
    private JLabel dateOfDropout10Label;
    private JLabel dateOfEnrollmentLabel;


    private JTextField studentName10Text;
    private JTextField enrollmentId10Text;
    private JTextField courseName10Text;
    private JTextField monthsAttendedText;
    private JTextField dayPresent10Text;
    private JTextField courseDuration10Text;
    private JTextField tuitionFee10Text;
    private JTextField RemainingModules10Text;
    private JTextField EnrollmentId20Text;
    private JTextField remainingAmount10Text;
    private JTextField courseName110Text;
    private JTextField EnrollmentId21Text;


    //////comboBox for drop out///

    private JComboBox<String> dateOfBirthMonth10ComboBox;
    private JComboBox<Integer> dateOfBirthYear10ComboBox;
    private JComboBox<Integer> dateOfBirthDay10ComboBox;

    private JComboBox<String> dateOfDropoutMonth10ComboBox;
    private JComboBox<Integer> dateOfDropoutYear10ComboBox;
    private JComboBox<Integer> dateOfDropoutDay10ComboBox;


    private JComboBox<Integer> dateOfEnrollmentDay10ComboBox;
    private JComboBox<String> dateOfEnrollmentMonth10ComboBox;
    private JComboBox<Integer> dateOfEnrollmentYear10ComboBox;
    private JComboBox<String> month1;

    // button for dropout
    private JButton Dropout;
    private JButton PayBills;
    private JButton RemoveDropOut;
    private JButton Display1;
    private JButton ClearAll;


    private ArrayList<Student> studentsList;


    // for regular
    public StudentGUI() {
        frame = new JFrame("StudentGUI");
        frame.setTitle("courseWork");
        panel = new JPanel();
        panel.setBackground(new Color(185,198,235));
        panel.setSize(800, 800);
        Font labelFont = new Font("Arial", Font.BOLD, 14);
        Color textColor = new Color(20, 20, 23);




        StudentName = new JLabel("StudentName");
        StudentName.setBounds(45, 101, 100, 30);
        StudentName.setFont(labelFont);
        StudentNameText = new JTextField();
        StudentNameText.setBounds(173, 103, 150, 30);
        StudentNameText.setForeground(textColor);



        EnrollmentId = new JLabel("EnrollmentId");
        EnrollmentId.setBounds(45, 149, 100, 30);
        EnrollmentId.setFont(labelFont);
        EnrollmentIdText = new JTextField();
        EnrollmentIdText.setBounds(173, 149, 150, 30);
        EnrollmentIdText.setForeground(textColor);

        CourseName = new JLabel("CourseName");
        CourseName.setBounds(45, 250, 100, 35);
        CourseName.setFont(labelFont);
        CourseNameText = new JTextField();
        CourseNameText.setBounds(173, 250, 150, 35);
        CourseNameText.setForeground(textColor);


        CourseDuration = new JLabel("CourseDuration");
        CourseDuration.setBounds(457, 101, 120, 30);
        CourseDuration.setFont(labelFont);
        CourseDurationText = new JTextField();
        CourseDurationText.setBounds(580, 101, 150, 30);

        TuitionFee = new JLabel("TuitionFee");
        TuitionFee.setBounds(457, 149, 100, 30);
        TuitionFee.setFont(labelFont);
        TuitionFeeText = new JTextField();
        TuitionFeeText.setBounds(580, 149, 150, 30);
        TuitionFeeText.setForeground(textColor);


        NumberoFModules = new JLabel("NumberoFModules");
        NumberoFModules.setBounds(45, 350, 140, 30);
        NumberoFModules.setFont(labelFont);
        NumberoFModulesText = new JTextField();
        NumberoFModulesText.setBounds(210, 350, 150, 30);
        NumberoFModulesText.setForeground(textColor);

        NumberofCreditHours = new JLabel("No.OfCreditHours");
        NumberofCreditHours.setBounds(457, 222, 150, 30);
        NumberofCreditHours.setFont(labelFont);
        NumberofCreditHoursText = new JTextField();
        NumberofCreditHoursText.setBounds(580, 222, 150, 30);
        NumberofCreditHoursText.setForeground(textColor);


        NumberofDaysPresent = new JLabel("Number of Days Present");
        NumberofDaysPresent.setBounds(45, 310, 200, 30);
        NumberofDaysPresent.setFont(labelFont);
        NumberofDaysPresentText = new JTextField();
        NumberofDaysPresentText.setBounds(210, 315, 150, 30);
        NumberofDaysPresentText.setForeground(textColor);

        DOB = new JLabel("Date of Birth");
        DOB.setBounds(45, 210, 100, 30);
        DOB.setFont(labelFont);
        panel.add(DOB);

        String option[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        dateOfBirthMonth = new JComboBox<>(option);
        dateOfBirthMonth.setBounds(233, 210, 100, 30);
        panel.add(dateOfBirthMonth);


        dateOfBirthYear = new JComboBox();
        for (int i = 1989; i <= 2023; i++) {
            dateOfBirthYear.addItem(i);
        }
        dateOfBirthYear.setBounds(325, 210, 100, 30);
        panel.add(dateOfBirthYear);

        dateOfBirthDay = new JComboBox();
        for (int i = 1; i <= 30; i++) {
            dateOfBirthDay.addItem(i);
        }
        dateOfBirthDay.setBounds(173, 210, 70, 30);
        panel.add(dateOfBirthDay);


        DateofEnrollment = new JLabel("Date of Enrollment");
        DateofEnrollment.setBounds(425, 294, 150, 30);
        DateofEnrollment.setFont(labelFont);
        panel.add(DateofEnrollment);

        dateOfEnrollmentDayComboBox = new JComboBox<>();
        for (int i = 1; i <= 30; i++) {
            dateOfEnrollmentDayComboBox.addItem(i);
        }
        dateOfEnrollmentDayComboBox.setBounds(550, 294, 70, 30);
        panel.add(dateOfEnrollmentDayComboBox);

        String[] monthsArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        dateOfEnrollmentMonthComboBox = new JComboBox<>(monthsArray);
        dateOfEnrollmentMonthComboBox.setBounds(610, 294, 100, 30);
        panel.add(dateOfEnrollmentMonthComboBox);
        
        
        int currentYear= java.time.LocalDate.now().getYear();// // Get the current year

        dateOfEnrollmentYearComboBox = new JComboBox<>();
        for (int i = 1998; i <= currentYear+5; i++) {
            dateOfEnrollmentYearComboBox.addItem(i);
        }
        dateOfEnrollmentYearComboBox.setBounds(700, 294, 100, 30);
        panel.add(dateOfEnrollmentYearComboBox);


        EnrollmentId1 = new JLabel("EnrolmentId");
        EnrollmentId1.setBounds(31, 530, 100, 30);
        EnrollmentId1.setFont(labelFont);
        EnrollmentId1Text = new JTextField();
        EnrollmentId1Text.setBounds(120, 530, 120, 30);
        EnrollmentId1Text.setForeground(textColor);

        Daypresent = new JLabel("DaysPresent");
        Daypresent.setBounds(31, 560, 100, 30);
        Daypresent.setFont(labelFont);
        DaypresentText = new JTextField();
        DaypresentText.setBounds(120, 560, 120, 30);
        DaypresentText.setForeground(textColor);

        EnrollmentId2 = new JLabel("EnrollmentId");
        EnrollmentId2.setBounds(300, 500, 100, 30);
        EnrollmentId2.setFont(labelFont);
        EnrollmentId2Text = new JTextField();
        EnrollmentId2Text.setBounds(400, 500, 130, 30);
        EnrollmentId2Text.setBounds(400, 500, 130, 30);

        CourseName1 = new JLabel("CourseName");
        CourseName1.setBounds(300, 530, 100, 30);
        CourseName1.setFont(labelFont);
        CourseName1Text = new JTextField();
        CourseName1Text.setBounds(400, 530, 130, 30);
        

        DateofEnrollmentgrant = new JLabel("Date of Enrollment");
        DateofEnrollmentgrant.setBounds(290, 570, 190, 30);
        DateofEnrollmentgrant.setFont(labelFont);
        panel.add(DateofEnrollmentgrant);

        dateOfEnrollmentDaygrantComboBox = new JComboBox<>();
        for (int i = 1; i <= 30; i++) {
            dateOfEnrollmentDaygrantComboBox.addItem(i);
        }
        dateOfEnrollmentDaygrantComboBox.setBounds(420, 570, 70, 30);
        panel.add(dateOfEnrollmentDaygrantComboBox);

        dateOfEnrollmentMonthgrantComboBox = new JComboBox<>(option);
        dateOfEnrollmentMonthgrantComboBox.setBounds(480, 570, 100, 30);
        panel.add(dateOfEnrollmentMonthgrantComboBox);

        dateOfEnrollmentYeargrantComboBox = new JComboBox<>();
        for (int i = 1998; i <= 2023; i++) {
            dateOfEnrollmentYeargrantComboBox.addItem(i);
        }
        dateOfEnrollmentYeargrantComboBox.setBounds(570, 570, 90, 30);
        panel.add(dateOfEnrollmentYeargrantComboBox);


        button = new JButton("Switch to DropOut");
        button.setBounds(324, 57, 140, 40);
        button.addActionListener(this);




        addregular = new JButton("Add regular student ");
        addregular.setBounds(326, 430, 150, 35);
        addregular.setBackground(new Color(44, 63, 130));
        addregular.addActionListener(this);


        presentpercentage = new JButton(" Calculate Present percentage");
        presentpercentage.setBounds(50, 604, 200, 35);
        presentpercentage.addActionListener(this);


        grantcertificate = new JButton(" Grant certificate");
        grantcertificate.setBounds(320, 620, 170, 35);
        grantcertificate.addActionListener(this);

        display = new JButton("Display");
        display.setBounds(620, 650, 120, 40);
        display.addActionListener(this);

        clear = new JButton("Clear All");
        clear.setBounds(620, 600, 120, 40);
        clear.addActionListener(this);



        //dropout
        panel1 = new JPanel();
        panel1.setSize(800, 800);
        panel1.setBackground(new Color(185,198,235));
        panel1.setLayout(null);

        studentName10Label = new JLabel("Student Name");
        studentName10Label.setBounds(50, 101, 100, 30);
        studentName10Label.setFont(labelFont);
        studentName10Text = new JTextField();
        studentName10Text.setBounds(173, 103, 150, 30);
        studentName10Text.setForeground(textColor);

        enrollmentId10Label = new JLabel("Enrollment ID");
        enrollmentId10Label.setBounds(50, 149, 100, 30);
        enrollmentId10Label.setFont(labelFont);
        enrollmentId10Text = new JTextField();
        enrollmentId10Text.setBounds(173, 149, 150, 30);
        enrollmentId10Text.setForeground(textColor);

        courseName10Label = new JLabel("Course Name");
        courseName10Label.setBounds(50, 200, 100, 35);
        courseName10Label.setFont(labelFont);
        courseName10Text = new JTextField();
        courseName10Text.setBounds(173, 200, 150, 30);
        courseName10Text.setForeground(textColor);


        courseDuration10Label = new JLabel("Course Duration");
        courseDuration10Label.setBounds(457, 101, 120, 30);
        courseDuration10Label.setFont(labelFont);
        courseDuration10Text = new JTextField();
        courseDuration10Text.setBounds(580, 101, 150, 30);
        courseDuration10Text.setForeground(textColor);

        tuitionFee10Label = new JLabel("Tuition Fee");
        tuitionFee10Label.setBounds(455, 149, 100, 30);
        tuitionFee10Label.setFont(labelFont);
        tuitionFee10Text = new JTextField();
        tuitionFee10Text.setBounds(580, 149, 150, 30);
        tuitionFee10Text.setForeground(textColor);

        numOfMonthAttendedLabel = new JLabel("Months Attended");
        numOfMonthAttendedLabel.setBounds(50, 250, 200, 30);
        numOfMonthAttendedLabel.setFont(labelFont);
        monthsAttendedText = new JTextField();
        monthsAttendedText.setBounds(173, 250, 150, 30);
        monthsAttendedText.setForeground(textColor);

        RemainingModules10Label = new JLabel(" Remaining Modules");
        RemainingModules10Label.setBounds(440, 200, 200, 30);
        RemainingModules10Label.setFont(labelFont);
        RemainingModules10Text = new JTextField();
        RemainingModules10Text.setBounds(580, 200, 150, 30);
        RemainingModules10Text.setForeground(textColor);

        dateOfBirth10Label = new JLabel("Date of Birth");
        dateOfBirth10Label.setBounds(50, 300, 100, 30);
        dateOfBirth10Label.setFont(labelFont);
        panel1.add(dateOfBirth10Label);

        dateOfBirthMonth = new JComboBox<>(option);
        dateOfBirthMonth.setBounds(150, 300, 100, 30);
        panel1.add(dateOfBirthMonth);

        dateOfBirthDay10ComboBox = new JComboBox<>();
        for (int i = 1; i <= 30; i++) {
            dateOfBirthDay10ComboBox.addItem(i);
        }
        dateOfBirthDay10ComboBox.setBounds(250, 300, 70, 30);
        panel1.add(dateOfBirthDay10ComboBox);

        dateOfBirthYear10ComboBox = new JComboBox<>();
        for (int i = 1989; i <= 2023; i++) {
            dateOfBirthYear10ComboBox.addItem(i);
        }
        dateOfBirthYear10ComboBox.setBounds(320, 300, 100, 30);
        panel1.add(dateOfBirthYear10ComboBox);

        dateOfDropout10Label = new JLabel("Date of Dropout");
        dateOfDropout10Label.setFont(labelFont);
        dateOfDropout10Label.setBounds(40, 330, 150, 30);
        panel1.add(dateOfDropout10Label);

        dateOfDropoutDay10ComboBox = new JComboBox<>();
        for (int i = 1; i <= 30; i++) {
            dateOfDropoutDay10ComboBox.addItem(i);
        }
        dateOfDropoutDay10ComboBox.setBounds(250, 330, 70, 30);
        panel1.add(dateOfDropoutDay10ComboBox);

        dateOfDropoutMonth10ComboBox = new JComboBox<>(option);
        dateOfDropoutMonth10ComboBox.setBounds(150, 330, 100, 30);
        panel1.add(dateOfDropoutMonth10ComboBox);

        dateOfDropoutYear10ComboBox = new JComboBox<>();
        for (int i = 1998; i <= 2023; i++) {
            dateOfDropoutYear10ComboBox.addItem(i);
        }
        dateOfDropoutYear10ComboBox.setBounds(320, 330, 100, 30);
        panel1.add(dateOfDropoutYear10ComboBox);

        dateOfEnrollmentLabel = new JLabel("Date of Enrollment");
        dateOfEnrollmentLabel.setBounds(420, 250, 150, 30);
        dateOfEnrollmentLabel.setFont(labelFont);
        panel1.add(dateOfEnrollmentLabel);

        dateOfEnrollmentDayComboBox = new JComboBox<>();
        for (int i = 1; i <= 30; i++) {
            dateOfEnrollmentDayComboBox.addItem(i);
        }
        dateOfEnrollmentDayComboBox.setBounds(650, 250, 70, 30);
        panel1.add(dateOfEnrollmentDayComboBox);

        dateOfEnrollmentMonthComboBox = new JComboBox<>(option);
        dateOfEnrollmentMonthComboBox.setBounds(560, 250, 100, 30);
        panel1.add(dateOfEnrollmentMonthComboBox);

        dateOfEnrollmentYearComboBox = new JComboBox<>();
        for (int i = 1998; i <= 2023; i++) {
            dateOfEnrollmentYearComboBox.addItem(i);
        }
        dateOfEnrollmentYearComboBox.setBounds(710, 250, 90, 30);
        panel1.add(dateOfEnrollmentYearComboBox);

        EnrollmentId20 = new JLabel("EnrollmentID");
        EnrollmentId20.setBounds(70, 500, 160, 30);
        EnrollmentId20.setFont(labelFont);
        EnrollmentId20Text = new JTextField();
        EnrollmentId20Text.setBounds(50, 530, 160, 30);
        EnrollmentId20Text.setForeground(textColor);

        EnrollmentId21 = new JLabel("EnrollmentID");
        EnrollmentId21.setBounds(350, 500, 160, 30);
        EnrollmentId21.setFont(labelFont);
        EnrollmentId21Text = new JTextField();
        EnrollmentId21Text.setBounds(330, 530, 160, 30);
        EnrollmentId21Text.setForeground(textColor);

        Regular = new JButton("Switch to Regular");
        Regular.setBounds(324, 57, 125, 40);

        Regular.addActionListener(this);

        Dropout = new JButton("Add DROPOUT");
        Dropout.setBounds(326, 400, 150, 35);
        Dropout.addActionListener(this);

        PayBills = new JButton("PAY BILLS");
        PayBills.setBounds(40, 570, 200, 35);
        PayBills.addActionListener(this);

        RemoveDropOut = new JButton("REMOVE DROPOUT");
        RemoveDropOut.setBounds(330, 570, 170, 35);
        RemoveDropOut.addActionListener(this);

        Display1 = new JButton("Display");
        Display1.setBounds(620, 650, 120, 40);
        Display1.addActionListener(this);

        ClearAll = new JButton("Clear All");
        ClearAll.setBounds(620, 600, 120, 40);
        ClearAll.addActionListener(this);

        studentsList = new ArrayList<>();

        panel1.add(studentName10Label);
        panel1.add(enrollmentId10Label);
        panel1.add(courseName10Label);
        panel1.add(courseDuration10Label);
        panel1.add(tuitionFee10Label);
        panel1.add(RemainingModules10Label);

        panel1.add(numOfMonthAttendedLabel);
        panel1.add(RemainingModules10Label);

        panel1.add(studentName10Text);
        panel1.add(enrollmentId10Text);
        panel1.add(courseName10Text);
        panel1.add(courseDuration10Text);
        panel1.add(tuitionFee10Text);
        panel1.add(RemainingModules10Text);
        panel1.add(EnrollmentId20);
        panel1.add(EnrollmentId20Text);
        panel1.add(monthsAttendedText);
        panel1.add(RemainingModules10Text);

        panel1.add(EnrollmentId21);
        panel1.add(EnrollmentId21Text);


        panel1.add(Regular);
        panel1.add(Dropout);
        panel1.add(PayBills);
        panel1.add(RemoveDropOut);
        panel1.add(Display1);
        panel1.add(ClearAll);


        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setLayout(null);


        panel.add(StudentName);
        panel.add(EnrollmentId);
        panel.add(CourseName);

        panel.add(CourseDuration);
        panel.add(TuitionFee);
        panel.add(NumberoFModules);
        panel.add(NumberofCreditHours);
        panel.add(NumberofDaysPresent);

        panel.add(StudentNameText);
        panel.add(EnrollmentIdText);
        panel.add(CourseNameText);
        panel.add(CourseDurationText);
        panel.add(TuitionFeeText);
        panel.add(NumberoFModulesText);
        panel.add(NumberofCreditHoursText);
        panel.add(NumberofDaysPresentText);

        panel.add(EnrollmentId1);
        panel.add(EnrollmentId1Text);
        panel.add(EnrollmentId2);
        panel.add(EnrollmentId2Text);
        panel.add(Daypresent);
        panel.add(DaypresentText);
        panel.add(CourseName1);
        panel.add(CourseName1Text);
        panel.setLayout(null);
        frame.add(panel);

        // ADDING BIUTTON
         panel.add(button);
        panel.add(addregular);
        panel.add(presentpercentage);
        panel.add(grantcertificate);
        panel.add(display);
        panel.add(clear);

        panel.setVisible(true);


        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
    }

    public void actionPerformed(ActionEvent p) {
        if (p.getSource() == Regular) {
            panel.setVisible(true);
            panel1.setVisible(false);
        }
        if (p.getSource() == button) {
            frame.add(panel1);
            panel1.setVisible(true);
            panel.setVisible(false);
        }

        // ADD STUDENT TO REGULAR


        if (p.getSource() == addregular) {
            try {
                AddRegular();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Please input values Correctly !");
            }
        }

        // presentpercentage//
        if (p.getSource() == presentpercentage) {
            try {
                Presentp();
            } catch (Exception error) {
                JOptionPane.showMessageDialog(frame, "Please input values Correctly ! \n Error Type : " + error);
            }
        }
        // for present percentage

        if (p.getSource() == grantcertificate) {
            try {
                Grant();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid Enrollment ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


        // add dropout//
        if (p.getSource() == Dropout) {
            try {

                AddDropout();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Please input values Correctly !","Error", JOptionPane.ERROR_MESSAGE);

            }
        }

        if (p.getSource() == PayBills)
        {
            try{
                Billspay();
            }catch (Exception e){
                JOptionPane.showMessageDialog(frame, "Please input values Correctly !","Error", JOptionPane.ERROR_MESSAGE);
            }
        }


            if (p.getSource() == display) {
            }

        // clear option for regular
        if (p.getSource() == clear) {

            RegularClear();
        }

        // clear option for dropout//

        if (p.getSource() == ClearAll) {
            DropoutClear();
        }


        if (p.getSource() == RemoveDropOut) {
            try{
                Remove();
            }catch (Exception e){
                JOptionPane.showMessageDialog(frame, "Please input values Correctly !","Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if(p.getSource()==display){
            displayRegular();
        }
        if(p.getSource()==Display1){
            displayDropout();
        }

    }

    public void AddRegular() {
        String studentName = StudentNameText.getText();
        String courseName = CourseNameText.getText();
        int courseDuration = Integer.parseInt(CourseDurationText.getText());
        int enrollmentID = Integer.parseInt(EnrollmentIdText.getText());
        
         if (isDuplicateEnrollmentID(enrollmentID)) {
        JOptionPane.showMessageDialog(frame, "Student with the same Enrollment ID already exists!", "Duplicate Enrollment ID", JOptionPane.ERROR_MESSAGE);
        return; // Don't add the student
        }
        int tuitionFee = Integer.parseInt(TuitionFeeText.getText());
        int numOfModules = Integer.parseInt(NumberoFModulesText.getText());
        int creditHours = Integer.parseInt(NumberofCreditHoursText.getText());
        int daysPresent = Integer.parseInt(NumberofDaysPresentText.getText());
        if (courseDuration<= daysPresent){
            JOptionPane.showMessageDialog(frame,"Days present must be lees or equal to than courseduration");
            return;
        
        }
        String dateOfBirth = dateOfBirthDay.getSelectedItem() + "-" + dateOfBirthMonth.getSelectedItem() + "-" + dateOfBirthYear.getSelectedItem();
        String dateOfEnrollmennt = dateOfEnrollmentDayComboBox.getSelectedItem() + "-" + dateOfEnrollmentMonthComboBox.getSelectedItem() + "-" + dateOfEnrollmentYearComboBox.getSelectedItem();

        Regular regularStudent = new Regular(dateOfBirth, studentName, courseDuration, tuitionFee, enrollmentID, courseName, dateOfEnrollmennt, numOfModules, creditHours, daysPresent);
        studentsList.add(regularStudent);
        JOptionPane.showMessageDialog(frame, "Student added to regular");

    }
        private boolean isDuplicateEnrollmentID(int enrollmentID) {
        for (Student student : studentsList) {
            if (student.getEnrollmentID() == enrollmentID) {
                return true; // Enrollment ID already exists
            }
        }
        return false; // No duplicate enrollment ID found
    }
    public void AddDropout() {

        String studentName = studentName10Text.getText();
        String courseName = courseName10Text.getText();
        int enrollmentID = Integer.parseInt(enrollmentId10Text.getText());
        
        
         if (isDuplicateEnrollmentID(enrollmentID)) {
        JOptionPane.showMessageDialog(frame, "Student with the same Enrollment ID already exists!", "Duplicate Enrollment ID", JOptionPane.ERROR_MESSAGE);
        return; // Don't add the student
        }
    
        int courseDuration = Integer.parseInt(courseDuration10Text.getText());
        int tuitionFee = Integer.parseInt(tuitionFee10Text.getText());
        int monthsAttended = Integer.parseInt(monthsAttendedText.getText());
        int remainingModules = Integer.parseInt(RemainingModules10Text.getText());


        String dateOfBirth = dateOfBirthYear.getSelectedItem() + "-" + dateOfBirthMonth.getSelectedItem() + "-" + dateOfBirthDay10ComboBox.getSelectedItem();

        String dateOfDropout = dateOfDropoutDay10ComboBox.getSelectedItem() + "-" + dateOfDropoutMonth10ComboBox.getSelectedItem() + "- " + dateOfDropoutYear10ComboBox.getSelectedItem();

        String dateOfEnrollment = dateOfEnrollmentDayComboBox.getSelectedItem() + "-" + dateOfEnrollmentMonthComboBox.getSelectedItem() + "-" + dateOfEnrollmentYearComboBox.getSelectedItem();


        Dropout dropoutStudent = new Dropout(dateOfBirth, studentName, courseDuration, tuitionFee, enrollmentID, courseName, dateOfEnrollment, remainingModules, monthsAttended, dateOfDropout);

        studentsList.add(dropoutStudent);

        JOptionPane.showMessageDialog(frame, "Student added to dropout");

    }
    
    public void RegularClear() {
        StudentNameText.setText("");
        CourseNameText.setText("");
        CourseDurationText.setText("");
        EnrollmentIdText.setText("");
        TuitionFeeText.setText("");
        NumberoFModulesText.setText("");
        NumberofCreditHoursText.setText("");
        NumberofDaysPresentText.setText("");
        JOptionPane.showMessageDialog(frame, "clear sucessfully");

    }

    public void DropoutClear() {
        studentName10Text.setText("");
        courseName10Text.setText("");
        enrollmentId10Text.setText("");
        courseDuration10Text.setText("");
        tuitionFee10Text.setText("");
        monthsAttendedText.setText("");
        RemainingModules10Text.setText("");
        JOptionPane.showMessageDialog(frame, "clear sucessfully");

    }

    public void Grant() {
        int enrollmentID = Integer.parseInt(EnrollmentId2Text.getText());

        // Search for the regular student with the given enrollment ID
        boolean found = false;
        for (Student students : studentsList) {
            if (students instanceof Regular && students.getEnrollmentID() == enrollmentID) {
                Regular Student = ((Regular) students);
                if (Student.isGrantedScholarship() == true) {
                    JOptionPane.showMessageDialog(frame, "The student has been graduated and awarded with Scholarship");
                }
                if (Student.isGrantedScholarship() == false) {
                    JOptionPane.showMessageDialog(frame, "The student has been graduated !");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(frame, "Sorry! Cannot find regular student with the given enrollment ID", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }

    public void Presentp() {
        int ppEnrollId = Integer.parseInt(EnrollmentId1Text.getText());
        int ppDaysPresent = Integer.parseInt(DaypresentText.getText());
        boolean found = false;
        for (Student students : studentsList) {
            if (students instanceof Regular && students.getEnrollmentID() == ppEnrollId) {
                Regular student = ((Regular) students);
                double presentPercentage=student.presentPercentage(Integer.parseInt(DaypresentText.getText()));
  
                JOptionPane.showMessageDialog(frame, "The present percetage of Student is: " + student.presentPercentage(ppDaysPresent) + "%");
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(frame, "Sorry! Cannot find student with given enrollment ID");
        }

    }
    public void Billspay(){
        boolean temp = false;
        int EnrollmentIDpay = Integer.parseInt(EnrollmentId20Text.getText());
        for (Student students : studentsList) {
            if (students instanceof Dropout && students.getEnrollmentID() == EnrollmentIDpay) {
                Dropout student = ((Dropout) students);
                student.billsPayable();
                if (student.getHasPaid() == true) {
                    JOptionPane.showMessageDialog(frame, "Bills paid successfully. Now you can remove the student!");
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Bills not paid");
                }
                temp = true;
            }
        }
        if(!temp){
            JOptionPane.showMessageDialog(frame, "Can't find student with given ID");
        }
    }

    public void displayRegular(){
        System.out.println("The Details of Regular Student \n \n");
        for(Student students : studentsList){
            if (students instanceof Regular){
                students.display();
                System.out.println("\n");
            }
        }
    }

    public void displayDropout(){
        System.out.println("The Details of Dropout Student \n \n");
        for(Student students : studentsList){
            if (students instanceof Dropout){
                students.display();
                System.out.println("\n");
            }
        }
    }
    public void Remove(){
        boolean temp = false;
        int EnrollmentId21 = Integer.parseInt(EnrollmentId21Text.getText());
        for (Student students : studentsList) {
            if (students instanceof Dropout && students.getEnrollmentID() == EnrollmentId21) {
                Dropout student = ((Dropout) students);
                if (student.getHasPaid() == true) {
                    student.removeStudent();
                    JOptionPane.showMessageDialog(frame, "Student removed Successfully");
                } else {
                    JOptionPane.showMessageDialog(frame, "Can't remove student. Please pay bill first!");
                }
                temp = true;
            }

        }
        if(!temp){
            JOptionPane.showMessageDialog(frame, "Can't find student with given ID");
        }
    }
    
      public static void main (String[]args){
            new StudentGUI();
         }
    }
