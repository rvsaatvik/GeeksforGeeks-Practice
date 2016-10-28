/**
 * Created by saatvik on 10/28/16.
 */

import java.util.HashMap;

/* Name of the class has to be "Main" only if the class is public. */
class MaxOccurring
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        String str1="asdf is aaa FGGGGGGGGGGG goodg";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int count=1;
        int tmp;
        int max=0;
        char result=' ';

        for(int i=0;i<str1.length();i++)
        {
            try
            {
                tmp=map.put(str1.charAt(i), count);
            }
            catch(NullPointerException n)
            {
                tmp=-1;
            }

            if(tmp>0)
            {
                tmp++;
                map.put(str1.charAt(i), tmp);
            }

            if(tmp>max)
            {
                max=tmp;
                result=str1.charAt(i);
            }
        }

        //System.out.println(map);
        System.out.println("Result is-->" + result);

    }
}