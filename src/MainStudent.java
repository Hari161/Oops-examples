import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        new MainStudent().setStudentDetails();

    }

    private void setStudentDetails() {
        List<StudentDetails> studentDetails = new ArrayList<>();
        StudentDetails studentDetails1;
        Scanner sc;
        boolean breakFlag = false;
        int count = 1;
        for (int i = 0; i < 5; i++) {
            if (!breakFlag) {
                sc = new Scanner(System.in);
                studentDetails1 = new StudentDetails();
                System.out.println("Enter the student name");
                studentDetails1.setName(sc.nextLine());
                System.out.println("Enter the student roll No");
                int rollNo = sc.nextInt();
                String rollNo_size = Integer.toString(rollNo);
                if (rollNo_size.length() > 3) {
                    breakFlag = true;
                    System.out.println("Roll no should contains only 3 digits");
                    break;
                }
                studentDetails1.setRollno(rollNo);
                for (int j = 0; j < 5; j++) {
                    System.out.println("Enter mark of subject :" + count++);
                    double mark = sc.nextDouble();
                    if (mark > 100) {
                        breakFlag = true;
                        System.out.println("Each subject is calculated out of 100");
                        break;
                    }
                    studentDetails1.setMarks(mark);
                }
                count = 1;
                studentDetails.add(studentDetails1);
            }
        }
        if (!breakFlag)
            displayStudent(studentDetails);
    }

    private void displayStudent(List<StudentDetails> studentDetails) {
        System.out.println("Student Deatils \n ===========================");
        for (StudentDetails studentDetails1 : studentDetails) {
            System.out.println("\nStudent Name : " + studentDetails1.getName() + "\nStudent Roll No :" + studentDetails1.getRollno()
                    + "\nTotal Score :" + studentDetails1.getTotal() + "\nRank :" + studentDetails1.getRank());
        }
        checkRank(studentDetails);
    }

    private void checkRank(List<StudentDetails> studentDetails) {
        System.out.println(" Enter choice \n1: Search by Roll No\n2: Search by Rank");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter the Roll No");
                int rollNo = new Scanner(System.in).nextInt();
                for (StudentDetails studentDetails1 : studentDetails) {
                    if (studentDetails1.getRollno() == rollNo) {
                        System.out.println("\nStudent Name : " + studentDetails1.getName() + "\nStudent Roll No :" + studentDetails1.getRollno()
                                + "\nTotal Score :" + studentDetails1.getTotal() + "\nRank :" + studentDetails1.getRank());
                    }
                }
            }
            case 2 -> {
                System.out.println("Enter the Rank");
                String rank = new Scanner(System.in).nextLine();
                for (StudentDetails studentDetails1 : studentDetails) {
                    if (studentDetails1.getRank().equalsIgnoreCase(rank)) {
                        System.out.println("\nStudent Name : " + studentDetails1.getName() + "\nStudent Roll No :" + studentDetails1.getRollno()
                                + "\nTotal Score :" + studentDetails1.getTotal() + "\nRank :" + studentDetails1.getRank());
                    }
                }
            }
        }
    }
}
