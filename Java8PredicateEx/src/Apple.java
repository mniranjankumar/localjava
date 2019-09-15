
public class Apple {
	private String color;
	private int weight;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}
	
	
}