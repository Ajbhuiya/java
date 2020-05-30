package AbsInterface;

public class TestBank {

    public static void main(String[] args) {

        Chase us = new Chase();
        us.credit();//overriden methods
        us.deposit();
        us.educationLoan();
        us.microLoan();
        System.out.println(UsBank.money);
        System.out.println(UsBank.bank);

        UsBank ubank = new Chase();//we can use interface as reference to create object.
        //only methods from usbank cuz us is calling
        ubank.credit();








    }
}
