package ATMSolid;

import ATMSolid.abstractionPackage.IUserInput;

import java.util.Scanner;

public class UserInput implements IUserInput {
    @Override
    public Integer checkUserInputCreditCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your credit card number: " );
        Integer creditCard = scanner.nextInt();
        return creditCard;
    }
    @Override
    public Integer checkUserInputPIN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Confirm PIN: ");
        Integer pin = scanner.nextInt();
        return pin;
    }
}
