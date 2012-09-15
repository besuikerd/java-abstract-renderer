package nl.besuikerd.renderer.awt;

import java.awt.Canvas;
import java.awt.Graphics;

import nl.besuikerd.renderer.core.RenderMeasurement;

public class AwtRenderMeasurement implements RenderMeasurement{

	private Canvas canvas;
	
	public AwtRenderMeasurement(Canvas canvas){
		this.canvas = canvas;
	}
	
	@Override
	public int getHeight() {
		return canvas.getHeight();
	}

	@Override
	public int getWidth() { 
		return canvas.getWidth();
	}
}
