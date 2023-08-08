public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] intArray = new int[2];
        int target = 9;


        for(int i = 0; i < nums.length; i++){
            for(int j = i++; j < nums.length; j++){
                if(nums[i] + nums[j] == target){

                    intArray[0] = nums[i];
                    intArray[1] = nums[j];
                    System.out.println(intArray[0]+" "+intArray[1]);
            }
        }
    }
    }
}

