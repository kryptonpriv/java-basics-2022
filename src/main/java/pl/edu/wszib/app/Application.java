package pl.edu.wszib.app;

import pl.edu.wszib.app.mypackage.MyClass2;

public class Application
{
    public static void main(String[] args) {
        System.out.println("Hello World");

        MyClass2 myClass = new MyClass2(); // Alt + Enter to show hints
        ((MyClass) myClass).field2 = "Field2"; // use Ctrl + D to copy line below
        myClass.field3 = "Field3";
        myClass.field4 = "Field4";
        ((MyClass)myClass).run2();
        myClass.run3();
        myClass.run4();

        myClass.run();
    }
}
