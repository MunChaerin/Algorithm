n = int(input())
arr = list(map(int,input().split()))
m = max(arr)
for i in range(len(arr)):
    arr[i] = arr[i]/m*100
result = sum(arr)
print(result/len(arr))