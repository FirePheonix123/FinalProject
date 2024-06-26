import java.awt.*;


public class AI extends Player  {
    private int numShips = 3;
    private int gridSize = 7;
    Ships ship[][] = new Ships[gridSize][gridSize];

    public AI(String username, int frameSize) {
        GUI gui = new GUI(username, frameSize);
        gui.buttonPanel.setLayout(new GridLayout(gridSize, gridSize));
        setShips();
        for (int r = 0; r < gridSize; r++) {
            for (int c = 0; c < gridSize; c++) {
                ship[r][c] = new Ships(r,c);
                ship[r][c].setEnabled(true);
            }
        }
        setShips();
        for (int r = 0; r < gridSize; r++) {
            for (int c = 0; c < gridSize; c++) {
                ship[r][c].addMouseListener(this);
                gui.buttonPanel.add(ship[r][c]);
            }
        }
        gui.frame.add(gui.buttonPanel, BorderLayout.CENTER);
        gui.frame.setVisible(true);
    }
    public void setShips(){
        for(int i = 0; i < numShips; i ++){
            int plane = (int)(Math.random() * 1) + 1;
            int ranSpot = (int)(Math.random() * (gridSize - 1)) + 1;
            for(int j = i; j < numShips; j++){
                if (plane == 1) {
                    ship[ranSpot][j] = new Ships(ranSpot,j);
                    ship[ranSpot][j].setHideActionText(true);
                }
                if (plane == 2) {
                    ship[j][ranSpot] = new Ships(j,ranSpot);
                    ship[j][ranSpot].setHideActionText(true);
                }
            }
        }
    }

}
