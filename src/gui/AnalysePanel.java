import javax.swing.*;
import java.awt.*;

public class AnalysePanel extends JPanel {

    public AnalysePanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout());

        add(new JLabel("Analyse Step", JLabel.CENTER), BorderLayout.CENTER);

        JButton back = new JButton("Back");

        back.addActionListener(e -> cardLayout.previous(mainPanel));

        add(back, BorderLayout.SOUTH);
    }
}