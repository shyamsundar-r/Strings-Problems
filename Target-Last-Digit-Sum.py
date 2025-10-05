a = int(input("Enter the size of Array:"))
arr = list(map(int, input().split(",")))
tar = int(input("Enter the Target:"))
res = 0
for i in arr:
    x = i % 10
    res += x
if res == tar:
    print(res)
else:
    print(-1)
