n = int(input())
stack=[0]
NGE = [-1]*n
num = list(map(int,input().split()))
for i in range(1,n):
    while stack and num[stack[-1]]<num[i]:
        NGE[stack.pop()] = num[i]
    stack.append(i)
print(*NGE)