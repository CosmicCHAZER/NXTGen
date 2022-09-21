import java.util.*;
public class SunnyNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        int nextn = n + 1 ;
        if(Math.ceil((double)Math.sqrt(nextn)) == Math.floor((double)Math.sqrt(nextn)))
            System.out.print("NUMBER IS SUNNY NUMBER");
        else
            System.out.print("NUMBER IS NOT SUNNY NUMBER");
    }
}