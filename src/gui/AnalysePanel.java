package gui;

import data.ScenarioData;
import model.Dimension;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AnalysePanel extends JPanel {

    public AnalysePanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

        ArrayList<Dimension> dimensions =
                ScenarioData.getData();

        double lowestScore = 999;

        String lowestName = "";

        for(Dimension d : dimensions) {

            double average =
                    d.calculateAverage();

            JProgressBar bar =
                    new JProgressBar(0,100);

            bar.setValue((int)(average * 20));

            bar.setString(
                    d.getName()
                            + " Score : "
                            + String.format("%.2f", average)
            );

            bar.setStringPainted(true);

            add(bar);

            add(Box.createVerticalStrut(20));

            if(average < lowestScore) {

                lowestScore = average;

                lowestName = d.getName();
            }
        }

        double gap = 5.0 - lowestScore;

        JLabel lowestLabel =
                new JLabel(
                        "Lowest Dimension : "
                                + lowestName
                );

        JLabel gapLabel =
                new JLabel(
                        "Gap Value : "
                                + String.format("%.2f", gap)
                );

        String level;

        if(lowestScore >= 4.5) {

            level = "Excellent";

        } else if(lowestScore >= 3.5) {

            level = "Good";

        } else if(lowestScore >= 2.5) {

            level = "Needs Improvement";

        } else {

            level = "Poor";
        }

        JLabel levelLabel =
                new JLabel(
                        "Quality Level : "
                                + level
                );

        add(lowestLabel);

        add(gapLabel);

        add(levelLabel);

        JButton backButton = new JButton("Back");

        backButton.addActionListener(e ->
                cardLayout.show(mainPanel,"4")
        );

        add(backButton);
    }
}