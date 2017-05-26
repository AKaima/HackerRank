'''
Decided to do this one in Python3, since it's very easy to implement. Can be done with BigInteger in Java.
It can also be done imperfectly, but likely solving the test cases, using longs if you choose to take the first 14 numbers and sum those up.
This, however, doesn't solve cases such as:
    89999....99999
    10000....00001
As it would return 9999999999 rather than 1000000000.
'''

n = int(input())
sum = 0
for i in range(n):
    sum += int(input())
print(str(sum)[:10])
