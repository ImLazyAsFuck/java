public class Zoo {
    private final Animal[] animals;
    private int count;

    public Zoo(int size) {
        this.animals = new Animal[size];
        this.count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        } else {
            System.out.println("Zoo is full!");
        }
    }

    public void showAnimals() {
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i].getName() + " (" + animals[i].getAge() + " năm tuổi)");
            animals[i].sound();
            animals[i].move();
            System.out.println();
        }
    }
}