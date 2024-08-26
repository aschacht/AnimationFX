package animation;


import java.util.ArrayList;

public class Asset {
private String name="";
private String file="";
private int xSize=0;
private int ySize=0;
private int xStart=0;
private int yStart=0;
private ArrayList<Animations> animations = new ArrayList<>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFile() {
	return file;
}
public void setFile(String file) {
	this.file = file;
}
public int getxSize() {
	return xSize;
}
public void setxSize(int xSize) {
	this.xSize = xSize;
}
public int getySize() {
	return ySize;
}
public void setySize(int ySize) {
	this.ySize = ySize;
}
public int getxStart() {
	return xStart;
}
public void setxStart(int xStart) {
	this.xStart = xStart;
}
public int getyStart() {
	return yStart;
}
public void setyStart(int yStart) {
	this.yStart = yStart;
}
public ArrayList<Animations> getAnimations() {
	return animations;
}
public void setAnimations(ArrayList<Animations> actions) {
	this.animations = actions;
}



public void print() {
	System.out.println();
	System.out.println("name: "+name);
	System.out.println("file: "+file);
	System.out.println("xSize: "+xSize);
	System.out.println("ySize: "+ySize);
	System.out.println("xStart: "+xStart);
	System.out.println("yStart: "+yStart);
	System.out.println("-------------");
	for (Animations actions2 : animations) {
		actions2.print();
		System.out.println("");
	}
	System.out.println("-------------");


}





}
