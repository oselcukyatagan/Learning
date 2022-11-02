package newPack;

import java.util.ArrayList;

class water {

    public static void main(String[] args) {


        int[] nums = {1, 3, 5, 7};
        int target = 8;
        searchInsert(nums, target);
    }

    public static int searchInsert(int[] nums, int target) {

        ArrayList<Integer> a = new ArrayList();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                System.out.println(i);
                a.add(i);
            }
        }

        if(a.size() == 0) {

            if(target > nums[nums.length - 1]) {
                System.out.println(nums.length);
            }
            else {
                for(int x = 0; x <= nums.length; ) {
                    while(nums[x] < target) {
                        x++;
                    }
                    System.out.println(x);
                }
            }
        }
        return 0;
    }
}
