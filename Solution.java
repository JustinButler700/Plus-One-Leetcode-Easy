class Solution {
    public int[] plusOne(int[] digits) {
        boolean carryOver = true; 
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carryOver) {
                digits[i]++;
                carryOver = false;
            }
            if (digits[i] == 10) { //Cary the %10 digit, (since it is 9+1, the digit will always be 0)
                digits[i] = 0;
                carryOver = true;
            }
        }
        /*
        If carryOver is still true, it means that we were given an edge case
        such as [9, 9, 9], 
        This means we our current output is [0, 0, 0]
        so we need to append a 1.
        */
        if (carryOver) {
            int[] result = new int[digits.length + 1]; // add 1 to length
            result[0] = 1; // append 1
            System.arraycopy(digits, 0, result, 1, digits.length); // append remaining values.
            return result;
        }
        return digits;
    }
}
