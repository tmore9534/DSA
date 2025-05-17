# find the Pow(a, b) or a ^ b in O(logn)
# Use Binary Exp. a ^ b = (a^(b/2)) ^ 2
# if we want to add Mod Operation, we can mod it.

class Solution:
    def findPow(self, base, exp):
        if exp == 0:
            return 1
        half = self.findPow(base, exp//2)
        result = half * half
        if exp % 2 == 1:
            result *= base
        return result

s = Solution()
print(s.findPow(10, 12))






