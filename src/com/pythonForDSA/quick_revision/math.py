# Division is decimal by default
print(5 / 2)    # 2.5
print(int(5/2)) # 2

# Double slash rounds down
print(5 // 2)   # 2

# CAREFUL: most languages round towards 0 by default 
# so negative numbers will round down
print( -5 / 2)  # -2.5
print(-5 // 2)  # -3

# A workaround for rounding towards zero is to use decimal 
# devision and then convert to int.
print(int(-5/2))    # -2


# Modding is similar to most languages
print(10%3) # 1

# Except for negative values
print(-10 % 3)   # 2

# to be consistent with other languages modulo
import math

print(math.fmod(10, 3))     # 1.0
print(math.fmod(-10, 3))    # -1.0

# More math helpers
print(math.floor(5/2))      # 2
print(math.ceil(5/2))       # 3
print(math.sqrt(5))         # 2.2360...
print(int(math.sqrt(5)))    # 2
print(math.pow(5, 2))       # 25.0

# Max / Min Int
posInf = float("inf")
negInf = float("-inf")

# Python numbers are infinite so they never overflow
veryVeryBigNum = math.pow(2, 999)

print(veryVeryBigNum)             # 5.357e+300
print(veryVeryBigNum < posInf)    # True