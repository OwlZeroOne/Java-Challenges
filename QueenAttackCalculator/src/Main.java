/**
 * Given the position of two queens on a chess board, indicate
 * whether or not they are positioned so that they can attack each
 * other.
 * 
 * In the game of chess, a queen can attack pieces which are on the
 * same row, column, or diagonal.
 * 
 * A chessboard can be represented by an 8 by 8 array.
 * 
 * So if you're told the white queen is at (2, 3) and the black queen
 * at (5, 6), then you'd know you've got a set-up like so:
 * 
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ W _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ B _
 * _ _ _ _ _ _ _ _
 * _ _ _ _ _ _ _ _
 * You'd also be able to answer whether the queens can attack each other.
 * In this case, that answer would be yes, they can, because both pieces
 * share a diagonal.
 */

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Queen q1 = new Queen();
        Queen q2 = new Queen();

        board.place(q1, 0, 7);
        board.place(q2, 7, 0);
        board.drawBoard();

        System.out.println(
                canAttack(q1, q2)
                        ? "\nQueens can attack each other."
                        : "\nQueens cannot attack each other.");
    }

    /*
     * Queen can attack if target's position difference is either
     * - the same in both axes.
     * - 0 on x-axis
     * - 0 on y-axis
     */
    private static boolean canAttack(Queen q1, Queen q2) {
        int[] q1Pos = q1.getPosition();
        int[] q2Pos = q2.getPosition();

        boolean isDiagonal = Math.abs(q1Pos[0] - q2Pos[0]) == Math.abs(q1Pos[1] - q2Pos[1]);
        boolean isVertical = q1Pos[0] - q2Pos[0] == 0;
        boolean isHorizontal = q1Pos[1] - q2Pos[1] == 0;

        return isDiagonal || isVertical || isHorizontal;
    }
}
