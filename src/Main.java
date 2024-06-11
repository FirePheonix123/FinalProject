public class Main {
    public static void main(String[] args) {
        GameCode Minesweeper = new GameCode("MineSweeper");
        Player Player = new Player();
        AI AI = new AI("AI", 600);
        TicTacToe Final = new TicTacToe(600);
    }
}