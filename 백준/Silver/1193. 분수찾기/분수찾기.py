import sys
n = int(sys.stdin.readline().strip())
line = 1
while n > line:
    n -= line
    line += 1
if line % 2 == 0:
    a = n
    b = line - n + 1
elif line % 2 != 0:
    a = line - n + 1
    b = n
print(f'{a}/{b}')