package Day2;

public class Ques3 {
	    private double length;
	    private double breadth;

	    public Ques3(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public void area() {
	        System.out.println(breadth * length);
	    }

	    public void perimeter() {
	        System.out.println(2 * (breadth + length));
	    }
	}