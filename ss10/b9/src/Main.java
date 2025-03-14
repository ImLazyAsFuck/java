public class Main{
    public static void main(String[] args){
        Employee employee = new Employee("John", 2,  3000);
        Manager manager = new Manager("Alice",2, 5000, 50);
        Developer developer = new Developer("Bob",3 , 4000, "C");

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(developer.toString());

        employee.increaseSalary(500);
        manager.increaseSalary(500);
        developer.increaseSalary(500);

        System.out.println("\nSau khi tăng lương:");
        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(developer.toString());
    }
}