class Solution:
    def maximumsSplicedArray(self, nums1: list[int], nums2: list[int]) -> int:
        # in 1 pass
        sum1 = 0
        sum2 = 0

        curr_max1 = 0
        curr_max2 = 0

        final_max1 = 0
        final_max2 = 0

        for i in range(len(nums1)):
            sum1+=nums1[i]
            sum2+=nums2[i]

            curr_max1 = max((nums2[i]-nums1[i]),curr_max1+(nums2[i]-nums1[i]))
            curr_max2 = max((nums1[i]-nums2[i]),curr_max2+(nums1[i]-nums2[i]))

            final_max1 = max(final_max1,curr_max1)
            final_max2 = max(final_max2,curr_max2)

        return max(sum1,sum2,sum1+final_max1,sum2+final_max2)
        