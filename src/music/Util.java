package music;
import static music.CreatingMusic.*;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Util {
	
	public static void jingleBells(CreatingMusic creatingMusic) {
		try {
			Sequencer player = MidiSystem.getSequencer();
			
			player.open();
			
			player.setTempoInBPM(160);
			
			Sequence sequence = new Sequence(Sequence.PPQ,4);
			
			track = sequence.createTrack();
			
			addNote("G4q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("C5q",A,T);
			
			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("G4h.",A,T);
			addNote("G4i",A,T);
			addNote("G4i",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("G4q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("C5q",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("A4h.",A,T);
			addRest("q",T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("A4q",A,T);
			addNote("F5q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("B4h.",A,T);
			addRest("q",T);

			addNote("G3h",A,B);
			addNote("D4h",A,B);

			addNote("G5q",A,T);
			addNote("G5q",A,T);
			addNote("F5q",A,T);
			addNote("D5q",A,T);

			addNote("G3h",A,B);
			addNote("B3h",A,B);
			
			addNote("E5h.",A,T);
			addRest("q",T);

			addNote("C4h",A,B);
			addNote("E4h",A,B);

			addNote("G4q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("C5q",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("G4h.",A,T);
			addRest("q",T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);
			
			addNote("G4q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("C5q",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("A4h.",A,T);
			addNote("A4q",A,T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("A4q",A,T);
			addNote("F5q",A,T);
			addNote("E5q",A,T);
			addNote("D5q",A,T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("G5q",A,T);
			addNote("G5q",A,T);
			addNote("G5q",A,T);
			addNote("G5q",A,T);

			addNote("F3h",A,B);
			addNote("C4h",A,B);

			addNote("A5q",A,T);
			addNote("G5q",A,T);
			addNote("F5q",A,T);
			addNote("D5q",A,T);

			addNote("G3h",A,B);
			addNote("B3h",A,B);

			addNote("C5h",A,T);
			addNote("B4h",D,T);
			addNote("G5h",A,T);

			addNote("C4h",A,B);
			addNote("G3h",D,B);
			addNote("D4h",A,B);

			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5h",D,T);
			addNote("E5h",A,T);

			addNote("C4h",A,B);
			addNote("B3h",A,B);

			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5h",D,T);
			addNote("E5h",A,T);

			addNote("A3h",A,B);
			addNote("G4h",A,B);

			addNote("E5q",A,T);
			addNote("G5q",A,T);
			addNote("C5q.",A,T);
			addNote("D5i",A,T);

			addNote("C4h",A,B);
			addNote("G3h",D,B);

			addNote("C5h.",D,T);
			addNote("E5h.",A,T);
			addRest("q",T);

			addNote("C4h",A,B);
			addNote("G3h",A,B);
			
			addNote("F5q",A,T);
			addNote("F5q",A,T);
			addNote("F5q.",A,T);
			addNote("F5i",A,T);

			addNote("F3h",A,B);
			addNote("A4h",A,B);
			
			addNote("F5q",A,T);
			addNote("E5q",A,T);
			addNote("E5q",A,T);
			addNote("E5i",A,T);
			addNote("E5i",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("E5q",A,T);
			addNote("D5q",A,T);
			addNote("D5q",A,T);
			addNote("E5q",A,T);
			
			addNote("D3h",A,B);
			addNote("F#3h",A,B);

			addNote("D5h",A,T);
			addNote("B4h",D,T);
			addNote("G5h",A,T);

			addNote("G3h",A,B);
			addNote("G3h",A,B);

			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5h",D,T);
			addNote("E5h",A,T);

			addNote("C4h",A,B);
			addNote("B3h",A,B);

			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5q",D,T);
			addNote("E5q",A,T);
			addNote("C5h",D,T);
			addNote("E5h",A,T);
			
			addNote("A3h",A,B);
			addNote("G3h",A,B);

			addNote("E5q",A,T);
			addNote("G5q",A,T);
			addNote("C5q.",A,T);
			addNote("D5i",A,T);

			addNote("C4h",A,B);
			addNote("G3h",A,B);

			addNote("C5h.",D,T);
			addNote("E5h.",A,T);
			addRest("q",T);

			addNote("C4h",A,B);
			addNote("G3h",A,B);
			
			addNote("F5q",A,T);
			addNote("F5q",A,T);
			addNote("F5q.",A,T);
			addNote("F5i",A,T);

			addNote("F3h",A,B);
			addNote("A3h",A,B);

			addNote("F5q",A,T);
			addNote("E5q",A,T);
			addNote("E5q",A,T);
			addNote("E5i",A,T);
			addNote("E5i",A,T);

			addNote("C3h",A,B);
			addNote("G3h",A,B);

			addNote("G5q",A,T);
			addNote("G5q",A,T);
			addNote("F5q",A,T);
			addNote("D5q",A,T);

			addNote("G3h",A,B);
			addNote("B3h",A,B);

			addNote("C5w",A,T);

			addNote("C4w",A,B);
			addNote("E4w",D,B);
			
			player.setSequence(sequence);
			
			player.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
		
}
