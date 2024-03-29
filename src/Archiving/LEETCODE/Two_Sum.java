package Archiving.LEETCODE;

import java.util.HashMap;

public class Two_Sum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int left = target - nums[i];
      if (map.containsKey(left) && map.get(left) != i) {
        return new int[]{i, map.get(left)};
      }
    }

    return null;
  }
}
