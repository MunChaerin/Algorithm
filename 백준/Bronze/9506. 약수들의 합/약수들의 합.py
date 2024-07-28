while True:
    n = int(input())
    if n==-1:
        break
    else:
        arr = [i for i in range(1,n) if n%i==0]
        if n == sum(arr) : print(n,'=',' + '.join(map(str,arr)))
        else: print(n,'is NOT perfect.')