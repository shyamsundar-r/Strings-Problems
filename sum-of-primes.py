a = int(input())  # input number
res = 0           # to store sum of primes

for i in range(1, a+1):     # check every number from 1 to a
    count = 0
    for j in range(1, i+1): # count divisors of i
        if i % j == 0:
            count += 1
    if count == 2:           # prime numbers have exactly 2 divisors
        res += i
        count = 0

print(res)   # sum of primes
