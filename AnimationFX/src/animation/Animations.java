package animation;


public class Animations{
	private String name;
	private String direction;
	private int frames;
	private int startX;
	private int startY;
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getFrames() {
		return frames;
	}
	public void setFrames(int frames) {
		this.frames = frames;
	}
	public int getStartX() {
		return startX;
	}
	public void setStartX(int startX) {
		this.startX = startX;
	}
	public int getStartY() {
		return startY;
	}
	public void setStartY(int startY) {
		this.startY = startY;
	}
	
	public void print() {
		System.out.println("name: "+name);
		System.out.println("direction: "+direction);
		System.out.println("frames: "+frames);
		System.out.println("startX: "+startX);
		System.out.println("startY: "+startY);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}