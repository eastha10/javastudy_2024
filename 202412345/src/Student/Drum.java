package Student;

public class Drum extends MusicalInstrument {
	public Drum(){
		this.type = "percussion instrument";
	}
	@Override
	void play() {
		System.out.println("play a " + type);
	}
}
