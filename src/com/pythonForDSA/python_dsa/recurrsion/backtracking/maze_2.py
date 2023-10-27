def print_path(up, row, col):
    if row == 1 and col == 1:
        ds.append(up)
        return
        
    if row > 1: 
        print_path(up + "D", row - 1, col)  # go down
    if col > 1:
        print_path(up + "R", row, col - 1)  # go up

ds = []
print_path("", 3, 3)
print(ds)