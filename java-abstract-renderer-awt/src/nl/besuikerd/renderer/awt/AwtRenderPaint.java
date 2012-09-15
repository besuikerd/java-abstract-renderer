package nl.besuikerd.renderer.awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import nl.besuikerd.renderer.core.RenderColor;
import nl.besuikerd.renderer.core.RenderFont;
import nl.besuikerd.renderer.core.RenderPaint;
import nl.besuikerd.renderer.core.StrokeType;

public class AwtRenderPaint implements RenderPaint{

	private Graphics g;
	private StrokeType strokeType = StrokeType.DEFAULT;
	private RenderFont font;
	
	public AwtRenderPaint(Graphics g) {
		this.g = g;
	}
	
	@Override
	public RenderPaint newInstance() {
		return new AwtRenderPaint(g);
	}
	
	@Override
	public void setColor(int hex) {
		setColor(hex, g.getColor().getAlpha());
	}

	@Override
	public void setColor(int hex, int alpha) {
		int red = (hex & 0xFF0000) >> 16;
		int green = (hex & 0x00FF00) >> 8;
		int blue = hex & 0xFF;
		setColor(red, green, blue, alpha);
	}

	@Override
	public void setColor(int red, int green, int blue) {
		setColor(red, green, blue, g.getColor().getAlpha());
	}

	@Override
	public void setColor(RenderColor color) {
		setColor(color.getHex());
	}
	
	public void setColor(RenderColor color, int alpha) {
		setColor(color.getHex(), alpha);
	};
	
	@Override
	public void setColor(int red, int green, int blue, int alpha) {
		g.setColor(new Color(red, green, blue, alpha));
	}
	
	@Override
	public void setAlpha(int alpha) {
		Color old = g.getColor();
		g.setColor(new Color(old.getRed(), old.getGreen(), old.getBlue(), alpha));
	}
	
	@Override
	public int getColor() {
		return g.getColor().getRGB();
	}
	
	@Override
	public int getAlpha() {
		return g.getColor().getAlpha();
	}
	
	@Override
	public void setStrokeType(StrokeType strokeType) {
		this.strokeType = strokeType;
	}
	
	@Override
	public StrokeType getStrokeType() {
		return strokeType;
	}
	
	@Override
	public void setFont(RenderFont font) {
		this.font = font;
	}
	
	@Override
	public RenderFont getFont() {
		return font;
	}
}
