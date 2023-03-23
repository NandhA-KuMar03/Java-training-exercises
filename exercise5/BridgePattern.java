package bridge;
import java.util.*;
abstract class Song{
	OnRepeat onRepeat;
	public abstract void play();
	public Song(OnRepeat onRepeat) {
		this.onRepeat = onRepeat;
	}
}

class TamilSong extends Song{
	public TamilSong(OnRepeat onRepeat) {
	super(onRepeat);
	}
	public void play() {
		System.out.println("Tamil Song played");
		onRepeat.onRepeat();
	}
}

class EnglishSong extends Song{
	public EnglishSong(OnRepeat repeat) {
		super(repeat);
	}
	public void play() {
		System.out.println("English Song played");
		onRepeat.onRepeat();
	}
}

interface MusicPlayer{
	public void onRepeat();
}

class OnRepeat implements MusicPlayer{
	@Override
	public void onRepeat() {
		System.out.println("This song will be played on loop");
	}	
}

public class BridgePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Song tm = new TamilSong(new OnRepeat());
		Song em = new EnglishSong(new OnRepeat());
		System.out.println("Enter the song you want to play on repeat \n1.Tamil Song\n 2.English Song");
		int n = sc.nextInt();
		if(n==1)
			tm.play();
		else
			em.play();
	}
}