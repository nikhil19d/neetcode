class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) return "";
        List<Integer> sizes = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for(String str : strs){
            sizes.add(str.length());
        }
        for(int size : sizes){
            s.append(size).append(',');
        }
        s.append('#');
        for(String str : strs){
            s.append(str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        List<String> decoded = new ArrayList<>();
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
        for(int size : sizes){
            decoded.add(str.substring(i,i+size));
            i += size;
        }     
        return decoded;
    }
}
