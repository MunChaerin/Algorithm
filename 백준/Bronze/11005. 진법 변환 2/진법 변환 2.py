import sys
n, b = map(int,sys.stdin.readline().split())
num_list="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
s = str()
while n:
    s += num_list[n%b]
    n //= b
print(s[::-1])