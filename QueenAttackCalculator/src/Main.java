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
