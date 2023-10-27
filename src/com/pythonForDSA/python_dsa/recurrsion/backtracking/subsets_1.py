# all subsets

def subset1(arr):
    ds = []   
    result = [] 
    def helper(idx):
        if idx >= len(arr):
            result.append(ds.copy())
            return
        
        # pick
        ds.append(arr[idx])
        helper(idx + 1)
        ds.pop()
        
        # not pick
        helper(idx + 1)
    helper(0)
    result.sort()
    return result

arr = [1, 2, 2]
print(subset1(arr))