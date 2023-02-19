package org.example;



    // you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class trhee {
        public String solution(int N) {
            List<Character> letters = new ArrayList<>();
            for (char c = 'a'; c <= 'z'; c++) {
                letters.add(c);
            }

            int n = letters.size();
            int m = N / n;
            int r = N % n;

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                for (char c : letters) {
                    sb.append(c);
                }
            }
            for (int i = 0; i < r; i++) {
                sb.append(letters.get(i));
            }
            return sb.toString();
        }
    }