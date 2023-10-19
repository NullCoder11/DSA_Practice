class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }
        //map used to store the groups of anagrams
        Map<String,List<String>>map = new HashMap<>();
        for(String s:strs){
            //for each string converts it to the character array
            char[]charArray = s.toCharArray();
            //after conversion sorts the array
            Arrays.sort(charArray);
            //creating a new string from sorted array which acts as the key for grouping
            String sorted = new String(charArray);
            //checking whether sorted string exists as a key in the map
            if(!map.containsKey(sorted)){
                //if it dosen't 
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);

        }
        return new ArrayList<>(map.values());
    }
}