import javax.swing.*;
import java.awt.*;

public class DefinePanel extends JPanel {

    public DefinePanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout());

        add(new JLabel("Define Step", JLabel.CENTER), BorderLayout.CENTER);

        JPanel buttons = new JPanel();

        JButton back = new JButton("Back");
        JButton next = new JButton("Next");

        back.addActionListener(e -> cardLayout.previous(mainPanel));
        next.addActionListener(e -> cardLayout.next(mainPanel));

        buttons.add(back);
        buttons.add(next);

        add(buttons, BorderLayout.SOUTH);
    }
}