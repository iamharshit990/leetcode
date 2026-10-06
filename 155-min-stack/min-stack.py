class MinStack:

    def __init__(self):
        self.stack = []
        self.min_el  =[]
        
        

    def push(self, value: int) -> None:
        self.stack.append(value)

        if not self.min_el or value<=self.min_el[-1]:
            self.min_el.append(value)
        

    def pop(self) -> None:
        if len(self.stack)==0:
            return None
        if self.stack.pop() == self.min_el[-1]:
            self.min_el.pop()    

    def top(self) -> int:
        if len(self.stack)==0 : return None
        return self.stack[-1]

    def getMin(self) -> int:
        return self.min_el[-1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(value)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()