# Arrays (called lists in python)
arr = [1, 2, 3]
print(arr)      # [1, 2, 3]

# can be used as a stack
arr.append(4)   
arr.append(5)
print(arr)      # [1, 2, 3, 4, 5]

arr.pop()
print(arr)      # [1, 2, 3, 4]

arr.insert(1, 7)    # O(n) operation
print(arr)      # [1, 7, 2, 3, 4]

arr[0] = 0      # constant time operation
arr[3] = "something"
print(arr)      # [0, 7, 2, "something", 4]

# Initialize arr of size n with default value of "value"

n = 3
arr = ["value"] * n
print(arr)  # ["value", "value", "value"]

# Careful: -1 is not out of bound,
# it's the last value
arr = [1, 2, 3]
print(arr[-1])  # 3

# Indexing -2 is the second to last value, and so on...
print(arr[-2])  # 2

# Sublists (aka slicing)
arr = [1, 2, 3, 4]
print(arr[1:3]) # [2, 3]

# similar to for-loop ranges, last index is non-inclusive
print(arr[0:4]) # [1, 2, 3, 4]

# Unpacking
a, b, c = [1, 2, 3 ]    
print("a=", a, "b=", b, "c=", c)

# Be Careful though, arr should be same size as no of items 
# to unpack
# a, b = [1, 2, 3]

print()

# loop through arrays
nums = [1, 2, 3, 4]
 
## Using index
for i in range(len(nums)):
    print(nums[i])  # i -> 0, 1, 2, 3 (indexes)

print()
## Without index
for n in nums:
    print(n)        # n -> 1, 2, 3, 4 (values)

# With index and value
for i, n in enumerate(nums):
    print(i, n) # i -> index, n -> value

# Loop through multiple arrays simultaneously with unpacking
nums1 = [1, 3, 5]
nums2 = [2 ,4, 6]

for n1, n2 in zip(nums1, nums2):
    print(n1, n2) # n1 -> nums1, n2 -> nums 2

# Reversing
nums = [1, 2, 3, 4]
print(nums.reverse())   # None, as it does not return anything
print(nums) # [4, 3, 2, 1]

# Sorting
arr = [3, 1, 8, 0, 5]
arr.sort()  # sort in ascending order
print(arr)  # [0, 1, 3, 5, 8]

arr.sort(reverse=True)
print(arr)  # [8, 5, 3, 1, 0]

arr = ["bob", "alice", "jane", "doe"]
arr.sort()  # alphabetical order
print(arr)  # ["alice", "bob", "doe", "jane"]

# Custon sort (by length of string)
arr.sort(key=lambda x: len(x))  # sorting based on length of each string as well as alphabetical order
print(arr)  # ["bob", "doe", "jane", "alice"]

# List comprehension
arr = [i for i in range(5)]
print(arr)  # [0, 1, 2, 3, 4]

# 2-D lists
arr = [[i] * 4 for i in range(4)]
print(arr)  # [4 * 4] with each row having one i's value

# This won't work
arr = [[0] * 4] * 4
print(arr)  # [4 * 4] with all same value, eg 0