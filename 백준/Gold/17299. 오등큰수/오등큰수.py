n = int(input())
stack=[0]
NGF = [-1]*n
num = list(map(int,input().split()))
num1=[0]*1000001
for i in num:
    num1[i] += 1
for i in range(n):
    while stack and num1[num[stack[-1]]]<num1[num[i]]:
        NGF[stack.pop()] = num[i]
    stack.append(i)
print(" ".join(map(str,NGF)))   