while True:
    a= list(map(int,input().split()))
    if sum(a)==0 : break
    print(('Invalid','Equilateral','Isosceles','Scalene')[(max(a)<sum(a)-max(a))*len({*a})])
