package music;
import static music.CreatingMusic.track;

import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class CreatingMusic {
	public static int trebleTime;
	public static int bassTime;
	public static final boolean T = true;
	public static final boolean B = false;
	public static final boolean A = true; // Advance
	public static final boolean D = false; // Don't advance
	public static Track track;
	
	public static int getNote(String noteName,
			                  int octave) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("C", 60);
		map.put("C#", 61);
		map.put("D", 62);
		map.put("D#", 63);
		map.put("E", 64);
		map.put("F", 65);
		map.put("F#", 66);
		map.put("G", 67);
		map.put("G#", 68);
		map.put("A", 69);
		map.put("A#", 70);
		map.put("B", 71);
		
		return(map.get(noteName) + (octave - 5)*12);
	}
	
	public static int lengthOfDuration(String duration) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("s", 1);
		map.put("i", 2);
		map.put("q", 4);
		map.put("h", 8);
		map.put("w", 16);
		
		if (!duration.endsWith("."))		
		   return(map.get(duration));
		else {
			int temp = map.get(duration.substring(0,1));
			
			return(temp + temp/2);
		}
	}

	public static void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			
			player.open();
			
			player.setTempoInBPM(120);
			
			Sequence sequence = new Sequence(Sequence.PPQ,4);
			
			track = sequence.createTrack();
			

			player.setSequence(sequence);
			
			player.start();
		} catch (Exception e) {
			System.out.println(e);
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		play();
		
		CreatingMusic creatingMusic = new CreatingMusic();
		
		Util.jingleBells(creatingMusic);

	}
}
