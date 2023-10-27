def count(row, col):
    if row == 1 or col == 1:
        return 1
    left = count(row - 1, col)
    right = count(row, col - 1)
    return left + right

print(count(3, 5))