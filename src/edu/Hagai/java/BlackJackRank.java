package edu.Hagai.java;

import edu.Hagai.java.utils.StringUtils;

/**
 * Created by Android2017 on 3/10/2017.
 */
public enum BlackJackRank {
    TWO(2) , THREE (3 ), FOUR(4) , FIVE(5) , SIX(6) , SEVEN(7) , EIGHT(8) , NINE(9), TEN(10) ,
    JACK(10), QUEEN(10) , KING(10), ACE(11);
    int aVal;

    BlackJackRank(int i) {
        aVal = i;
    }
    public String toString (){
        switch (this){

            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
            case TEN:
                return aVal + "";
            case JACK:
            case QUEEN:
            case KING:
            case ACE:
                String upper = super.toString();
                return StringUtils.capitalize(upper);
            default:
                return null;//throw exception

        }
    }
    public  int getaVal (){
        return aVal;
    }


}
