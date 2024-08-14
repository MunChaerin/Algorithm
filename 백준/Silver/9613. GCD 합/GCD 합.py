import sys
import math
t = int(sys.stdin.readline())
for _ in range(t):
    n = list(map(int,sys.stdin.readline().split()))
    sum=0
    for i in range(1,len(n)):
        for j in range(i+1,len(n)):
            sum += math.gcd(n[i],n[j])
    print(sum)