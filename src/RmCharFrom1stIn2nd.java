import java.util.Scanner;

/**
 * Created by saatvik on 10/28/16.
 */
public class RmCharFrom1stIn2nd {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(deletechars(str1,str2));


    }

    private static String deletechars(String str1, String str2)
    {
        StringBuilder s1 = new StringBuilder(str1);
        int i=0,j=0;

            while (j<s1.length() && i<str2.length())
            {
                if(s1.charAt(j) == str2.charAt(i))
                {
                    s1.deleteCharAt(j);
                    i++;
                }
                else
                    j++;

            }

    return s1.toString();
    }


}
