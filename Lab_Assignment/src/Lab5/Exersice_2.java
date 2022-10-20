package Lab5;
import java.util.*;
import java.util.regex.*;
public class Exersice_2  extends Exception{
    public Exersice_2 (String str) {
        super(str);
    }
    static public void valName(String fullName) throws Exersice_2{


        if(!(Pattern.matches("\\[a-zZ-A]", fullName))) {
            throw new Exersice_2("Full Name Can Not Be Blank");
        }else {
            System.out.println("Full Name Valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName=sc.next();
        try {
            valName(fullName);
        }catch(Exersice_2 e) {
            System.out.println(e);
        }
    }
}


