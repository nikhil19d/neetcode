class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> s = new ArrayDeque<>();
        int[][] p = new int[position.length][2];
        for(int i = 0; i < speed.length; i++){
            p[i][0] = position[i];
            p[i][1] = speed[i];
        }
        Arrays.sort(p,(a,b)->Integer.compare(a[0],b[0]));
        for(int i = 0; i < speed.length; i++){
            double sp = (double)(target - p[i][0])/p[i][1];
            while(!s.isEmpty() && s.peek() <= sp){
                s.pop();
               // System.out.println(s.peek());
            }
            s.push(sp);
            System.out.println(sp);
           // System.out.println(s.peek());
        }
        return s.size();
    }
}
