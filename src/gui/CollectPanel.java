import javax.swing.*;
import java.awt.*;

public class CollectPanel extends JPanel {

    public CollectPanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout());

        JLabel title = new JLabel("Step 4: Collect", JLabel.CENTER);
        add(title, BorderLayout.NORTH);

        String[] columns = {"Metric", "Value", "Score"};

        Object[][] data = {
                {"SUS Score", 80, calculateScore(80, 0, 100, true)},
                {"Onboarding Time", 10, calculateScore(10, 0, 60, false)}
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

    // SCORE HESAPLAMA
    private double calculateScore(double value, double min, double max, boolean higherBetter) {

        double score;

        if (higherBetter) {
            score = 1 + (value - min) / (max - min) * 4;
        } else {
            score = 5 - (value - min) / (max - min) * 4;
        }

        // 0.5 yuvarlama
        score = Math.round(score * 2) / 2.0;

        return score;
    }
}