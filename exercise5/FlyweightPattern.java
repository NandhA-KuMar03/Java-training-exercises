package flyweight;

import java.util.HashMap;
import java.util.Random;

interface Phone{ 
	  public void color(String color);
	  public void func();
}

class Android implements Phone{
	private String color;
	@Override
	public void color(String color) {
		this.color = color;
	}
	@Override
	public void func() {
		System.out.println("calling from android phone with color: "+ color);
	}
}

class Iphone implements Phone{
	private String color;
	@Override
	public void color(String color) {
		this.color = color;
	}
	@Override
	public void func() {
		System.out.println("calling from iphone phone with color: "+ color);
	}
}

class PhoneFactory{
    private static final HashMap<String, Phone> Phones = new HashMap<>();
    public static Phone getPhone(String type) {
    	Phone p=null;
    	if (Phones.containsKey(type))
            p = Phones.get(type);
    else
    {
        switch(type)
        {
        case "Android":
            System.out.println("Android phone created");
            p = new Android();
            break;
        case "IOS":
            System.out.println("IOS created");
            p = new Iphone();
            break;
        default :
            System.out.println("Unreachable code!");
        }
        Phones.put(type, p);
    }
		return p;
    }
}

public class FlyWeightPattern {
	static String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	private static String[] os ={"Android", "IOS"};
	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) { 
			Phone p = PhoneFactory.getPhone(getRandomPhone());
			String targetColor=getRandomColor(); 
			String targetPhone= getRandomPhone();
			p.color(targetColor);
			p.func();
			}
	}
	public static String getRandomColor() {
        Random r = new Random();
        int randInt = r.nextInt(colors.length);
        return colors[randInt];
	}
    public static String getRandomPhone()
    {
        Random r = new Random();
        int randInt = r.nextInt(os.length);
        return os[randInt];
    }
}