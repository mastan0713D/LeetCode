import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int total=0;
        int preValue=0;

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int value=getValue(ch);

            if(value<preValue){
                total-=value;

            }
            else{
                total+=value;
            }
            preValue=value;
        }
    
        return total;
    }
        public static int getValue(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }


    
}