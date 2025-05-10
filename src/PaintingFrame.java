import javax.swing.*;
import java.awt.*;


public class PaintingFrame
{
    JFrame frame = new JFrame();
    PaintingPanel paintingPanel = new PaintingPanel();

    public PaintingFrame()
    {
        frame.setTitle("Painting Frame");
        frame.setSize(1200, 800);
        frame.setLocation(200, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton rectangleButton = new JButton("Rectangle");
        JButton ovalButton = new JButton("Oval");
        JButton LineButton = new JButton("Line");
        JButton clearButton = new JButton("Clear");

        buttonPanel.add(rectangleButton);
        buttonPanel.add(ovalButton);
        buttonPanel.add(LineButton);
        buttonPanel.add(clearButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);


        JMenuBar menuBar = new JMenuBar();

        JMenu changeColor = new JMenu("Change Background Color");
        JMenuItem pink = new JMenuItem("Pink");
        JMenuItem cyan = new JMenuItem("Cyan");
        JMenuItem orange = new JMenuItem("Orange");
        changeColor.add(pink);
        changeColor.add(cyan);
        changeColor.add(orange);

        JMenu changeFont = new JMenu("Change Font");
        JMenuItem plainfont = new JMenuItem("Plain");
        JMenuItem boldfont = new JMenuItem("Bold");
        JMenuItem italicfont = new JMenuItem("italic");
        changeFont.add(plainfont);
        changeFont.add(boldfont);
        changeFont.add(italicfont);

        JMenu About = new JMenu("About");
        JMenuItem aboutitem = new JMenuItem(" click here for About us ");
        About.add(aboutitem);

        menuBar.add(changeColor);
        menuBar.add(changeFont);
        menuBar.add(About);
        frame.setJMenuBar(menuBar);

        pink.addActionListener(e -> paintingPanel.changeBackgroundColor(Color.PINK));
        cyan.addActionListener(e -> paintingPanel.changeBackgroundColor(Color.CYAN));
        orange.addActionListener(e -> paintingPanel.changeBackgroundColor(Color.ORANGE));

        plainfont.addActionListener(e -> paintingPanel.changeLabelFont(Font.PLAIN));
        boldfont.addActionListener(e -> paintingPanel.changeLabelFont(Font.BOLD));
        italicfont.addActionListener(e -> paintingPanel.changeLabelFont(Font.ITALIC));

        aboutitem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Mohab Nasser Abdelkader \n Menna Khaled Abdelrehim \n Rahaf Alsayed", "About", JOptionPane.INFORMATION_MESSAGE));

        frame.add(paintingPanel, BorderLayout.CENTER);

        ovalButton.addActionListener(e-> paintingPanel.draw(1));
        rectangleButton.addActionListener(e-> paintingPanel.draw(2));
        LineButton.addActionListener(e-> paintingPanel.draw(3));
        clearButton.addActionListener(e-> paintingPanel.draw(4));



        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new PaintingFrame();
    }
}