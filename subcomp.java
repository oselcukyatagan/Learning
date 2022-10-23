import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            ArrayList<String> sub_str = new ArrayList<String>();
            int number_of_letter = scan.nextInt();
            int x = word.length();

            for(int i = word.length() - number_of_letter; i > -1; i--){
                sub_str.add(word.substring(i,x));
                x -= 1;

            }
            Collections.sort(sub_str);
            //System.out.println(sub_str);
            System.out.println(sub_str.get(0));
            System.out.println(sub_str.get(sub_str.size() - 1));

    }
}
