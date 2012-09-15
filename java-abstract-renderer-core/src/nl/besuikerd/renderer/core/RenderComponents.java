package nl.besuikerd.renderer.core;

public interface RenderComponents {
	public RenderPaint getPaint();
	public RenderMeasurement getRenderArea();
	public RenderGraphics getRenderGraphics(RenderMeasurement renderArea);
}