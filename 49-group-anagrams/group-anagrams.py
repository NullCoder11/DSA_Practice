class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        
        grouped_anagrams = defaultdict(list)
        for s in strs:
            key = ''.join(sorted(s))
            grouped_anagrams[key].append(s)
        
        return list(grouped_anagrams.values())

        