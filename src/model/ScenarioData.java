package data;

import model.Dimension;
import model.Metric;

import java.util.ArrayList;

public class ScenarioData {

    public static ArrayList<Dimension> getData() {

        ArrayList<Dimension> dimensions =
                new ArrayList<>();

        Dimension usability =
                new Dimension("Usability",25);

        usability.addMetric(
                new Metric(
                        "SUS Score",
                        50,
                        "Higher",
                        0,
                        100,
                        "points",
                        89
                )
        );

        usability.addMetric(
                new Metric(
                        "Onboarding Time",
                        50,
                        "Lower",
                        0,
                        60,
                        "min",
                        5
                )
        );

        dimensions.add(usability);

        return dimensions;
    }
}