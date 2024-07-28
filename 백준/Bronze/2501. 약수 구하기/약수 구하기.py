n,k = map(int,input().split())
arr = [i for i in range(1,n+1) if n%i==0]
print(0 if len(arr)<k else arr[k-1])