/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        // Play mp3 file
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        System.out.println();

        // Play mp4 file - will be handled by MediaAdapter and Mp4Player
        audioPlayer.play("mp4", "alone.mp4");
        System.out.println();

        // Play vlc file - will be handled by MediaAdapter and VlcPlayer
        audioPlayer.play("vlc", "far far away.vlc");
        System.out.println();

        // Play avi file - will be handled by MediaAdapter and AviPlayer
        audioPlayer.play("avi", "mind me.avi");
        System.out.println();

        // Attempt to play an unsupported file format
        audioPlayer.play("flv", "example.flv");
    }
}
