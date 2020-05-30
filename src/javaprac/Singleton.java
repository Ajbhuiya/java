package javaprac;

public class Singleton {
    public static void main(String[] args) {
        //means only one. create one instance of a class. not allowed to create second insatnce
        //only one instance is singleton
        Abc obj1 = Abc.getInstance();//this is object in singleton

    }
}
    //To design a singleton class:

       /* Make constructor as private.
        Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.
*/

       class Abc {// this is a new class
    //step 1-have to create static object of this class
    static Abc obj = new Abc();

    //step2= dont keep constrcutor public. to hinder other classes to create object from this class
    private Abc() {
    }

    //step 3:declare a method which should be static and return insatnce of method
    public static Abc getInstance() {
        return obj;
    }
}


