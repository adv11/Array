package Java_pepcoding;
/*
1. You are given a string that contains only lowercase and uppercase alphabets.
2. You have to toggle the case of every character of the given string.
Input Format
A String
Output Format
A String
Constraints
1 <= length of string <= 1000
Sample Input
pepCODinG
Sample Output
PEPcodINg
*/
import java.util.Scanner;

public class ToggleCase_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t:");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println("Enter String:");
            String s = sc.next();

            StringBuilder ans = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                    ans.append(String.valueOf(c));
                } else {
                    c = Character.toUpperCase(c);
                    ans.append(String.valueOf(c));
                }
            }
            System.out.println(ans);
        }
    }
}
