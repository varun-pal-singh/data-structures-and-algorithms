# If statements don't need parentheses or  curly braces.

n = 1
if n > 2:
    n -= 1
elif n == 2:
    n *= 3
else: 
    n = 0

print("n=", n)

# multi-line conditionals

n, m = 1, 2

if((n > 2 and 
   n != m) or n == m):
    n *= 4
else:
    n = None

print("n=", n)
