package nl.besuikerd.renderer.awt;

import java.awt.Font;
import java.awt.Graphics;

import nl.besuikerd.renderer.core.RenderFont;
import nl.besuikerd.renderer.core.RenderGraphics;
import nl.besuikerd.renderer.core.RenderMeasurement;
import nl.besuikerd.renderer.core.RenderPaint;

public class AwtRenderGraphics implements RenderGraphics{
	private Graphics graphics;
	private RenderMeasurement renderMeasurement;
	private RenderPaint paint;
	
	public AwtRenderGraphics(RenderMeasurement measurement, Graphics graphics, RenderPaint paint) {
		this.graphics = graphics;
		this.renderMeasurement = measurement;
		this.paint = paint;
	}
	
	@Override
	public int getHeight() {
		return renderMeasurement.getHeight();
	}
	
	@Override
	public int getWidth() {
		return renderMeasurement.getWidth();
	}
	
	@Override
	public void drawRectangle(int xLeft, int yLeft, int xRight, int yRight) {
		switch(paint.getStrokeType()){
		case FILL:
			graphics.fillRect(xLeft, yLeft, xRight - xLeft, yRight - yLeft);
			break;
		default:
			graphics.drawRect(xLeft, yLeft, xRight - xLeft, yRight - yLeft);
		}
	}
	
	@Override
	public void drawRectangleByWidthHeight(int x, int y, int width, int height) {
		graphics.drawRect(x, y, width, height);
	}
	
	@Override
	public void drawText(String text, int x, int y) {
		graphics.setFont(Font.getFont(paint.getFont().getFamily()));
		graphics.drawString(text, x, y);
	}
	
	@Override
	public void drawText(String text, RenderFont font, int x, int y) {
		paint.setFont(font);
		drawText(text, x, y);
	}
}
