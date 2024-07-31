import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame miVentana = new JFrame("yo");
        miVentana.setSize(1800,1000);

        JPanel mainPanel= new JPanel();
        mainPanel.setBackground(Color.BLUE);

        miVentana.add(mainPanel);
        miVentana.setVisible(true);
    }
}