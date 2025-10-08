package Code;

import java.beans.ConstructorProperties;

public class Alien {

    private String name;
    private int rollno;
    private Laptop lap;

    public Alien() {
        System.out.println("Alien-Constructor...");
    }

    @ConstructorProperties({"rollno","name"})
    public Alien(int rollno,String name) {
        this.rollno = rollno;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getRollno() {
        return rollno;
    }

    public void code(){
        System.out.println("coding..");
        lap.compile();
    }
}
