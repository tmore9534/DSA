# https://www.geeksforgeeks.org/problems/implement-queue-using-array/1
class MyQueue:
    
    def __init__(self):
        self.f = -1
        self.r = -1
        self.size = 100001
        self.currSize = 0
        self.q = [0] * self.size

        
    def push(self, x):
        if self.currSize == self.size:
            return
        
        if self.currSize == 0:
            self.f = 0
            self.r = 0
        else:
            self.r = (self.r + 1) % self.size
        
        self.q[self.r] = x
        self.currSize += 1
        
         #add code here
     
    #Function to pop an element from queue and return that element.
    def pop(self): 
        if self.currSize == 0:
            return -1
        
        ele = self.q[self.f]
        self.f = (self.f + 1) % self.size
        self.currSize -= 1
        
        if self.currSize == 0:
            self.f, self.r = -1, -1
        
        return ele