class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        return [i for i in nums]+[i for i in nums]