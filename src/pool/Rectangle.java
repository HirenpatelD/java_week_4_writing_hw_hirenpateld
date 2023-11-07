package pool;
/**
 * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length
 * both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and
 * it needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of the width field.
 * Method named getLength without any parameters, it needs to return the value of the length field.
 * Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */
public class Rectangle {
    double lentgh;
    double width;

    public Rectangle(double width, double length){
        this.width = width;
        this.lentgh = length;
        if(this.width < 0){
            this.width = 0;
        }
        if (this.lentgh < 0) {
            this.lentgh = 0;
        }
        }
        public double getWidth(){
        return this.width;
    }

    public double getLength() {
        return this.lentgh;
    }
    public double getArea(){
        return (getWidth() * getLength());
    }
}