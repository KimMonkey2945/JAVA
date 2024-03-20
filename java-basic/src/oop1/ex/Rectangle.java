package oop1.ex;

public class Rectangle {

    int width;
    int height;

    int area;
    int perimeter;
    boolean square;

    int calculateArea() {
        this.area = width * height;
        return this.area;
    }

    int calculatePerimeter() {
        this.perimeter = 2 * (width + height);
        return this.perimeter;
    }

    boolean isSquare() {
        if(width == height) {
            this.square = true;
        } else {
            this.square = false;
        }
        return this.square;
    }



}
