package nl.besuikerd.renderer.core;

import java.awt.Color;


public class RenderColor {
	public static final RenderColor BLACK = new RenderColor(0, 0, 0);
	public static final RenderColor WHITE = new RenderColor(255, 255, 255);
	public static final RenderColor RED = new RenderColor(255, 0, 0);
	public static final RenderColor GREEN = new RenderColor(0, 255, 0);
	public static final RenderColor BLUE = new RenderColor(0, 0, 255);
	public static final RenderColor YELLOW = new RenderColor(255, 255, 0);
	public static final RenderColor GRAY = new RenderColor(128, 128, 128);
	public static final RenderColor CYAN = new RenderColor(0, 255, 255);
	
	private int red;
	private int green;
	private int blue;
	
	private RenderColor(int red, int green, int blue){
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public static RenderColor fromRgb(int red, int green, int blue){
		return new RenderColor(red, green, blue);
	}
	
	public static RenderColor fromHex(int hex){
		return new RenderColor((hex & 0xFF0000) >> 16, (hex & 0x00FF00) >> 8, hex & 0x0000FF);
	}
	
	public static RenderColor fromHex(String hex){
		return fromHex(Integer.decode(hex));
	}
	
	public static int getHex(int red, int green, int blue){
		return new RenderColor(red, green, blue).getHex();
	}
	
	public int getBlue() {
		return blue;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getRed() {
		return red;
	}
	
	public int getHex(){
		return (red << 16) + (green << 8) + blue;
	}
	
	@Override
	public String toString() {
		return "RenderColor[hex: " + Integer.toHexString(getHex()) + ", integer: " + getHex() + "]";
	}
}
