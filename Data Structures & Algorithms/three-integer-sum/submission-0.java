class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int b = i + 1, c = nums.length - 1;
            while(b < c){
                if(nums[i] + nums[b] + nums[c] < 0) b++;
                else if(nums[i] + nums[b] + nums[c] > 0) c--;
                else {
                    list.add(Arrays.asList(nums[i],nums[b],nums[c]));
                    b++;
                    c--;
                    while(b < c && nums[b] == nums[b -1]){
                        b++;
                    }
                } 
            }
        }
        return list;
    }
}
