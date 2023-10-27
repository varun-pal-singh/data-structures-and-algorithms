# when arr not containing -ve and target is also not 0
def combination_sum_2_naive(arr , target):
    result, ds = [], []
    def helper(idx, target):
        if idx == len(arr):
            if target == 0:
                result.append(ds.copy())
            return
        # pick
        ds.append(arr[idx])
        helper(idx + 1, target - arr[idx])
        ds.pop()    

        # not pick
        helper(idx + 1, target)
    helper(0, target)
    return result

arr1, target1 = [1, 2, 2, 3, 3], 5
print("naive", combination_sum_2_naive(arr1, target1))

from typing import List # to use List

def combination_sum_2_optimal(arr: List[int], target: int) -> List[List[int]]:
    arr.sort()
    result, ds = [], []
    def helper(idx, target):
        if idx == len(arr) or target == 0:
            if target == 0:
                result.append(ds.copy())
            return
        
        for i in range (idx, len(arr)):
            if i > idx and arr[i] == arr[i - 1]:
                continue
            if arr[i] > target:
                break

            # pick
            ds.append(arr[i])
            helper(i + 1, target - arr[i])
            ds.pop()
    helper(0, target)
    return result

print("without duplicates", combination_sum_2_optimal(arr1, target1))

# if arr contains -ve elements and target is zero
def combination_sum_2_negatives(arr: List[int], target: int) -> List[List[int]]:
    arr.sort()
    result, ds = [], []
    def helper(idx, target):
        if idx == len(arr):
            if target == 0:
                result.append(ds.copy())
            return
        
        # pick
        ds.append(arr[idx])
        helper(idx + 1, target - arr[idx])
        ds.pop()

        # not pick
        helper(idx + 1, target)
        
    helper(0, target)
    return result

arr2, target2 = [1, 2, 0, -2, -1], 0
print("with -ve", combination_sum_2_negatives(arr2, target2))