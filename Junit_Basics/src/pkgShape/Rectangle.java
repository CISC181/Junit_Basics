package pkgShape;

public class Rectangle {

	private int Width;
	private int Length;
	public Rectangle(int width, int length) {
		super();
		Width = width;
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	
	public double Perimeter()
	{
		return (2*Length) + (2*Width);
		
	}
	
	public double Area()
	{
		return Length * Width;
	}
}
