import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String nums[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(nums));
        for (char c : str.toCharArray()) {
            list.remove(String.valueOf(c));
        }
        System.out.println(list.get(0));
    }
}