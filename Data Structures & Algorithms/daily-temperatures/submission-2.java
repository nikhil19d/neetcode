class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Deque<int []> stack = new ArrayDeque<>();
        for(int i = 0; i < temperatures.length; i++){
            
            while(!stack.isEmpty() && (temperatures[i] > stack.peek()[0])){
                int[] e = stack.pop();
                res[e[1]] = i - e[1];
            }
            stack.push(new int[]{
                temperatures[i], i
            });
        }
        return res;
    }
}
