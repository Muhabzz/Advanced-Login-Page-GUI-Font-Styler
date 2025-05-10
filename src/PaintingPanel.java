import javax.swing.*;
import java.awt.*;

public class PaintingPanel extends JPanel
{
    private int shapeCode = 0;

    private JLabel label=new JLabel();
    public void changeLabelFont(int style)
    {
        label.setFont(new Font("Arial", style, 20));
    }
    public void changeBackgroundColor(Color color)
    {
        setBackground(color);
        repaint();
    }



    public PaintingPanel()
    {
        setBackground(Color.WHITE);
        setLayout(null);
        label.setText("Welcome to Painting Panel");
        label.setBounds(500,0,500,250);
        this.add(label);
    }

    public void draw(int shapeCode)
    {
        this.shapeCode = shapeCode;
        repaint(); // Calling PaintComponent
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (shapeCode == 1)
        {
            g.setColor(Color.BLACK);
            g.fillOval(600, 350, 100, 100);
        }
        else if (shapeCode == 2)
        {
            g.setColor(Color.BLACK);
            g.fillRect(600, 350, 100, 100);
        } else if (shapeCode == 3)
        {
            g.setColor(Color.BLACK);
            g.drawLine(100, 150, 400, 300);
        } else if (shapeCode == 4)
        {
            repaint();
        }

    }
}