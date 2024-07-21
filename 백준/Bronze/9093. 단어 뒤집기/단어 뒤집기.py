import sys
n = int(sys.stdin.readline())
for _ in range(n):
    s = sys.stdin.readline().split()
    for i in range(len(s)):
        print(s[i][::-1], end=' ')
    print()