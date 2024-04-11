public class plus_one_two {
    static int[] plusOne (int[] digits){
        for(int i = digits.length-1; i >=0; i--){
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arrayOfDigits = {9};
        int arrayOfNum[] = plusOne(arrayOfDigits);
        for(int i = 0; i < arrayOfNum.length; i++){
            System.out.println("|||LOG: " + arrayOfNum[i]);
        }
    }

}
