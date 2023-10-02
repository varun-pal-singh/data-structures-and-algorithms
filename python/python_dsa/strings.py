# Strngs are similar to arrays
# Strings are immuatable in python
s = "abc"

print(s[0:2])   # "ab"
print(s)        # "abc"

s += "def"      # creates new string, hence, O(n) operation
print("s=", s)  # "abcdef" 

# Valid numeric strings can be converted
print(int("10") + int("10"))    # 20
print(str(10) + str(10))        # 1010


# In rare cases you may need the ASCII value of a character
print(ord("a")) # 97
print(ord("b")) # 98

# Combine a list of strings (with an empty string delimitor)
strings = ["ab", "cd", "ef"]
print("-".join(strings)) # "ab-cd-ef"