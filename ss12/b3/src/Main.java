public class Main{
    public static void main(String[] args){
        Animal[] animal = new Animal[]{
                new Animal(),
                new Cat(),
                new Dog()
        };

        for(Animal a:animal){
            a.makeSound();
        }
    }
}