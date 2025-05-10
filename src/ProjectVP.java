import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class ProjectVP
{
    JFrame frame = new JFrame();
    JTextField studentNameField;
    JTextField studentIDField;
    PaintingFrame paintingFrame;

    //   Key     Value
    Map<String, String> studentMap = new HashMap<>();

    ProjectVP()
    {
        studentMap.put("menna", "127");
        studentMap.put("mohab", "128");
        studentMap.put("rahaf", "129");

        frame.setTitle("Quiz - Login Page");
        frame.setSize(1200, 800);
        frame.setLocation(200, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        ImageIcon frameIcon = new ImageIcon("icon.png");
        frame.setIconImage(frameIcon.getImage());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(155, 159, 155));
        leftPanel.setBounds(0, 0, 600, 800);
        leftPanel.setLayout(null);


        // Object From Image --> 1
        // Object From Container --> 2 ( Label - Button ) in constructor or setIcon
        // ImageIcon --> Creating for anything related to image(Image - Icon )

        ImageIcon leftIcon = new ImageIcon("th3.jpg");
        JLabel leftlabelicon = new JLabel();
        leftlabelicon.setIcon(leftIcon);
        leftlabelicon.setBounds(50, 200, 500, 404);
        leftPanel.add(leftlabelicon);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setBounds(600, 0, 600, 800);
        rightPanel.setLayout(null);

        ImageIcon logoIcon2 = new ImageIcon("square-format,-white-background,-no-shadow-designify.png");
        JLabel logoLabel2 = new JLabel(logoIcon2);
        logoLabel2.setBounds(50, 20, logoIcon2.getIconWidth(), logoIcon2.getIconHeight());
        rightPanel.add(logoLabel2);

        JLabel title = new JLabel("Welcome to Drawing & Painting Home");
        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        title.setBounds(80, 490, 500, 40);
        title.setForeground(Color.BLACK);
        rightPanel.add(title);

        JLabel title2 = new JLabel("Enter Your Name & ID to Continue");
        title2.setFont(new Font("SansSerif", Font.BOLD, 20));
        title2.setBounds(100, 520, 400, 40);
        rightPanel.add(title2);

        JLabel studentNameLabel = new JLabel("Student Name:");
        studentNameLabel.setBounds(30, 600, 150, 30);
        studentNameLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        studentNameLabel.setForeground(Color.BLACK);
        rightPanel.add(studentNameLabel);

        studentNameField = new JTextField();
        studentNameField.setBounds(180, 600, 250, 30);
        studentNameField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        studentNameField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        rightPanel.add(studentNameField);

        JLabel studentIDLabel = new JLabel("Student ID:");
        studentIDLabel.setBounds(30, 650, 150, 30);
        studentIDLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        studentIDLabel.setForeground(Color.BLACK);
        rightPanel.add(studentIDLabel);

        studentIDField = new JTextField();
        studentIDField.setBounds(180, 650, 250, 30);
        studentIDField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        studentIDField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        rightPanel.add(studentIDField);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        loginButton.setBounds(230, 710, 100, 30);
        loginButton.setForeground(Color.BLACK);
        loginButton.setBackground(Color.WHITE);
        loginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        rightPanel.add(loginButton);



        loginButton.addActionListener(event ->
        {
            String studentName = studentNameField.getText().trim().toLowerCase();
            String studentId = studentIDField.getText().trim();

            if (studentName.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please enter your name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (studentId.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Please enter your student ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (!studentMap.containsKey(studentName))
            {
                JOptionPane.showMessageDialog(frame, "This student is not registered.", "Login Failed", JOptionPane.ERROR_MESSAGE);

            } else if (!studentMap.get(studentName).equals(studentId))
            {
                JOptionPane.showMessageDialog(frame, "Incorrect student ID for the given name.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                frame.dispose();
                paintingFrame=new PaintingFrame();
            }
        });


        frame.add(leftPanel);
        frame.add(rightPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        ProjectVP project = new ProjectVP();
    }
}