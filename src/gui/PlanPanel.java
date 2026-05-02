import javax.swing.*;
import java.awt.*;

public class PlanPanel extends JPanel {

    public PlanPanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout());

        JLabel title = new JLabel("Step 3: Plan", JLabel.CENTER);
        add(title, BorderLayout.NORTH);

        String[] columns = {"Metric", "Coefficient", "Direction", "Range", "Unit"};

        Object[][] data = {
                {"SUS Score", 50, "Higher", "0-100", "points"},
                {"Onboarding Time", 50, "Lower", "0-60", "min"},
                {"Video Start Time", 50, "Lower", "0-15", "sec"},
                {"Concurrent Users", 50, "Higher", "0-600", "users"}
        };

        JTable table = new JTable(data, columns);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);

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
