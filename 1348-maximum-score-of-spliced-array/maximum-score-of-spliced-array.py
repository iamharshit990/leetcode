class Solution:
    def maximumsSplicedArray(self, nums1: list[int], nums2: list[int]) -> int:
        diff1 = [0]*len(nums1)
        for i in range(len(nums1)):
            diff1[i] = nums2[i] - nums1[i]
        cbest = 0 
        best = diff1[0]
        for i in range(len(nums1)):
            cbest = max(diff1[i],cbest+diff1[i])
            best = max(best,cbest)

        diff2 = [0]*len(nums1)
        for i in range(len(nums1)):
            diff2[i] = nums1[i] - nums2[i]
        
        cbest2 = 0
        best2 = diff2[0]
        for i in range(len(nums2)):
            cbest2 = max(diff2[i],cbest2+diff2[i])
            best2 = max(best2,cbest2)

        sum1 = sum(nums1)
        sum2 = sum(nums2)
        return max(sum1,sum2,sum1+best,sum2+best2)

            
            
        



        