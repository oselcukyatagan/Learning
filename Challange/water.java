
import java.util.ArrayList;
import java.util.Scanner;

public class water {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
    }

    public static int maxArea(int[] height) {

        int a = 0;
        int b;

        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {

                if(height[i] <= height[j]) {

                    b = height[i] * (j - i);

                    if(a < b) {

                        a = b;
                    }
                }
                if(height[i] > height[j]) {

                    b = height[j] * (j - i);

                        if(a < b) {

                            a = b;
                        }
                    }

                }
            }

        System.out.println(a);
        return a;

    }
}


