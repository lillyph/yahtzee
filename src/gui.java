import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui implements ActionListener {

    private int count = 0;
    private JButton button;
    private JFrame frame = new JFrame();
    private JPanel panel;
    private JLabel label;

    public gui(String type){
        switch (type) {
            case "mainMenu":

        }
        button = new JButton("Click to play");
        button.addActionListener(this);
        panel = new JPanel();
        label = new JLabel("num of clicks");
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("yahtzee");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("num of clicks: " + count);
    }
}
