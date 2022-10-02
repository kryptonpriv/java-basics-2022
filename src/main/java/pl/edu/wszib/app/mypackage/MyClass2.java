package pl.edu.wszib.app.mypackage;
import pl.edu.wszib.app.MyClass;

public class MyClass2 extends MyClass {
    // public MyClass myClass;

    public void run() {
        // myClass.run4(); // because is public!
        field3 = "Field3 from extended";
        run3();
    }
}
