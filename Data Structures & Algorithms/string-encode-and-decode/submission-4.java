class Solution {

    public String encode(List<String> strs) {
        String str = "";
        String l = "";
        for(int i = 0; i < strs.size(); i++){
            str += strs.get(i);
            l += strs.get(i).length()+",";
        }
        System.out.println(l + "#" + str);
        return l + "#" + str;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            String s = "";
            while(str.charAt(i) != ','){
                s += str.charAt(i);
                i++;
            }
            sizes.add(Integer.parseInt(s));
            i++;
        }
        i++;
        for(Integer val : sizes){
            list.add(str.substring(i, i+val));
            i += val;
        }
        // System.out.println(sizes);
        return list;
    }
}
