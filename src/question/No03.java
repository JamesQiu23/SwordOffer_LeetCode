package question;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/*
题目：找出数组中重复的数字
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
*/
public class No03 {
    public static void main(String[] args) {
        Integer repeatNumber = Solution03.findRepeatNumber(new int[]{2, 3, 3});
        System.out.println(repeatNumber);
    }
}

class Solution03 {
    public static Integer findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.add(nums[i])==false){
                return nums[i];
            }
        }
        return -1;
    }
}