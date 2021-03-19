package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JFrameCreation {

    private JFrame fiveStarApplicationWindow;

    public JFrameCreation() {
        fiveStarApplicationWindow = new JFrame();
        fiverStarApplicationWindowInitialization();
    }

    public void fiverStarApplicationWindowInitialization() {
        fiveStarApplicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fiveStarApplicationWindow.setSize(getScreenSize().get(0), getScreenSize().get(1));
        fiveStarApplicationWindow.setVisible(true);
    }

    public ArrayList<Integer> getScreenSize() {
        ArrayList<Integer> screenDimension = new ArrayList<>();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        screenDimension.add((int) screenSize.getWidth());
        screenDimension.add((int) screenSize.getHeight());

        return screenDimension;
    }
}
