public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    public Elephant(){
    }

    @Override
    public void sound() {
        System.out.println("Trumpet!");
    }

    @Override
    public void move() {
        System.out.println("The elephant is walking.");
    }
}