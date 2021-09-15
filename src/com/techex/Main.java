package com.techex;

import com.techex.projects.audio.AudioPlayer;
import com.techex.projects.images.DisplayImage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        DisplayImage displayImage = new DisplayImage("src/com/techex/resources/star-wars-darth-vader.jpeg");
        JFrame frame = new JFrame();
        frame.add(displayImage);
        frame.setSize(400,400);
        frame.setLocation(size.width/3, size.height/3);
        frame.setVisible(true);
        String audioFilePath = "src/com/techex/resources/ImperialMarch60.wav";
        AudioPlayer player = new AudioPlayer();
        player.play(audioFilePath);

    }
}
