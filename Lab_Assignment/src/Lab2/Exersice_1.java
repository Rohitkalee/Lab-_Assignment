package Lab2;
import java.util.*;
public class Exersice_1  {

    int getSecondSmallest(int[] arr){
        Arrays.sort(arr);
        return arr[1];
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements : ");
        int n=sc.nextInt(),i;
        int [] arr=new int[n];
        for(i=0;i<n;i++) {
            int ele=sc.nextInt();
            arr[i]=ele;

        }
        Exersice_1 obj1=new Exersice_1();
        System.out.println(obj1.getSecondSmallest(arr));
    }
}


