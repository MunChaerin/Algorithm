arr=list()
for _ in range(3):
    arr.append(int(input()))
if sum(arr)==180:
    print('Equilateral' if len(set(arr))==1 else 'Isosceles' if len(set(arr))==2 else 'Scalene')
else: print('Error')