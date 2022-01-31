import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine().trim();
        int count = 1;
        char checkingChar = num.charAt(0);
        num += "*";
        String finalStr = "";
        int index = 0;
        for (char c : num.toCharArray()) {
            if (index != 0) {
                if (c == checkingChar) {
                    count++;
                } else {
                    finalStr += String.valueOf(count) + String.valueOf(checkingChar);
                    count = 1;
                    checkingChar = c;
                }
            }
            index++;
        }
        System.out.println(finalStr);

    }
}