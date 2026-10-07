# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: ListNode | None) -> ListNode | None:
        arr = []
        curr = head
        while curr!=None:
            arr.append(curr.val)
            curr = curr.next
        stack = []
        stack.append(arr[len(arr)-1])
        ans = [-1]*len(arr)
        for i in range(len(arr)-2,-1,-1):
            while stack and stack[-1]<=arr[i]:
                stack.pop()
            if not stack:
                ans[i] = -1
            else:
                ans[i] = stack[-1]
            stack.append(arr[i])
        
        res_head = ListNode()
        curr = res_head
        for i in range(len(ans)):
            if ans[i]==-1:
                node= ListNode(arr[i])
                curr.next = node
                curr = curr.next
            
        return res_head.next


        
     
        

        
        