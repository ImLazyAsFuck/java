public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(){
    }

    public Developer(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString(){
        return super.toString() +
                " Ngôn ngữ lập trình ='" + programmingLanguage;
    }
}
