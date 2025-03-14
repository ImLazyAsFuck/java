public class Cat extends Animal{
    private String furColor;

    public Cat(){
    }

    public Cat(String furColor){
        this.furColor = furColor;
    }

    public Cat(String name, int age, String furColor){
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor(){
        return furColor;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }
}
