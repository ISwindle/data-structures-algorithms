package com.techex.projects.images;

import java.awt.*;
import javax.swing.JFrame;


public class DisplayImage extends Canvas {

    String filepath;

    public DisplayImage(String filepath)
    {
        this.filepath = filepath;
    }

    public void paint(Graphics screen) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(filepath);
        screen.drawImage(image, 0, 0, this);
    }
}