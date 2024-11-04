package Student;

public class Piano extends MusicalInstrument{
	
	public Piano(){
		this.type = "keyboard instrument";
	}
	@Override
	void play() {
		System.out.println("play a " + type);
	}
}
