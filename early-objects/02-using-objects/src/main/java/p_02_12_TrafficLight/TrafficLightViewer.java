package p_02_12_TrafficLight;

import javax.swing.*;

/**
 * Write a graphical program that draws a traffic light.
 */
public class TrafficLightViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(500, 600);
        frame.setTitle("Traffic Light");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        TrafficLightComponent box = new TrafficLightComponent();

        frame.add(box);

        frame.setVisible(true);
    }
}
