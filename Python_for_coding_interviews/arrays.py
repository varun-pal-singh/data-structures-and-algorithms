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