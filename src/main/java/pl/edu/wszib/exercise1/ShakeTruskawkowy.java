package pl.edu.wszib.exercise1;

public class ShakeTruskawkowy extends Shake implements Smak {
    @Override
    public void pij() {
        super.pij();
    }

    @Override
    public void smak() {
        System.out.println("Smak truskawkowy");
    }
}
