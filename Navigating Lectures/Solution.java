// passes 5/7 test cases

import java.io.*;
import java.util.*;

public class Solution {
    static ArrayList<Integer> sums = new ArrayList();

    public static void navigate(String[] list, int sum, Boolean physical, int onlineStreak, int physicalStreak) {
        if (list.length == 0) {
            sums.add(sum);
            return;
        }

        if (physical) {
            physicalStreak++;
            onlineStreak = 0;
            sum += Integer.parseInt(list[0]);
        } else {
            onlineStreak++;
            physicalStreak = 0;
            sum += Integer.parseInt(list[0]) / 2;
        }
        list = Arrays.copyOfRange(list, 1, list.length);
        if (onlineStreak < 1) {
            if (physicalStreak < 2) {
                navigate(list, sum, true, onlineStreak, physicalStreak);
                navigate(list, sum, false, onlineStreak, physicalStreak);
            } else {
                navigate(list, sum, false, onlineStreak, physicalStreak);
            }

        } else {
            navigate(list, sum, true, onlineStreak, physicalStreak);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine().trim());
        String numbers[] = reader.readLine().trim().split(" ");
        int onlineStreak = 0;
        int physicalStreak = 0;
        int sum = 0;
        navigate(numbers, sum, true, onlineStreak, physicalStreak);
        navigate(numbers, sum, false, onlineStreak, physicalStreak);
        Collections.sort(sums);
        System.out.println(sums.get(sums.size() - 1));

    }
}