import java.util.Scanner;

public class Student{
    private String name;
    private int id;
    private double gpa;

    public Student(){

    }

    public Student(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public void getDetails(){
        System.out.printf("ID: %s\n", this.id);
        System.out.printf("Tên: %s\n", this.name);
        System.out.printf("GPA: %s\n", this.gpa);
    }

    public void inputData(Scanner input){
        System.out.printf("ID: ");
        this.id = Integer.parseInt(input.nextLine());
        System.out.printf("Tên: ");
        this.name = input.nextLine();
        System.out.printf("GPA: ");
        this.gpa = input.nextDouble();
    }
}
