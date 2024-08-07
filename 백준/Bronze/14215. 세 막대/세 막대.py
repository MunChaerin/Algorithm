a = sorted(map(int,input().split()))
res = a[0]+a[1]+min(a[2],a[0]+a[1]-1)
print(res)