package com.zhangjianxin.designpattern.principle.openclose;

/**
 * 开闭原则是编成中最基础，最重要的设计原则,即对扩展开放（提供方），对修改关闭（使用方），用抽象构建框架，用实现扩展细节
 * 当我们给类增加新功能时，尽量不要修改代码,或者尽可能少的修改代码
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-14 17:26
 * @Version V1.0
 **/
public class OpenClosed {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

class Shape{
    int m_type;
}

class GraphicEditor{
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectabgle(s);
        }else if(s.m_type == 2){
            drawCircle(s);
        }
    }

    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    private void drawRectabgle(Shape s) {
        System.out.println("绘制矩形");
    }
}

class Rectangle extends Shape{
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape{
    public Circle() {
        super.m_type =2;
    }
}