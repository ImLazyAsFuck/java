public class Main{
    public static void main(String[] args) {
        Company company = new Company(10);

        Manager manager = new Manager("Alice", 8000);
        Developer developer = new Developer("Bob", 5000);

        company.addEmployee(manager);
        company.addEmployee(developer);

        company.showWorkAndVacation();
        company.organizeMeeting();
    }
}