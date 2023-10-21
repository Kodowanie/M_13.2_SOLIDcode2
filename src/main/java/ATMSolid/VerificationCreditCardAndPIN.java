package ATMSolid;

import ATMSolid.abstractionPackage.IUserInput;
import ATMSolid.abstractionPackage.ICreditCardsAndPINsMap;

import java.util.Map;

public class VerificationCreditCardAndPIN {
    boolean creditCardAndPINConfirmation;
    private final ICreditCardsAndPINsMap creditCardsAndPINsMap;
    private final IUserInput userInput;

    public VerificationCreditCardAndPIN(ICreditCardsAndPINsMap creditCardsAndPINsMap, UserInput userInput) {
        this.creditCardsAndPINsMap = creditCardsAndPINsMap;
        this.userInput = userInput;
    }
    boolean comparingInputToMap(){
        for (Map.Entry<Integer,Integer> map : creditCardsAndPINsMap.filleMap().entrySet()){
            if (userInput.checkUserInputCreditCard().equals(map.getKey())){
                System.out.print("Correct credit card number, please enter PIN: ");
                if (userInput.checkUserInputPIN().equals(map.getValue())){
                    System.out.println("PIN correct");
                    creditCardAndPINConfirmation = true;
                } else {
                    System.out.println("PIN incorrect, please try again");
                    creditCardAndPINConfirmation = false;
                }
                break;
            } else {
                System.out.println("Incorrect credit card number, please try again");
                creditCardAndPINConfirmation = false;
            }
            break;
        }
        return creditCardAndPINConfirmation;
    }
}
