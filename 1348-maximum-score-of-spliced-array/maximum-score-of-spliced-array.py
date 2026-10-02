class Solution:
    def maximumsSplicedArray(self, nums1: list[int], nums2: list[int]) -> int:
        diff=[0]*len(nums1)
        sum_of_nums1=sum(nums1)
        for i in range(len(nums2)):
            diff[i] = nums2[i] - nums1[i]
        curr_max= diff[0]
        cans = 0
        for i in range(len(diff)):
            cans = max(diff[i],cans+diff[i])
            curr_max = max(cans,curr_max)
        choice1 = sum_of_nums1+curr_max

        diff2 = [0]*len(nums2)
        for i in range(len(nums2)):
            diff2[i] = nums1[i] - nums2[i]
        sum_of_nums2 = sum(nums2)
        curr_max = 0
        cans=0
        for i in range(len(nums2)):
            cans = max(cans+diff2[i],diff2[i])
            curr_max = max(cans,curr_max)

        choice2 = sum_of_nums2+curr_max
        return max(max(sum_of_nums1,sum_of_nums2),max(choice1,choice2))
            



        

        



        
        