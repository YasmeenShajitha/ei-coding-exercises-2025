package com.ei.patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter adapter;

    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            adapter = new MediaAdapter(fileType);
            adapter.play(fileType, fileName);
        }
    }
}
