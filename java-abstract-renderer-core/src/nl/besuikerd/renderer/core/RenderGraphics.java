package nl.besuikerd.renderer.core;

public interface RenderGraphics {
	public int getHeight();
	public int getWidth();
	public void drawRectangle(int xLeft, int yLeft, int xRight, int yRight);
	public void drawRectangleByWidthHeight(int x, int y, int width, int height);
	public void drawText(String text, int x, int y);
	public void drawText(String text, RenderFont font, int x, int y);
}
