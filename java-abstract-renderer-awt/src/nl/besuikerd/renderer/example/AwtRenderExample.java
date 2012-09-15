package nl.besuikerd.renderer.example;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;

import nl.besuikerd.renderer.awt.RenderCanvas;
import nl.besuikerd.renderer.core.PaintJob;
import nl.besuikerd.renderer.core.RenderColor;
import nl.besuikerd.renderer.core.RenderFont;
import nl.besuikerd.renderer.core.RenderGraphics;
import nl.besuikerd.renderer.core.RenderPaint;
import nl.besuikerd.renderer.core.StrokeType;

public class AwtRenderExample {
	
	public static void main(String[] args) {
		new AwtRenderExample().start();
	}
	
	private JFrame frame;
	private Canvas canvas;
	
	public AwtRenderExample() {
		frame = new JFrame("Awt Canvas test");
		Canvas canvas = new RenderCanvas(new TestPaint());
		frame.setSize(400, 400);
		frame.add(canvas);
	}
	
	private void start(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class TestPaint implements PaintJob{

		@Override
		public void paint(RenderGraphics graphics, RenderPaint paint) {
			paint.setColor(RenderColor.YELLOW);
			paint.setStrokeType(StrokeType.FILL);
			System.out.println("Canvas width: " + (graphics.getWidth() - 10));
			System.out.println("Canvas height: " + (graphics.getHeight() - 10));
			System.out.println("Frame width: " + frame.getWidth());
			System.out.println("Frame height: " + frame.getHeight());
			int border = 10;
			graphics.drawRectangle(border, border, graphics.getWidth() - 10, graphics.getHeight() - 10);
			paint.setColor(0x222222, 100);
			graphics.drawRectangle(border, border, graphics.getWidth() - 10, graphics.getHeight() - 10);
			paint.setColor(RenderColor.BLACK, 255);
			paint.setFont(RenderFont.ARIAL.style(RenderFont.STYLE_BOLD).size(30));
			graphics.drawText("BLABLABLA", 50, 50);
		}
	}
}
