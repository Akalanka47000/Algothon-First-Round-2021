import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str[] = reader.readLine().trim().split("\\)");
        String output = "";
        for (int i = 0; i < str.length; i++) {
            String s = str[i].replaceAll("\\)", "");
            String splitted[] = s.split("\\(");
            int count = Integer.parseInt(splitted[0]);
            output += splitted[1].repeat(count);
        }
        System.out.println(output);
    }
}