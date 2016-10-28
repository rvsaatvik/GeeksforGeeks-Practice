import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by saatvik on 10/28/16.
 */
public class RemoveDuplicates {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] a = input.toCharArray();
        Arrays.sort(a);

        String ip = new String(a);
        StringBuilder sb = new StringBuilder(ip);
        int i =0;

        while (i<sb.length()-1)
        {
            if(sb.charAt(i)==sb.charAt(i+1))
                sb.deleteCharAt(i);
            else
                i++;
        }

        System.out.println(sb);


    }


}
