class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        ArrayList<Integer> sizes = new ArrayList<>();
        for(String s : strs){
            sizes.add(s.length());
        }
        for(Integer i : sizes){
            str.append(i).append(',');
        }
        str.append('#');
        for(String s : strs){
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        ArrayList<Integer> sizes = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder s = new StringBuilder();
            while(str.charAt(i) != ','){
                s.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(s.toString()));
            i++;
        }
        i++;
        for(Integer s : sizes){
            res.add(str.substring(i, i + s));
            i += s;
        }
        return res;
    }
}
