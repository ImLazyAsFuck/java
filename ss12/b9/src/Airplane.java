public class Airplane extends Vechicle{
    private int altitude;

    public Airplane(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public void move() {
        System.out.println("Airplane is flying in the sky.");
    }

    @Override
    public void sound() {
        System.out.println("Whoosh");
    }

    public int getAltitude() {
        return altitude;
    }
}
