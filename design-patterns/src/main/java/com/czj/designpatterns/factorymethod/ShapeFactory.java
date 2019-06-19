package com.czj.designpatterns.factorymethod;



/**
 * @Author: clownc
 * @Date: 2019-06-19 15:52
 */
public class ShapeFactory implements Factory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
