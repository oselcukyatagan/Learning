package newPack;

import java.util.ArrayList;

class fr {

    public static void main(String[] args) {


        int[] nums = {1,3,5,7};
        int target = 6;
        searchInsert(nums, target);

    }

    public static int searchInsert(int[] nums, int target) {

        ArrayList<Integer> a = new ArrayList();
        int x = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                System.out.println(i);
                a.add(i);
            }
        }

        if(a.size() == 0) {

            while(nums[x] < target) {
                x += 1;

            }
            System.out.println(x);
        }
        return 0;
    }
}
