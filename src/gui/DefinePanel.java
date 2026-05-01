import javax.swing.*;
import java.awt.*;

public class DefinePanel extends JPanel {

    public DefinePanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout());

        JLabel label = new JLabel("Define Step", JLabel.CENTER);
        add(label, BorderLayout.CENTER);

        JButton back = new JButton("Back");

        back.addActionListener(e -> {
            cardLayout.previous(mainPanel);
        });

        add(back, BorderLayout.SOUTH);
    }
}