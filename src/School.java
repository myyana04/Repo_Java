public class School {
    public static void main(String[] args) {


        Student s1 = new Student();
        s1.enrolledStudent("happy", "NY", "PM");


        Student s2 = new Student();
        s2.enrolledStudent("Joy", "MI", "QA");

        s1.studentProfile();
        s2.studentProfile();
        Student.schoolSummary();
        s1.feeDeposit("pm ", 400);
        s2.feeDeposit("web", 600);
        s1.feeDeposit("QA", 300);
        s1.feeDeposit("pt", 500);
        s2.feeDeposit("web", 500);
        s1.feeDeposit("pm", 400);
        s2.feeDeposit("pm", 400);
        s1.feeDeposit("qa", 500);
        s1.changeCourse("qa","pm");





        }



    }

