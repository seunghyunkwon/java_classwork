package project;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class MusicPlayer {
	public static Clip clip = null;
	private static long clipTimePosition = 0;

	public static void Play() {
		clip.setMicrosecondPosition(clipTimePosition);
		clip.start();
	}

	public static void Pause() {
		clipTimePosition = clip.getMicrosecondPosition();
		clip.stop();
	}

	public static void Start(File m) {
		try {
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(m);
			clip = AudioSystem.getClip();
			clip.open(audioInput);
			FloatControl gainControl = 
					(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-37);
			clip.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void Stop() {
		clip.stop();
	}
	
	
}
