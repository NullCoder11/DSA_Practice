class Solution {
    public boolean isPalindrome(String s) {
        // if(s==null||s.length()==0){
        //     return false;
        // }
        
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length()-1;
        if(s==null||s.length()==0){
            return true;
        }
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}