package ra.bussiness;

import ra.entity.Student;

import java.util.Scanner;

public class StudentBussiness{
    public static void menu(){
        System.out.println("---------------------------Student Menu----------------------");
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Thêm mới sinh viên");
        System.out.println("3. Chỉnh sửa thông tin sinh viên");
        System.out.println("4. Xoá sinh viên");
        System.out.println("5. Tìm kiếm sinh viên");
        System.out.println("6. Sắp xếp");
        System.out.println("0. Thoát chương trình");
    }

    public static void displayStudents(Student[] students, int currentIndex){
        if(currentIndex == 0){
            System.out.println("Mảng rỗng");
        }
        for(int i = 0; i < currentIndex; i++){
            students[i].displayData();
        }
    }

   public static void addStudent(Scanner input, Student[] students, int currentIndex){
       System.out.print("Nhập số lượng sinh viên: ");
       int amounts = Integer.parseInt(input.nextLine());
       if(currentIndex + amounts >= students.length){
           System.out.println("Vượt quá giới hạn danh sách sinh viên.");
           return;
       }
       for(int i = currentIndex; i < amounts; i++){
           students[i].inputData(input);
       }
   }

   public static void updateStudent(Scanner input, Student[] students, int currentIndex){
        for(int i = 0; i < currentIndex; i++){

        }
   }
}
