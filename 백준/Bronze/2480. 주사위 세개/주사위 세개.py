a, b, c = map(int,input().split())
if a==b==c :
    print(10000+a*1000)
elif a==b and a!= c :
    print(1000+a*100)
elif a==c and a!= b :
    print(1000+a*100)
elif c==b and c!= a :
    print(1000+c*100)
else :
    if a>b and a>c :
        print(a*100)
    elif b>a and b>c :
        print(b*100)
    else :
        print(c*100)