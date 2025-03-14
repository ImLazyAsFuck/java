public class Manager extends Employee{
    private double bonus;

    public Manager(){
    }

    public Manager(double bonus){
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + bonus;
    }

    @Override
    public String toString(){
        return super.toString() +
                " thưởng = " + bonus;
    }
}
