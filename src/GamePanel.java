import java.awt.*;
import javax.swing.*;
public class GamePanel {
    private JFrame frame = new JFrame("Minesweeper");
    private JLabel textLabel = new JLabel();
    private JPanel textPanel = new JPanel();
    private JPanel boardPanel = new JPanel();
    public GamePanel(){
    }
    public GamePanel(int boardWidth, int boardHeight, int numRows, int numCols, String username){
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText(username);
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(numRows, numCols)); //8x8
        frame.add(boardPanel);
    }
    //The 3 methods below are methods used to edit information on the GUI, for example setting the frame to true.
    public void editFrame(boolean determine){
        if(determine) {
            frame.setVisible(true);
        }
    }
    //Below is a method, courtesy of Mr.Miller, to get boardpanel.
    public JPanel getBoardPanel() {
        return boardPanel;
    }
    public void editText(String text){
        textLabel.setText(text);
    }
}
