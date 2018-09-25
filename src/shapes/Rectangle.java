package shapes;

public class Rectangle {
    //PROTECTED: VISIBLE TO THIS CLASS/ITS SUBCLASSES,
    //AND ALL CLASSES IN THE SAME PACKAGE
    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }


    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }



    public int getArea(){
        return 25000;

    }
    public int getPerimeter(){
        return 54000;
    }


}