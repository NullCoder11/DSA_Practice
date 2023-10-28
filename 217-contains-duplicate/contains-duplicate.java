class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>dupe = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            //if the hashset already has the element
            if(dupe.contains(nums[i])){
                return true;
            }
            //if it dosen't then adds to the hashset
            else{
                dupe.add(nums[i]);

            }
        }
        return false;

    }
}