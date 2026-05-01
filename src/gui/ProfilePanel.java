import javax.swing.*;
import java.awt.*;

public class ProfilePanel extends JPanel {

    public ProfilePanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout());

        JLabel label = new JLabel("Profile Step", JLabel.CENTER);
        add(label, BorderLayout.CENTER);

        JButton next = new JButton("Next");

        next.addActionListener(e -> {
            cardLayout.next(mainPanel);
        });

        add(next, BorderLayout.SOUTH);
    }
}