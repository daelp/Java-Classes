public class Rectangle {
    //Instance Variables
    private double length;
    private double width;

    //Constructor

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Getters


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //Setters


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //Methods
    public double area(){
        return
                this.getLength() * this.getWidth();
    }
    public double diagonal(){
        return
                Math.sqrt((getLength() * getLength() + (getWidth() * getWidth())));
    }
    public String isSquare(){
        if (length == width){
            return "Yes this is square ";
        }else
            return "No, this is not square";
    }

}
