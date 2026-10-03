class Solution:
    def canCompleteCircuit(self, gas: list[int], cost: list[int]) -> int:
        if sum(gas)<sum(cost):
            return -1
        
        curr_gas = 0
        start = 0
        for i in range(len(gas)):
            curr_gas+=(gas[i]-cost[i])
             
            if curr_gas<0:
                start = i+1
                curr_gas = 0
        return start

        