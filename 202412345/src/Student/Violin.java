package Student;

public class Violin extends MusicalInstrument {
	
	public Violin(){
		this.type = "String instrument";
	}
	@Override
	void play() {
		System.out.println("play a " + type);
	}
}
