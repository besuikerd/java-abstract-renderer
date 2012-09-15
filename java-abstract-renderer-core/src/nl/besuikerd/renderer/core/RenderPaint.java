package nl.besuikerd.renderer.core;


public interface RenderPaint {
	public RenderPaint newInstance();
	
	public void setColor(int hex);
	public void setColor(int hex, int alpha);
	public void setColor(int red, int green, int blue);
	public void setColor(int red, int green, int blue, int alpha);
	public void setColor(RenderColor color);
	public void setColor(RenderColor color, int alpha);
	public void setAlpha(int alpha);
	public void setFont(RenderFont font);
	public int getColor();
	public int getAlpha();
	public RenderFont getFont();
	public void setStrokeType(StrokeType strokeType);
	public StrokeType getStrokeType();
}
