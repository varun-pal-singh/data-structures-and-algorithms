def combination_sum_naive(arr, target):
    ds, result = [], []

    def helper(idx, target):
        if idx == len(arr):
            if target == 0:
                result.append(ds.copy())
            return
        
        # pick
        if arr[idx] <= target:
            ds.append(arr[idx])
            helper(idx, target - arr[idx])
            ds.pop()

        # not pick
        helper(idx + 1, target)

    helper(0, target)
    return result


arr = [3, 2, 1]
target = 3
print(combination_sum_naive(arr, target))