public class overriding {
    public static void main (String []agrs) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Figure figref;
        figref = f;
        System.out.println("Area is :" + figref.area());
        figref = r;
        System.out.println("Area is :" + figref.area());
    }
}
// 这个是父类
class Figure{
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    Double area(){
        System.out.println("Inside area for figure.");
        return dim1*dim2;
    }
}

//这个是子类，继承了方法

class  Rectangle extends Figure{
//  构造方法不能被继承，通过super()调用
    Rectangle(double a, double b){
        super(a,b);
    }
//    覆盖area方法
    Double area(){
        System.out.println("Inside area for rectangle");
        return (dim1*dim2);
    }
}
