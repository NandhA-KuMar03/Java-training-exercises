package strategy;
import java.util.Scanner;
public class StrategyPattern {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Channel Number");
			int num = sc.nextInt();
			TvChannels channel = (TvChannels) Class.forName("strategy.Channel" + num).newInstance();
			channel.ChannelNumber();
		}
	}
}
abstract class TvChannels{
	abstract void ChannelNumber();
}

class Channel1 extends TvChannels{
	@Override
	void ChannelNumber() {
		System.out.println("Channel 1 clicked");
		System.out.println("Star Sports");
	}
}

class Channel2 extends TvChannels{
	@Override
	void ChannelNumber() {
		System.out.println("Channel 2 clicked");
		System.out.println("ESPN");
	}
}

class Channel3 extends TvChannels{
	@Override
	void ChannelNumber() {
		System.out.println("Channel 3 clicked");
		System.out.println("HBO");
	}
}

class Channel4 extends TvChannels{
	@Override
	void ChannelNumber() {
		System.out.println("Channel 4 clicked");
		System.out.println("Star Movies");
	}
}