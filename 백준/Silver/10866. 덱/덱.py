import sys
n = int(sys.stdin.readline())
stack = []
for _ in range(n):
    s = sys.stdin.readline().split()
    if s[0] == 'push_front':
        stack.insert(0,int(s[1]))
    elif s[0] == 'push_back':
        stack.append(int(s[1]))
    elif s[0] == 'pop_front':
        if len(stack) > 0:
            print(stack[0])
            del stack[0]
        else:
            print(-1)
    elif s[0] == 'pop_back':
        if len(stack) > 0:
            print(stack[-1])
            del stack[-1]
        else:
            print(-1)
    elif s[0] == 'size':
        print(len(stack))
    elif s[0] == 'empty':
        if len(stack) > 0:
            print(0)
        else:
            print(1)
    elif s[0] == 'front':
        if len(stack) > 0:
            print(stack[0])
        else:
            print(-1)
    elif s[0] == 'back':
        if len(stack) > 0:
            print(stack[-1])
        else:
            print(-1)