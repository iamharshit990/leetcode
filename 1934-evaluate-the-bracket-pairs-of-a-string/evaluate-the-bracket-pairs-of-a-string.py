class Solution:
    def evaluate(self, s: str, arr: list[list[str]]) -> str:
        dic = {}
        res = []
        curr =[]
        flag = False
        n = len(arr)
        for i in range (n):
            dic[arr[i][0]] = arr[i][1]
        for ch in s:
            if ch == "(":
                flag = True
            elif ch ==")":
                flag = False
                key = "".join(curr)
                res.append(dic.get(key,"?"))
                curr=[]
            else:
                if flag:
                    curr.append(ch)
                else:
                    res.append(ch)
                
        return "".join(res)

        