import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B2{
    public static void main(String[] args){
        System.out.print("Enter input: ");
        Scanner input = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");

        String s = input.nextLine();
        boolean isContains = set.contains(s);
        System.out.println(isContains? "Yes" : "No");
    }
}
