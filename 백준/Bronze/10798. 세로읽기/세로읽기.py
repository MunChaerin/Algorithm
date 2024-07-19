a = []
a_len = []
s = ''
for n in range(5):
    row = input()
    a.append(row)
    a_len.append(len(row))

for n in range(max(a_len)):
    for m in range(5):
        if n < a_len[m] :
            s += a[m][n]
print(s)