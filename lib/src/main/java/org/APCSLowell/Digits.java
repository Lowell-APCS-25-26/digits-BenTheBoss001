package org.APCSLowell;

import java.util.ArrayList;

public class Digits {
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number
     */
    public ArrayList<Integer> digits;
    

    /** Constructs a `Digits` object that represents `num`.
     *  *Precondition*: `num >= 0`
     */
    public Digits(int num) {
        digits = new ArrayList<Integer>();
        String str = Integer.toString(num);
        for(int i = 0; i < str.length(); i++){
            digits.add(Integer.parseInt(str.substring(i,i+1)));
        }
        //throw new UnsupportedOperationException();
    }

    /** Returns `true` if the digits in this `Digits` object are in strictly increasing order;
     *      `false` otherwise.
     */
    public boolean isStrictlyIncreasing() {
        if (digits.size() <= 1){
            return true;
        }
        for (int i = 1; i < digits.size(); i++){
            if (digits.get(i) < digits.get(i-1)){
                return false;
            }
        }
        return true;
        //throw new UnsupportedOperationException();
    }
}
