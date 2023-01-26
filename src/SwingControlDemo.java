import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class SwingControlDemo implements ActionListener {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel bottomPanel;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta;
    private int WIDTH=800;
    private int HEIGHT=700;


    public SwingControlDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        /* EASY 1
        mainFrame.setLayout(new GridLayout(2, 3));
        JButton one = new JButton("button 1");
        JButton two = new JButton("button 2");
        JButton three = new JButton("button 3");
        JButton four = new JButton("button 4");
        JButton five = new JButton("button 5");
        mainFrame.add(one);
        mainFrame.add(two);
        mainFrame.add(three);
        mainFrame.add(four);
        mainFrame.add(five);
         */

        /* EASY 2
        mainFrame.setLayout(new BorderLayout());
        JButton one = new JButton("button 1");
        JButton two = new JButton("button 2");
        JButton three = new JButton("button 3");
        JButton four = new JButton("button 4");
        JButton five = new JButton("button 5");
        mainFrame.add(one, BorderLayout.NORTH);
        mainFrame.add(two, BorderLayout.EAST);
        mainFrame.add(three, BorderLayout.SOUTH);
        mainFrame.add(four, BorderLayout.WEST);
        mainFrame.add(five, BorderLayout.CENTER);
         */

        /* MEDIUM 1
        mainFrame.setLayout(new BorderLayout());
        otherPanel = new JPanel();
        otherPanel.setLayout(new GridLayout(2,3));

        JButton one = new JButton("button 1");
        JButton two = new JButton("button 2");
        JButton three = new JButton("button 3");
        JButton four = new JButton("button 4");
        JButton five = new JButton("button 5");
        JLabel oneL = new JLabel("label 1");
        JLabel twoL = new JLabel("label 2");

        otherPanel.add(two);
        otherPanel.add(oneL);
        otherPanel.add(four);
        otherPanel.add(twoL);
        otherPanel.add(five);

        mainFrame.add(one, BorderLayout.NORTH);
        mainFrame.add(three, BorderLayout.SOUTH);
        mainFrame.add(otherPanel, BorderLayout.CENTER);
         */

        /* MEDIUM 2
        mainFrame.setLayout(new GridLayout(3,3));
        otherPanel = new JPanel();
        otherPanel.setLayout(new BorderLayout());

        JButton one = new JButton("button 1");
        JButton two = new JButton("button 2");
        JButton three = new JButton("button 3");
        JButton four = new JButton("button 4");
        JButton five = new JButton("button 5");
        JButton six = new JButton("button 6");
        JButton seven = new JButton("button 7");
        JButton eight = new JButton("button 8");
        JButton nine = new JButton("button 9");
        JButton ten = new JButton("button 10");
        JLabel oneL = new JLabel("label 1");

        otherPanel.add(nine,BorderLayout.EAST);
        otherPanel.add(ten, BorderLayout.SOUTH);
        otherPanel.add(oneL, BorderLayout.WEST);

        mainFrame.add(one);
        mainFrame.add(two);
        mainFrame.add(three);
        mainFrame.add(four);
        mainFrame.add(otherPanel);
        mainFrame.add(five);
        mainFrame.add(six);
        mainFrame.add(seven);
        mainFrame.add(eight);
         */

        mainFrame.setLayout(new GridLayout(2,1));
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1,2));
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        rightPanel = new JPanel();
        leftPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(2,1));
        leftPanel.setLayout(new GridLayout(3,3));

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JLabel oneZL = new JLabel("0");
        JLabel twoZL = new JLabel("0");
        JLabel threeZL = new JLabel("0");
        JLabel fourZL = new JLabel("0");
        JLabel fiveZL = new JLabel("0");

        JLabel TZLOne = new JLabel("Top 0");
        JLabel TZLTwo = new JLabel("Top 0");
        JLabel TZLThree = new JLabel("Top 0");
        JLabel TZLFour = new JLabel("Top 0");
        JLabel TZLFive = new JLabel("Top 0");
        JButton TOne = new JButton("Top 1");
        JButton TTwo = new JButton("Top 2");
        JButton TThree = new JButton("Top 3");
        JButton TFour = new JButton("Top 4");

        JLabel TR = new JLabel("TopRight");
        JButton RBOne = new JButton("1");

        ta = new JTextArea();


        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        bottomPanel.add(oneZL);
        bottomPanel.add(one);
        bottomPanel.add(twoZL);
        bottomPanel.add(two);
        bottomPanel.add(threeZL);
        bottomPanel.add(three);
        bottomPanel.add(fourZL);
        bottomPanel.add(four);
        bottomPanel.add(fiveZL);

        leftPanel.add(TZLOne);
        leftPanel.add(TOne);
        leftPanel.add(TZLTwo);
        leftPanel.add(TTwo);
        leftPanel.add(TZLThree);
        leftPanel.add(TThree);
        leftPanel.add(TZLFour);
        leftPanel.add(TFour);
        leftPanel.add(TZLFive);

        rightPanel.add(TR);
        rightPanel.add(RBOne);

        centerPanel.add(leftPanel, BorderLayout.WEST);
        centerPanel.add(rightPanel, BorderLayout.EAST);
        centerPanel.add(ta, BorderLayout.SOUTH);

        mainFrame.add(mb);
        mainFrame.setJMenuBar(mb);

        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
        mainFrame.add(centerPanel, BorderLayout.NORTH);



        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }
}