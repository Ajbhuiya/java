package javaprac;

public class NestedIfDemo {
    public static void main(String[] args) {
        int age = 60;
//nested if instead of having one action it can perform more than one ex the print statement/
        if(age<50){
            System.out.println("You are young");
        }else {
            System.out.println("you are old");
            if(age>75){
                System.out.println("you are really old");
            }else{
                System.out.println("don't worry");
            }
        }
    }
}
