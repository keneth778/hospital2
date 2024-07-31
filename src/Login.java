import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 970);
        frame.setLayout(new GridLayout(1, 2));

        // Panel izquierdo con color de fondo
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.CYAN);

        // Panel derecho con formulario de login
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridBagLayout());
        rightPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Espacio entre componentes

        JLabel userLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        rightPanel.add(userLabel, gbc);

        JTextField userText = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        rightPanel.add(userText, gbc);

        JLabel passLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        rightPanel.add(passLabel, gbc);

        JPasswordField passText = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        rightPanel.add(passText, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        rightPanel.add(loginButton, gbc);

        // Añadir los paneles a la ventana
        frame.add(leftPanel);
        frame.add(rightPanel);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
