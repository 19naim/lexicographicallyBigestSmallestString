// Java substring

package com.stringUnderstanging;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();

        System.out.println(getSmallestAndLarges(s,k));
    }
    public static String getSmallestAndLarges(String s, int k){
        List<String> ls = new ArrayList<>();
        String sSub = "z";
        String bSub = "";

        if(s.length() == k){
            return s + "\n" +s;
        }

        for (int i = 0; i < s.length()-(k-1); i++) {
            //ss[i] = s.substring(i,i+size);
            ls.add(s.substring(i,i+k));
        }
        System.out.println(sSub.compareTo(ls.get(0)));
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 1; j < ls.size(); j++) {
                if ((ls.get(i).compareTo(ls.get(j)) < 0) && (ls.get(i).compareTo(sSub) < 0)) {
                        sSub = ls.get(i);
                }

            }
        }

        for (int i = 0; i < ls.size(); i++) {
            for (int j = 1; j < ls.size(); j++) {
                if ((ls.get(i).compareTo(ls.get(j)) > 0) && (ls.get(i).compareTo(bSub) > 0)) {
                        bSub = ls.get(i);
                }
            }
        }
        return sSub +"\n"+ bSub;
    }
}
