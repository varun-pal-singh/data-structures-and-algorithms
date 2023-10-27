const get_paths = (row, col, up) => {
    if(row == 1 && col == 1){
        ds.push(up);
        return;
    }
    if(row > 1){
        get_paths(row - 1, col, up + "D");  // go down
    }
    if(col > 1){
        get_paths(row, col - 1, up + "R");  // go up
    }
}

const ds = [];
get_paths(3, 3, "");
console.log(ds);