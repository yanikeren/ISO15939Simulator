import javax.swing.*;
import java.awt.*;

public class AnalysePanel extends JPanel {

    public AnalysePanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout());

        JLabel title = new JLabel("Step 5: Analyse", JLabel.CENTER);
        add(title, BorderLayout.NORTH);

        // Örnek dimension skorları
        double usability = 4.5;
        double performance = 3.0;
        double reliability = 2.5;

        JTextArea result = new JTextArea();
        result.setEditable(false);

        // en düşük bul
        double min = usability;
        String name = "Usability";

        if (performance < min) {
            min = performance;
            name = "Performance";
        }

        if (reliability < min) {
            min = reliability;
            name = "Reliability";
        }

        result.setText(
                "Usability Score: " + usability +
                        "\nPerformance Score: " + performance +
                        "\nReliability Score: " + reliability +
                        "\n\nLowest Dimension: " + name +
                        "\nScore: " + min +
                        "\nNeeds improvement!"
        );

        add(new JScrollPane(result), BorderLayout.CENTER);

        JButton back = new JButton("Back");
        back.addActionListener(e -> cardLayout.previous(mainPanel));

        add(back, BorderLayout.SOUTH);
    }
}