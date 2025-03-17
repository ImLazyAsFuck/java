public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String work() {
        return "Quản lý " + super.getName() + " (Lương: $" + super.getSalary()+ ") đang giám sát dự án";
    }

    @Override
    public String takeVacation() {
        return "Quản lý " + super.getName() + " (Lương: $" + super.getSalary() + ") đang đi nghỉ phép tại Pháp.";
    }

    @Override
    public String attendMeeting() {
        return "Quản lý " + super.getName() + " (Lương: $" + super.getSalary() + ") đang tham gia cuộc họp";
    }
}
