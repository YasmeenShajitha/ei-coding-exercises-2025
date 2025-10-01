package com.ei.patterns.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song1.mp3");
        player.play("mp4", "video1.mp4");
    }
}
