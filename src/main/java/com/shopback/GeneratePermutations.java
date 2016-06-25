package com.shopback;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by ankit on 25/6/16.
 */
public class GeneratePermutations {
    private Set<String> permutations = null;

    public Set<String> getAllPermutations(String s) {
        if(s==null){
            return null;
        }
        permutations = new LinkedHashSet<String>();
        char[] name = s.toCharArray();
        permutations(name, 0, name.length);
        //Print all the permutations

        Iterator<String> itr = permutations.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        return permutations;
    }


    private synchronized void permutations(char[] s, int startIndex, int lenght) {
        if (startIndex == lenght) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lenght; i++) {
                sb.append(s[i]);
            }
            permutations.add(sb.toString());
        }
        for (int i = startIndex; i < lenght; i++) {
            char temp = s[startIndex];
            s[startIndex] = s[i];
            s[i] = temp;
            permutations(s, startIndex + 1, lenght);
            char temp1 = s[startIndex];
            s[startIndex] = s[i];
            s[i] = temp1;
        }
    }
}
