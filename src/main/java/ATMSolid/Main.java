package ATMSolid;

import ATMSolid.abstractionPackage.ICreditCardsAndPINsMap;

public class Main {
    public static void main(String[] args) {

        //upload list of credit card and associated pin
        ICreditCardsAndPINsMap creditCardsAndPINsMap = new CreditCardsAndPINsMap();
        System.out.println("Available account: " + creditCardsAndPINsMap.filleMap() + "\n");

        //user input credit card number and pin
        UserInput userInput = new UserInput();

        //verification if user input credit card number and PIN are correct
        VerificationCreditCardAndPIN verificationCreditCardAndPIN =
                new VerificationCreditCardAndPIN(creditCardsAndPINsMap,userInput);
        verificationCreditCardAndPIN.comparingInputToMap();
    }
}