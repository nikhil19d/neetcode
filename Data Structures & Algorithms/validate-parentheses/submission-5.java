class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chr = s.toCharArray();
        for(Character c : chr){
            if(c == '[' || c == '(' || c == '{') stack.push(c);
            else {
                if(stack.isEmpty() == true) return false;
                else {
                    if((stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}') || (stack.peek() == '(' && c == ')')){
                        stack.pop();
                        // System.out.println(c);
                    } else return stack.isEmpty();
                }
            }
        }
        return stack.isEmpty();
    }
}
