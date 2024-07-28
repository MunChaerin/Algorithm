while True:
    n = int(input())
    if n==-1:
        break
    else:
        arr = [i for i in range(1,n) if n%i==0]
        print(f'{n} = {(' + '.join(map(str,arr)))}' if n==sum(arr) else f'{n} is NOT perfect.')
