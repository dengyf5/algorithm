import java.util.*;
public class BinarySearch{
    public static int rank(int[] a,int t){
        int left = 0;
        int right = a.length - 1;
        int mid;
        while(left <= right){
            mid = (left + right)/2;
            System.out.println(mid);
            if(a[mid] == t){
                return mid;
            }else if(a[mid] < t){
                left = mid + 1;
                continue;
            }else if(a[mid] > t){
                right = mid - 1;
            }
        }
            return -1;
    }
}
