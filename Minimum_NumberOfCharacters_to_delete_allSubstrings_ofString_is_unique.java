package com.company;
/*
Ex- aba , substrings = {a, b, a, ab, ba, aba}
so we can remove 'a' then all the subsets will be unique.
*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Minimum_NumberOfCharacters_to_delete_allSubstrings_ofString_is_unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> res = new HashSet<>();
        for(int i=0 ; i<s.length() ; i++){
            res.add(s.charAt(i));
        }
        System.out.println(s.length() - res.size());
    }
}
