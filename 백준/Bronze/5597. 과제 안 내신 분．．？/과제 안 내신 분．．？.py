arr = list(i for i in range(1,31))
arr_no = []
for i in range(28):
    n = int(input())
    arr.remove(n)
print(min(arr))
print(max(arr))
