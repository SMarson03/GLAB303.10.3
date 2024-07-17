public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    public void setColor(String color){
        this.color = color;
    }
    public void setColor(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setBase(double base){
        this.base = base;
    }
    //The getArea method is abstract.
    //It must be overridden in a subclass.
    public abstract double getArea();
    //Returns a self-descriptive string

    public String toString() {
        return null;
    }
    public void displayshapName(){
        System.out.println("I am a Shape.");
    }

    public void setWidth(int i) {
    }
}
