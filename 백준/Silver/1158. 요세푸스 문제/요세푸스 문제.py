import sys
n, k = map(int,sys.stdin.readline().split())
arr = [ i for i in range(1,n+1) ]
answer = []
index = 0
for i in range(n):
    index += k-1
    if index >= len(arr):
        index = index % len(arr)
    answer.append(arr.pop(index))
print(str(answer).replace('[','<').replace(']','>'))