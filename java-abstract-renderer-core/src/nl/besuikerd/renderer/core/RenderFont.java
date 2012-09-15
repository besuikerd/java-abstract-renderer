package nl.besuikerd.renderer.core;

import javax.swing.text.StyledEditorKit.BoldAction;

public enum RenderFont {
	ARIAL("Arial");
	
	public static final int STYLE_DEFAULT = 1;
	public static final int STYLE_BOLD = 2;
	public static final int STYLE_ITALIC = 4;
	
	private int style;
	private String family;
	private int size;
	
	private RenderFont(String family) {
		this.family = family;
		this.style = style;
	}
	
	public RenderFont style(int style){
		this.style = style;
		return this;
	}
	
	public RenderFont size(int pixels){
		this.size = size;
		return this;
	}
	
	public String getFamily() {
		return family;
	}
	
	public int getStyle() {
		return style;
	}
	
	public boolean isBold(){
		System.out.println((style & STYLE_BOLD));
		return (style & STYLE_BOLD) >> 1 == 1; 
	}
	
	public boolean isItalic(){
		return (style & STYLE_ITALIC) >> 2 == 1;
	}
	
	public boolean isDefault(){
		return (style & STYLE_DEFAULT) == 1;
	}
	
	@Override
	public String toString() {
		return "RenderFont[family=" + family + ", style=" + (isBold() ? "bold, " : "") + (isDefault() ? "default, " : "") + (isItalic() ? "italic" : "");
	}
}
