import java.time.LocalDate;

public class Car{
    private String make;
    private String model;
    private int year;

    public Car(){
    }

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        if(year > LocalDate.now().getYear()){
            System.out.println("Xe không thể tạo sau năm nay");
            return;
        }
        this.year = year;
    }


}
