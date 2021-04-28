import java.util.Arrays;

public class Student {
    static String schoolName = "ABC School";
    String studentName = "N/A";
    String studentEnrolledCourse;
    static String[] offeredCourses = {"QA", "Web", "PM"};
    int studentId = 101;
    static int totalStudent = 0;
    String studentAddr;
    double studentFeeBalance;
    static double[] feeCourses = {1000, 2000, 3000};


    public void enrolledStudent(String name, String addr, String course) {
        boolean isCourseAvailable = false;
        for (int i = 0; i < offeredCourses.length; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudent++;
                studentId = totalStudent;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feeCourses[i];
                studentAddr = addr;
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrolled done succesfully." +
                    "\nStudent Id--> " + studentId);
        } else {
            System.out.println("Requested course: " + course + " is not available");

        }


    }

    public void studentProfile() {

        System.out.println("Student id--> " + studentId +
                "\nStudent Name--> " + studentName +
                "\nEnrolled course--> " + studentEnrolledCourse);


    }

    public static void schoolSummary() {

        System.out.println("School Name--> " + schoolName +
                "\nCourses offeres " + Arrays.toString(offeredCourses) +
                "\nTotal number of Student: " + totalStudent);

    }

    //method to deposit fee for classes
    public void feeDeposit(String courseCode, double deposit) {
        boolean isValid = true;
        for (int i = 0; i < offeredCourses.length; i++) {
            if (offeredCourses[i].equalsIgnoreCase(courseCode) && (deposit > 0) && (deposit <= feeCourses[i])) {
                studentFeeBalance = feeCourses[i] - deposit;
                System.out.println("Your course is " + courseCode + " and balance after payment of " + deposit + " is " + studentFeeBalance);
                isValid = false;
                break;

            }
        }
        if (isValid) {
            System.out.println("Invalid information entered");

        }
    }
}
    /*method for student to change courses
    public void changeCourse(String enrolledCourse,String courseToChange){
        if (enrolledCourse.equalsIgnoreCase(courseToChange)== courseToChange.equalsIgnoreCase(enrolledCourse)) {
            System.out.println("Invalid entry");
        }
        else {



        }
    }
}

 */




















