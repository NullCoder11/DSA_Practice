class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if sorted(s)!=sorted(t):
            return False
        else:
            return True
        
        if(len(s)!=len(t)):
            return False
        

        