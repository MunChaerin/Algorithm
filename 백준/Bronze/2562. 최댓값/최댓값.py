arr=[]
max_n = 0
max_i = 0
for i in range(9):
    n = int(input())
    arr.append(n)
    if(max_n<n):
        max_n = n
        max_i = i+1
print(max_n)
print(max_i)