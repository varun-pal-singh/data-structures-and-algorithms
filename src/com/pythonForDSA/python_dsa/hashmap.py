# HashMap (aka dict)
myMap = {}

# adding
myMap["key1"] = "value1"
myMap["key2"] = "value2"

print(myMap)    # {"key1" : "value1", "key2" : "value2"}

# changeing key 
myMap["key1"] = "newValue1"
print(myMap)    # {"key1" : "newValue1", "key2" : "value2"}

print(myMap["key1"])    # "newValue1"

# searching for a key
print("key1" in myMap)  # True
myMap.pop("key1")
print("key1" in myMap)

myMap = {"newKey1" : "newValue1", "newKey2" : "newValue2"}
print(myMap)    # {"newKey1" : "newValue1", "newKey2" : "newValue2"}

# Dict comprehension
#       key : value
myMap = {i : i*i for i in range(5)}
print(myMap)    # {0 : 0, 1 : 1, 2 : 4, 3 : 9, 4 : 16}\

# Looping through maps
myMap = {"alice": 90, "bob" : 70}

for key in myMap:
    print(key, myMap[key])  # key, value

for val in myMap.values():
    print(val)              # value

for key, val in myMap.items():
    print(key, val)         # key, value