package AbsInterface;

public class Chase implements UsBank, BdBank {//multiple interface

    //chase wants to open in us and bd
    //all methods from both banks are added here
    @Override
    public void microLoan() {
        System.out.println("bd loan");

    }

    public void educationLoan() {
        System.out.println("bd loan for schools");

    }

    @Override
    public void landLoan() {
        System.out.println("to buy land");

    }

    @Override
    public void deposit() {
        System.out.println("i want to deposit money");

    }

    @Override
    public void withdraw() {
        System.out.println("i want to take out money");

    }

    @Override
    public void credit() {
        System.out.println("i want to get credit cards");

    }

    @Override
    public void invest() {
        System.out.println("i would like to invest");
    }

    //only chase methods
    public void quickPay(){
        System.out.println("Transfer money");
    }

    public void insurance(){
        System.out.println("insure money");
    }

}
