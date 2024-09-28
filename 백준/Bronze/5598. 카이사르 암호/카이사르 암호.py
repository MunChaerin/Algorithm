s = input()
result=''
for i in s:
    if i in 'ABC':
        result += chr(ord(i)+23)
    else:
        result+=chr(ord(i)-3)
print(result)