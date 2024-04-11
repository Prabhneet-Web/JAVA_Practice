public class search_insert_position {

    static int searchInsert(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                if (nums[i] == target) {
                    return i;
                } else if (i == (nums.length - 1)) {
                    return nums.length;
                }
            } else {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 6 };
        System.out.println("|||Index: " + searchInsert(array, 2));
    }
}