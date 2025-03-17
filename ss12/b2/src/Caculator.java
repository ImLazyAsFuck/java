public class Caculator{
    private int a;
    private int b;
    private int c;

    public Caculator(){
    }

    public Caculator(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getB(){
        return b;
    }

    public int getC(){
        return c;
    }

    public void setC(int c){
        this.c = c;
    }

    public void setB(int b){
        this.b = b;
    }

    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
}
