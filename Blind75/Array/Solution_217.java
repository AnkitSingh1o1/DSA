package Blind75.Array;
class Solution_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i))
            return true;
            set.add(i);
        }
        return false;
    }
}