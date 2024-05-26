package Login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    public LoginForm() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("src/main/java/Image/download.jpg");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel.setPreferredSize(new Dimension(300, 400));
        add(imagePanel, BorderLayout.WEST);

        // Panel chứa form đăng nhập
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("Member Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        loginPanel.add(titleLabel, gbc);

        gbc.gridy++;
        JLabel emailLabel = new JLabel("Email:");
        loginPanel.add(emailLabel, gbc);

        gbc.gridy++;
        JTextField emailField = new JTextField(20);
        loginPanel.add(emailField, gbc);

        gbc.gridy++;
        JLabel passwordLabel = new JLabel("Password:");
        loginPanel.add(passwordLabel, gbc);

        gbc.gridy++;
        JPasswordField passwordField = new JPasswordField(20);
        loginPanel.add(passwordField, gbc);

        gbc.gridy++;
        gbc.gridwidth = 1;
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Xử lý đăng nhập ở đây
            }
        });
        loginPanel.add(loginButton, gbc);

        gbc.gridx++;
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Thoát chương trình
            }
        });
        loginPanel.add(cancelButton, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        JLabel createAccountLabel = new JLabel("Don't have an account? Create one.");
        createAccountLabel.setForeground(Color.BLUE);
        createAccountLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        createAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Xử lý khi nhấp vào "Create one"
            }
        });
        loginPanel.add(createAccountLabel, gbc);

        add(loginPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm();
            }
        });
    }
}
