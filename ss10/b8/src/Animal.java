public class Animal{
    private String name;
    private int age;

    public Animal(){
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayInfo(){
        System.out.printf("Tên: %s\n", name);
        System.out.printf("Tuổi: %s\n", age);
    }

    public void makeSound(){
        System.out.println("Some generic sound");
    }
}
