import java.util.HashMap;
import java.util.Map;

public class twoSumHashMap {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        // first send all values in the array into the hashmap

        for(int i=0; i < nums.length; i++) {
            map.put(nums[i], i); // key-value pair for index and its corresponding value.
        }

        for(int i=0; i<nums.length; i++) {

            // find the complement for the sum leading to the target with every index value
            int complement = target - nums[i];

            // check if this complement exists in our map
            // second and condition is for the edge case

            if(map.containsKey(complement) && map.get(complement) != i) {

                int[] targetArr = new int[2];
                targetArr[0] = i;
                targetArr[1] = map.get(complement);

                return targetArr;
            }

        }

        // no solution case
        return null;

    }
}
