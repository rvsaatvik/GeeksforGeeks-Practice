import java.util.Scanner;

/**
 * Created by saatvik on 10/28/16.
 */
public class IfStringsAreRotationsOfEachOther {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder str1 = new StringBuilder(sc.next());
        String str2 = sc.next();

        int n = str2.length();
        int flag = 1;

        StringBuilder temp = str1.append(str1);
        int m = temp.length();

        for(int i=0; i<m-n+1; i++)
        {
            if (temp.substring(i,i+n).equals(str2))
                flag = 0;
        }

        if(flag==0)
            System.out.print("Yes");
        else
            System.out.println("No");

    }

}
