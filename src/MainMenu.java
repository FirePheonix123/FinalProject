import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class MainMenu implements ActionListener{
    private JButton button;
    JFrame frame;
    private int frameSize;
    public MainMenu(int frameSize) {
        this.frameSize = frameSize;

        frame = new JFrame();
        frame.setSize(400, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(390,50));
        textField1.setFont(new Font("Arial",Font.PLAIN,35));
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.WHITE);
        textField1.setText("Challenger - Opponent");

        frame.add(textField1, BorderLayout.NORTH);

        JTextField textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension(390,50));
        textField2.setFont(new Font("Arial",Font.PLAIN,35));
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.WHITE);
        textField2.setText("Reason for battle");

        frame.add(textField2, BorderLayout.CENTER);

        button = new JButton("Submit");
        button.addActionListener(this);
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            TicTacToe Final = new TicTacToe(frameSize);
            GameCode Minesweeper = new GameCode("MineSweeper");
            Player Player = new Player();
            AI AI = new AI("AI", frameSize);

            frame.setVisible(false);
        }
    }

}