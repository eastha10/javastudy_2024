package Student;

public class InheitanceTest {
	public static void main(String[] args) {
		MusicalInstrument music[] = {new Piano(), new Violin(), new Drum()};
		for(int i = 0 ; i<3 ; i++) {
			music[i].play();
		}
	}
}
