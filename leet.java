package newPack;

import java.util.Scanner;

public class leet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("K value: ");
        int k = scan.nextInt();

        int[] nums = {1, 2, 3, 1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] == nums[j]){
                    if (Math.abs(i - j) <= k){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }

                }

            }

        }
    }
}
