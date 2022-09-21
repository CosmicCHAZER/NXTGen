import java.util.*;
public class BinarySEARCH
{
    static public void main(String[] Args)
    {
        Scanner sc =  new  Scanner(System.in);
        int[] array =  new  int[10];
        System.out.println("ENTER A SORTED ARRAY");
        for (int i = 0;i <= 9;i++) {
            array[i] = sc.nextInt();
        }
        int SORTcheck = 0;
        for (int i = 1;i <= 9;i++) {
            if (array[i - 1] <= array[i]) {
                SORTcheck = SORTcheck + 1;
            }
        }
        if (SORTcheck == 9) {
            System.out.println("SORTED ARRAY");
        }
        else {
            System.out.println("UNSORTED ARRAY");
            System.exit(0);
        }
        System.out.println("ENTER THE SEARCHED NUMBER");
        int src = sc.nextInt();
        int first = 0;
        int last = array.length - 1;
        int mid = first + ((first + last) / 2);
        while (first <= last) {
            if (array[mid] < src) {
                first = mid + 1;
            }
            else if (array[mid] == src) {
                System.out.println(src + " FOUND AT INDEX " + (mid + 1) + ".");
                break;
            }
            else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(src + " IS NOT FOUND");
        }
    }
}
