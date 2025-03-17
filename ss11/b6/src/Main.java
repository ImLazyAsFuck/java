public class Main{
    public static void main(String[] args) {
        Zoo zoo = new Zoo(100);

        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.showAnimals();
    }
}