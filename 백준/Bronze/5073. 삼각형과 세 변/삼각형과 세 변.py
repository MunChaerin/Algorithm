while True:
    a,b,c = map(int,input().split())
    if a==b==c==0 :
        break
    else:
        if max(a,b,c) == a:
            if a>=b+c : print('Invalid')
            else:    
                print('Equilateral' if a==b==c else 'Isosceles' if (a==b and a!=c) or (a==c and a!=b) or (c==b and a!=c) else 'Scalene')
        elif max(a,b,c) == b:
            if b>=a+c : print('Invalid')
            else:    
                print('Equilateral' if a==b==c else 'Isosceles' if (a==b and a!=c) or (a==c and a!=b) or (c==b and a!=c) else 'Scalene')
        elif max(a,b,c) == c:
            if c>=b+a : print('Invalid')
            else:    
                print('Equilateral' if a==b==c else 'Isosceles' if (a==b and a!=c) or (a==c and a!=b) or (c==b and a!=c) else 'Scalene')