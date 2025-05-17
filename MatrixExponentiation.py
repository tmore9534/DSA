# find the theory in Notion and Extras in Notebook.
# Fibonnacci series using the ME approach
# 1. find T^n-1 using binary exponentiation
# Use formulae of Matrix Exponentiation

class Solution:
    def findFibonacci(self, n):
        T = [[1, 1], [1, 0]]   # value of T for fibonacci series
        tMOne = self.matrixExp(T, n - 1) # find the value of t^n-1
        # Put the values in ME formulae
        resMat = self.matrixMult(tMOne, [[1], [0]])
        return resMat[0][0]

    # Find ME using Binary Exponentiation O(log n)
    def matrixExp(self, base, exp):
        if exp <= 0:
            return [[1, 0],[0, 1]] # identity matrix 

        half = self.matrixExp(base, exp // 2)
        result = self.matrixMult(half, half)
        if exp % 2 == 1:
            result = self.matrixMult(result, base)

        return result

    def matrixMult(self, mat1, mat2):
        m, n = len(mat1), len(mat1[0])
        n, p = len(mat2), len(mat2[0])

        res = [[0] * p for _ in range(m)]
        for i in range(m):
            for j in range(p):
                for k in range(p1):
                    res[i][j] += m1[i][k] * m2[k][j]
        return res
       
                
s = Solution()
# find nth fibonnacci 0, 1, 1, 2, 3, 5  (0th to nth)
print(s.findFibonacci(5))


















