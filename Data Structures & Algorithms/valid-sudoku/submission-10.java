class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> column = new HashMap<>();
        HashMap<Integer, HashSet<Character>> squares = new HashMap<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char val = board[i][j];
                row.putIfAbsent(i, new HashSet<>());
                column.putIfAbsent(j, new HashSet<>());

                // If non-numeral input, ignore
                if (val == '.') {
                    continue;
                }

                // Check to see if row i contains the value
                if (row.get(i).contains(val)) {
                    return false;
                } else {
                    row.get(i).add(val);
                }

                // Check to see if column i contains the value
                if (column.get(j).contains(val)) {
                    return false;
                } else {
                    column.get(j).add(val);
                }

                int square = (i / 3) * 3 + (j / 3);
                squares.putIfAbsent(square, new HashSet<>());
                if (squares.get(square).contains(val)) {
                    return false;
                } else {
                    squares.get(square).add(val);
                }
            }
        }
        return true;
    }
}
