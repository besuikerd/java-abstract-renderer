package nl.besuikerd.renderer.core;

import java.awt.Canvas;
import java.awt.Color;

public abstract class AbstractRenderArea implements RenderMeasurement{

	private PaintJob paintJob;
	
	public AbstractRenderArea(PaintJob paintJob) {
		this.paintJob = paintJob;
	}
	
	
}
