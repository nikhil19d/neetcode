class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1 );
        }
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new int[]{
                entry.getValue(), entry.getKey()
            });
        }
        list.sort((a,b) -> b[0] - a[0]);
        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = list.get(i)[1];
        }
        return arr;

    }
}
