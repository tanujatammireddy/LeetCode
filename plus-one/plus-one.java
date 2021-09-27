class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length-1;
        digits[len] ++;
        int carry = 0;
        if(digits[len] == 10){
            digits[len] = 0;
            carry = 1;
            }
        len--;
        while(len >= 0 && carry == 1){
            digits[len]++;
            if(digits[len] == 10){
                digits[len] = 0;
                carry = 1;
            }
            else
                carry = 0;
            len--;
        }
        if(carry == 1)
        {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}