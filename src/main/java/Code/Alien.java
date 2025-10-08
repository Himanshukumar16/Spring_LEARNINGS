package Code;

public class Alien {

    private int rollno;
    private Laptop lap;

    public Alien() {
        System.out.println("Alien-Constructor...");
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        System.out.println("Setter called !");
        this.rollno = rollno;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("coding..");
        lap.compile();

    }
}
