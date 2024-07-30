n = int(input())
m = int(input())
a=list()
for i in range(n,m+1):
    b =list()
    for j in range(1,i+1):
        if i%j==0:
            b.append(j)
    if i != 1 and len(b)==2:
        a.append(i)
print(f'{sum(a)}\n{min(a)}' if len(a)!= 0 else -1)