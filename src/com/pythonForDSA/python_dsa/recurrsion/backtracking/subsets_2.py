# unique subsets only
def print_subsets(arr):
    result = []
    ds = []

    def helper(idx):
        result.append(ds.copy())

        for i in range (idx, len(arr)):
            if i > idx and arr[i] == arr[i - 1]:
                continue

            # pick
            ds.append(arr[i])
            helper(i + 1)
            del ds[-1]      # ds.pop() for specifically last element

    helper(0)
    return result

arr = [1, 2, 2]
print(print_subsets(arr))
