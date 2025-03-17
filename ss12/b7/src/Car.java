public class Car extends Vehicle{
    public Car(){
    }

    @Override
    public void sound(){
        System.out.println("Vroom");
    }

    @Override
    public void move(){
        System.out.println("Di chuyển nhanh");
    }
}
