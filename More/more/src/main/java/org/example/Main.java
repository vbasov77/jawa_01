// Перекинуть все 3 в конец массива

package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int val = 3;
        int[] nums = {3, 2, 2, 3, 1, 1, 3, 3};
        ArrayList new_arr = new ArrayList();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                new_arr.add(nums[i]);
            }
        }
        for(int j = 0; j < count; j++){
            new_arr.add(val);
        }
        System.out.println(new_arr);
    }
}