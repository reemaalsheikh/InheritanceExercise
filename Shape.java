public class Shape {

    private String color;
    private boolean filled;

    // Constructor 1
    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    // Constructor 2
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
     return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with: [" + "color: " + getColor() + (filled ? " , filled" : " , not filled")+ "]";
    }



}
