package weeklycodingchallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class WeeklyCodingChallenge {
    public static void main(String[] args) {
        int[] array = {4562,68437};
        reorderDigit(array,"asc");
        reorderDigit(array,"desc");
    }
    public static void reorderDigit(int[] number,String order){
        ArrayList<Integer> finalSortedNumber = new ArrayList<>();
        for (int k : number) {
            String digits = String.valueOf(k);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < digits.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
                list.add(digit);
                if(order == "asc"){
                    list.sort(Comparator.naturalOrder());
                }
                else{
                    list.sort(Comparator.reverseOrder());
                }
                StringBuilder finalStrNum = new StringBuilder();
                for (int num : list) {
                    String stringNum = Integer.toString(num);
                    finalStrNum.append(stringNum);
                    if(finalStrNum.length() == digits.length()){
                        finalSortedNumber.add(Integer.parseInt(String.valueOf(finalStrNum)));
                    }
                }
            }
        }
        System.out.println(finalSortedNumber);
    }
}
