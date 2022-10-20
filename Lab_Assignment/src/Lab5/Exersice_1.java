package Lab5;
import java.util.*;
public class Exersice_1  extends Exception{
    public Exersice_1(String str) {
        super(str);
    }

    static public void valAge(int age) throws Exersice_1 {
        if (age <= 15) {
            throw new Exersice_1("Age should be above 15");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ag = sc.nextInt();
        try {
            valAge(ag);
        } catch (Exersice_1 e) {
            System.out.println(e);
        }
    }
}


