import sys
n=int(sys.stdin.readline())
dp = [0] *1001
dp[0],dp[1]=1,1
for i in range(2,n+1):
    dp[i]=dp[i-1]+ 2*dp[i-2]
print(dp[n]%10007)