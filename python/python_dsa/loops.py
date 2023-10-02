# While loops are similar
n = 0
while (n < 5):
    print(n)
    n += 1

print()
# or 

while n < 10:
    print(n)
    n += 1

print()

# for loops

for i in range(5):
    print(i)

print()

# i = 2 to i = 5, here third arg i.e, 3 is optional bcoz we are incrementing by 3, as it can be 2,3 or anything
for i in range(2, 10, 3):   # from 2(inclusive) to 6(exclusive) (2...5)
    print(i)

print()

# i = 5 to i = 2, here third para i.e, -2 is compulsory as we are decrementing by 2, 
for i in range(5, 1, -2):   # reverse order
    print(i)