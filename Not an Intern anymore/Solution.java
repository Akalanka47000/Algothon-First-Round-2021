import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < num; i++) {
            String str[] = reader.readLine().trim().split(" ");
            double b1 = Double.parseDouble(str[0]);
            double b2 = Double.parseDouble(str[1]);
            double b3 = Double.parseDouble(str[2]);
            if ((b1 + b2) != b3 && b1 != b3 && b2 != b3) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }

        }
    }
}