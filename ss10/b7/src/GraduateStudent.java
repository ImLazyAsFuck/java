import java.util.Scanner;

public class GraduateStudent extends Student{
    private String researchTopic;
    private String superVisorName;

    public GraduateStudent(){
    }

    public GraduateStudent(String researchTopic, String superVisorName){
        this.researchTopic = researchTopic;
        this.superVisorName = superVisorName;
    }

    public GraduateStudent(String name, int id, double gpa, String researchTopic, String superVisorName){
        super(name, id, gpa);
        this.researchTopic = researchTopic;
        this.superVisorName = superVisorName;
    }

    public String getResearchTopic(){
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic){
        this.researchTopic = researchTopic;
    }

    public String getSuperVisorName(){
        return superVisorName;
    }

    public void setSuperVisorName(String superVisorName){
        this.superVisorName = superVisorName;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.printf("Đề tài nghiên cứu: %s\n", this.researchTopic);
        System.out.printf("Giáo viên phụ trách: %s\n", this.superVisorName);
    }

    @Override
    public void inputData(Scanner input){
        super.inputData(input);
        System.out.printf("Đề tài: ");
        this.researchTopic = input.nextLine();
        System.out.printf("Giáo viên: ");
        this.superVisorName = input.nextLine();
    }
}
