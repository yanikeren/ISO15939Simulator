
import javax.swing.*;
import java.awt.*;
import gui.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("ISO 15939 Simulator");

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        mainPanel.add(new ProfilePanel(cardLayout, mainPanel), "1");
        mainPanel.add(new DefinePanel(cardLayout, mainPanel), "2");
        mainPanel.add(new PlanPanel(cardLayout, mainPanel), "3");
        mainPanel.add(new CollectPanel(cardLayout, mainPanel), "4");
        mainPanel.add(new AnalysePanel(cardLayout, mainPanel), "5");


        frame.add(mainPanel);

        frame.setVisible(true);
    }
}