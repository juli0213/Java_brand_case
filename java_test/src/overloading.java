//先来看下方法重载（Overloading）的定义：如果有两个方法的方法名相同，但参数不一致，哪么可以说一个方法是另一个方法的重载。 具体说明如下：
//
//        方法名相同
//        方法的参数类型，参数个不一样
//        方法的返回类型可以不相同
//        方法的修饰符可以不相同
//        main 方法也可以被重载
//这么看继承就是光是名字一样了？？
//        以下实例演示了如何重载 MyClass 类的 info 方法：
class MyClass{
    int height;
    MyClass(){
        System.out.println("无参数的构造函数");
        height = 4;
    }
    MyClass(int i){
        System.out.println("房子高度是： " + i );
        height = i;
    }
    void info() {
        System.out.println("房子高度为 " + height + " 米");
    }
    void info(String s){
        System.out.println(s + ": 房子高度是 " + height + " :米");
    }
}


public class overloading {
    public static void main(String[] args){
        MyClass t = new MyClass(3);
        t.info();
        t.info("重构方法");
        new MyClass();
    }

}

