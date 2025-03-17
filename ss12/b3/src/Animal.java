public class Animal{

    public Animal(){
    }

    public void makeSound(){
        System.out.println("Some sound.");
    }

    @Override
    public String toString(){
        return "Animal";
    }
}
