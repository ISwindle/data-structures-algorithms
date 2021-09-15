package com.techex;

import com.techex.projects.audio.AudioPlayer;
import com.techex.projects.images.DisplayImage;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws {

        DisplayImage displayImage = new DisplayImage("src/com/techex/resources/darth-vader-2.jpg");
        JFrame frame = new JFrame();
        frame.add(displayImage);
        frame.setSize(400,400);
        frame.setVisible(true);
        String audioFilePath = "src/com/techex/resources/ImperialMarch60.wav";
        AudioPlayer player = new AudioPlayer();
        player.play(audioFilePath);
    }
}
