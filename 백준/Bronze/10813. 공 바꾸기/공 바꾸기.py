n, m = map(int,input().split())
b=[0] * (n)
for x in range(0,n):
    b[x] = x+1
for _ in range(m):
    i,j = map(int,input().split())
    b[i-1],b[j-1] = b[j-1],b[i-1]
for j in range(len(b)):
    print(b[j],end=' ')