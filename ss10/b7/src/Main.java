import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Giới hạn danh sách sinh viên thường: ");
        int n = Integer.parseInt(input.nextLine());
        System.out.printf("Giới hạn danh sách sinh viên tối nghiệp");
        int m = Integer.parseInt(input.nextLine());

        Student[] students = new Student[n];
        GraduateStudent[] graduateStudents = new GraduateStudent[m];

        System.out.printf("Sinh viên thường\n");
        for(int i = 0; i < n; i++){
            students[i] = new Student();
            students[i].inputData(input);
        }

        System.out.printf("Sinh viên tốt nghiệp\n");
        for(int i = 0; i < m; i++){
            graduateStudents[i] = new GraduateStudent();
            graduateStudents[i].inputData(input);
        }

        System.out.println("Sinh viên thường");
        for(int i = 0; i < n; i++){
            students[i].getDetails();
        }

        System.out.println("Sinh viên tốt nghiệp");
        for(int i = 0; i < m; i++){
            graduateStudents[i].getDetails();
        }
    }
}