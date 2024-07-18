a = []
max_a, max_n, max_m = 0,0, 0
for n in range(9):
    row = list(map(int,input().split()))
    a.append(row)

for n in range(9):
    for m in range(9):
        if(max_a < a[n][m]):
            max_a = a[n][m]
            max_n, max_m = n, m
print(max_a)
print(max_n+1,max_m+1)