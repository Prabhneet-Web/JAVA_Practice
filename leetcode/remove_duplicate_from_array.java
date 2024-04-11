class remove_duplicate_from_array{

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        
    }
}