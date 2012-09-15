package nl.besuikerd.renderer.awt;

import java.awt.Canvas;
import java.awt.Graphics;

import nl.besuikerd.renderer.core.PaintJob;
import nl.besuikerd.renderer.core.RenderMeasurement;
import nl.besuikerd.renderer.core.RenderGraphics;
import nl.besuikerd.renderer.core.RenderPaint;

public class RenderCanvas extends Canvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PaintJob paintJob;
	
	public RenderCanvas(PaintJob paintJob) {
		this.paintJob = paintJob;
	}
	
	@Override
	public void paint(Graphics g) {
		RenderPaint paint = new AwtRenderPaint(g);
		paintJob.paint(new AwtRenderGraphics(new AwtRenderMeasurement(this), g, paint), paint);
	}
}
