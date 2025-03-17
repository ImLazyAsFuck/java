public class Main{
    public static void main(String[] args) {
        PartTimeEmployee partTime = new PartTimeEmployee("Alice", 20, 5);
        FullTimeEmployee fullTime = new FullTimeEmployee("Bob", 25);

        System.out.println(partTime.getName() + "'s Salary: " + partTime.calculateSalary());
        System.out.println(fullTime.getName() + "'s Salary: " + fullTime.calculateSalary());
    }
}