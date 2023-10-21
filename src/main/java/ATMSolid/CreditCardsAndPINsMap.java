package ATMSolid;

import ATMSolid.abstractionPackage.ICreditCardsAndPINsMap;

import java.util.HashMap;
import java.util.Map;

public class CreditCardsAndPINsMap implements ICreditCardsAndPINsMap {

    @Override
    public Map <Integer, Integer> filleMap(){
        Map <Integer, Integer> mapAviableToBank = new HashMap<>();
        mapAviableToBank.put(1,1111);
        mapAviableToBank.put(2,2222);
        mapAviableToBank.put(3,3333);
        mapAviableToBank.put(4,4444);
        return mapAviableToBank;
    }


}