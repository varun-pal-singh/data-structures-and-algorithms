# HashSet
mySet = set()
 
# adding
mySet.add(1)
mySet.add(1)        # duplicates are not allowed
mySet.add(2)
print(mySet)        # {1, 2}

# length
print(len(mySet))   # 2

# search for an element
print(1 in mySet)   # True
print(3 in mySet)   # False

# removing of an element
mySet.remove(2)
print(2 in mySet)   # False

# list to set
print(set([1, 2, 3, 3, 4, 5, 2, 1]))   # {1, 2, 3, 4, 5}

# Set comprehensin
mySet = {i for i in range(3)}   
print(mySet)        # {0, 1, 2}