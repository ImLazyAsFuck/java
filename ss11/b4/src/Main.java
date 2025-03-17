import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        IElectronic[] device = new IElectronic[]{
                new TV(),
                new Radio()
        };

        for(IElectronic d : device){
            d.turnOn();
            d.turnOff();
        }
    }
}