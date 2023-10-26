class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null||strs.length==0) {
           return new ArrayList<>();
       }
       //map used to store the group of anagrams
           //key  value        pair
       Map<String,List<String>>map = new HashMap<>();
       for(String s:strs){
           //converting each string to char array
           char[]arr = s.toCharArray();
           //after conversion sorting the array
           Arrays.sort(arr);
           //creating a new string from sorted arr which acts as the key for grouping
           String sorted = new String(arr);  
           //checking whether sorted string exists as a key in the map
           if(!map.containsKey(sorted)){
               //if not
               map.put(sorted,new ArrayList<>());
           }
           map.get(sorted).add(s);
           
           
        }
        return new ArrayList<>(map.values());


    }
}