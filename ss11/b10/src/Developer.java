 public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String work() {
        return "Lập trình viên " + super.getName() + " (Lương: $" + super.getSalary() + ") đang viết code cho hệ thống mới";
    }

    @Override
    public String takeVacation() {
        return "Lập trình viên " + super.getName() + " (Lương: $" + super.getSalary() + ") đang đi nghỉ phép ở Bali.";
    }

     @Override
     public String attendMeeting(){
         return "";
     }

 }