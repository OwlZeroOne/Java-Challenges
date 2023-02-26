public class Board {
    private String[][] board;

    public Board() {
        board = new String[8][8];
        initializeBoard();
    }

    public void place(Queen q, int posX, int posY) {
        assert !occupied(posX, posY) : "Square is occupied!";

        q.placeAt(posX, posY);
        board[posX][posY] = "Q";
    }

    /*
     * Draw board of the following pattern:
     * 
     * - - - - - - - -
     * - - - - - - - -
     * - - - - - - - -
     * - - - - - - - -
     * - - - - - - - -
     * - - - - - - - -
     * - - - - - - - -
     * - - - - - - - -
     */
    public void drawBoard() {
        String xSpace = " ", ySpace = "\n";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                sb.append(j >= board.length - 1 ? board[i][j] : board[i][j] + xSpace);
            }
            sb.append(ySpace);
        }

        System.out.println(sb.toString());
    }

    private void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "-";
            }
        }
    }

    private boolean occupied(int i, int j) {
        return !(board[i][j].equals("-"));
    }
}
