package com.kibong.refactoring_study.mutable_data._18_split_variable;

public class Rectangle {

    //Command+Shift+T를 사용하여 테스트 코드로 이동을 원할히 할 수 있다.
    private double perimeter;
    private double area;

    public void updateGeometry(double height, double width) {
        final double perimeter = 2 * (height + width);
        System.out.println("Perimeter: " + perimeter);
        this.perimeter = perimeter;

        area = height * width;
        System.out.println("Area: " + area);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
