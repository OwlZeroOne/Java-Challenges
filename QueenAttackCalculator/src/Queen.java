class Queen {
    private int posX, posY;

    public Queen() {
    }

    public int[] getPosition() {
        return new int[] { posX, posY };
    }

    public void placeAt(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
}