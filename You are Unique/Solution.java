import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine().trim());
        String str = reader.readLine().trim();
        List<String> duplicates = new ArrayList();
        int count = num;
        for (char c : str.toCharArray()) {
            if (str.replaceFirst(String.valueOf(c), "").contains(String.valueOf(c))) {
                if (!duplicates.contains(String.valueOf(c)))
                    duplicates.add(String.valueOf(c));
                num--;
            }
        }
        num += duplicates.size();
        System.out.println(num);

    }
}