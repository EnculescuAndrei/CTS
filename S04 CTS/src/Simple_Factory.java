interface Shape{
    void draw();
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("I AM A SQUARE!");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("I AM A CIRCLE!");
    }
}

class AnimalFactory{
    public static Shape createShape(String type){
        if("Square".equalsIgnoreCase(type)){
            return new Square();
        } else if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        }else{
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

class MainEx1{
    public static void main(String[] args){
        Shape shape1=AnimalFactory.createShape("Circle");
        shape1.draw();
        Shape shape2=AnimalFactory.createShape("Square");
        shape2.draw();
    }
}
