import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Animal[] animals = {
                new Dog("Buddy"),
                new Cat("Whiskers"),
                new Dog("Charlie"),
                new Cat("Luna")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].displayInfo();
            animals[i].makeSound();
            System.out.println();
        }
    }
}