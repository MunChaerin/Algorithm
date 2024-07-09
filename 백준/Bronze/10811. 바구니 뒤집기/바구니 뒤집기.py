n, m = map(int,input().split())
arr = list(i for i in range(1,n+1))
for y in range(m):
    i, j = map(int,input().split())
    for i in range(i, j):
        arr[i-1],arr[j-1] = arr[j-1],arr[i-1]
        j -= 1
        if i>=j : break
for x in arr:
    print(x, end=' ')