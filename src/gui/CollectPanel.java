package gui;

import data.ScenarioData;
import model.Dimension;
import model.Metric;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class CollectPanel extends JPanel {

    public CollectPanel(CardLayout cardLayout, JPanel mainPanel) {

        setLayout(new BorderLayout());

        String[] columns = {
                "Metric",
                "Value",
                "Score"
        };

        DefaultTableModel model =
                new DefaultTableModel(columns,0);

        ArrayList<Dimension> dimensions =
                ScenarioData.getData();

        for(Dimension d : dimensions) {

            for(Metric m : d.getMetrics()) {

                Object[] row = {

                        m.getName(),
                        m.getValue(),
                        m.calculateScore()
                };

                model.addRow(row);
            }
        }

        JTable table = new JTable(model);

        add(new JScrollPane(table));

        JButton nextButton = new JButton("Next");

        nextButton.addActionListener(e ->
                cardLayout.show(mainPanel,"5")
        );

        add(nextButton, BorderLayout.SOUTH);
    }
}