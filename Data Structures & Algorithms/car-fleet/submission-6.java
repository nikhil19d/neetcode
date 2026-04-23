class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        int[][] ps = new int[pos.length][2];
        for(int i = 0; i < pos.length; i++){
            ps[i][0] = pos[i];
            ps[i][1] = speed[i];
        }
        Deque<Float> stack = new ArrayDeque<>();
        Arrays.sort(ps,(a,b)->Integer.compare(a[0],b[0]));
        for(int i = 0; i < pos.length; i++){
            float time = (float)(target - ps[i][0])/ps[i][1];
            while(!stack.isEmpty() && stack.peek() <= time){
                stack.pop();
            }
            stack.push(time);
        }
        return stack.size();
    }
}
