import sys
l = list(input())
r = []
n = int(input())
for _ in range(n):
    c = sys.stdin.readline().split()
    if c[0] == 'L' and l :
        r.append(l.pop())
    elif c[0] == 'D' and r :
        l.append(r.pop())
    elif c[0] == 'B' and l :
        l.pop()
    elif c[0] == 'P' :
        l.append(c[1])
answer = l + r[::-1]
print(''.join(answer))      