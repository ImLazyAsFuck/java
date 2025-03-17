public class Company{
    private Employee[] employees;
    private Manager[] managers;
    private int employeeCount;
    private int managerCount;

    public Company(int size) {
        this.employees = new Employee[size];
        this.managers = new Manager[size]; // Chỉ lưu Managers riêng để gọi attendMeeting()
        this.employeeCount = 0;
        this.managerCount = 0;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = employee;
            if (employee instanceof Manager) {
                managers[managerCount++] = (Manager) employee;
            }
        } else {
            System.out.println("Công ty đã đạt giới hạn nhân viên!");
        }
    }

    public void organizeMeeting() {
        for (int i = 0; i < managerCount; i++) {
            System.out.println(managers[i].attendMeeting());
        }
    }

    public void showWorkAndVacation() {
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i].work());
            System.out.println(employees[i].takeVacation());
            System.out.println();
        }
    }
}
