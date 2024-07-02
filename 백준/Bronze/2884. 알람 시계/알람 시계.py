H, M = map(int,input().split())
if M<45 :
    M += 60
    H -= 1
    if H < 0 :
        print(23,M-45)
    else :
        print(H,M-45)
else :
    print(H,M-45)
