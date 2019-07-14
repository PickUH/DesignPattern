package com.zhangjianxin.designpattern.principle.openclose.improve;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-14 17:51
 * @Version V1.0
 **/
public class OpenClosed {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        Circle circle = new Circle();
        System.out.println(circle.m_type);
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

abstract class Shape {
    int m_type = 1;

    public abstract void draw();
}

class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }

    public void draw() {
        System.out.println("话矩形");
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }

    public void draw() {
        System.out.println("话圆形");
    }
}