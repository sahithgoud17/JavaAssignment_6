package assignment6;

import java.util.*;

public class VampireNumber
{
    public static void main(String[] args)
    {
        int count=0;
        for (int x = 10;x<1000 ; x++)
        {
            String sx = String.valueOf(x);
            for (int y = x; y < 1000; y++)
            {
                int v = x * y;
                String sy = String.valueOf(y);
                String sv = String.valueOf(v);
                if (sortList(sx + sy).equals(sortList(sv)))
                {
                    System.out.printf("%d * %d = %d%n", x, y, v);
                    count++;
                }
                if(count==100){
                    break;
                }
            }
        }
    }

    private static List<Character> sortList(String v)
    {
        List<Character> vc = new ArrayList<Character>();
        for (int j = 0; j < v.length(); j++)
        {
            vc.add(v.charAt(j));
        }
        Collections.sort(vc);
        return vc;
    }
}