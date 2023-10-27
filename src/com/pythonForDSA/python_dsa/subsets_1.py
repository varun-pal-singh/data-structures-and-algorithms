arr = [1, 2, 3]

def subset1(arr):
    ds = []    
    def helper(idx):
        if idx >= len(arr):
            print(ds, end =", ")
            return
        
        # pick
        ds.append(arr[idx])
        helper(idx + 1)
        ds.pop()
        
        # not pick
        helper(idx + 1)
    helper(0)

subset1(arr)