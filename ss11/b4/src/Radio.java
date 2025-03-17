public class Radio implements IElectronic{

    @Override
    public void turnOn(){
        System.out.println("Turning on radio....");
    }

    @Override
    public void turnOff(){
        System.out.println("Turning off radio....");
    }
}
