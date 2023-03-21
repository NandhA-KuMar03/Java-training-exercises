package command;
import java.util.*;
interface command{
	public void execute();
}
class Light{
	public void lightOn() {
		System.out.println("Lights on");
	}
	public void lightOff() {
		System.out.println("Lights off");
	}
}
class LightOffCommand implements command{
	Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.lightOff();
	}
}
class LightOnCommand implements command{
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.lightOn();
	}
}

class CoffeeMachine{
	public void hotCoffee() {
		System.out.println("Prepare hot coffee");
	}
	public void greenTea() {
		System.out.println("Prepare green tea");
	}
}
class CoffeeMachineHotCommand implements command{
	CoffeeMachine coffeeMachine;
	public CoffeeMachineHotCommand(CoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}
	@Override
	public void execute() {
		coffeeMachine.hotCoffee();
	}
}
class CoffeeMachineGreenCommand implements command{
	CoffeeMachine coffeeMachine;
	public CoffeeMachineGreenCommand(CoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}
	@Override
	public void execute() {
		coffeeMachine.greenTea();
	}
}

class MusicPlayer{
	public void anirudhSong() {
		System.out.println("Play beat songs");
	}
	public void rajaSong() {
		System.out.println("Play slow songs");
	}
}
class MusicPlayerAnirudh implements command{
	MusicPlayer musicPlayer;
	public MusicPlayerAnirudh(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	@Override
	public void execute() {
		musicPlayer.anirudhSong();
	}
}
class MusicPlayerRaja implements command{
	MusicPlayer musicPlayer;
	public MusicPlayerRaja(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	@Override
	public void execute() {
		musicPlayer.rajaSong();
	}
}

class Buttons{
	command abc;
	public void settingUpCommand(command command) {
		abc = command;
	}
	public void executeAll() {
		abc.execute();
	}
}

public class CommandPattern {
	public static void main(String[] args) {
		Buttons choice = new Buttons();
		Light light = new Light();
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		MusicPlayer musicPlayer = new MusicPlayer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for morning 2 for night");
		int n = sc.nextInt();
		if(n==1) {
			choice.settingUpCommand(new LightOnCommand(light));
			choice.executeAll();
			choice.settingUpCommand(new CoffeeMachineHotCommand(coffeeMachine));
			choice.executeAll();
			choice.settingUpCommand(new MusicPlayerAnirudh(musicPlayer));
			choice.executeAll();
		}
		if(n==2) {
			choice.settingUpCommand(new LightOffCommand(light));
			choice.executeAll();
			choice.settingUpCommand(new CoffeeMachineGreenCommand(coffeeMachine));
			choice.executeAll();
			choice.settingUpCommand(new MusicPlayerRaja(musicPlayer));
			choice.executeAll();
		}
	}
}
