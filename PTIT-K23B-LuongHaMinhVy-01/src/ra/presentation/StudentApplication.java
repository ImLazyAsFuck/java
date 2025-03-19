package ra.presentation;

import ra.bussiness.StudentBussiness;
import ra.entity.Student;

import java.util.Scanner;

public class StudentApplication{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        final Student[] students = new Student[100];
        int currentIndex = 0;
        while(true){
            StudentBussiness.menu();
            System.out.print("Mời bạn chọn: ");
            int choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    StudentBussiness.displayStudents(students, currentIndex);
                    break;
                case 2:
                    StudentBussiness.addStudent(input, students, currentIndex);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
