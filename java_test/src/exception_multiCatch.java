public class exception_multiCatch {
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return a/b;
    }
}

class ExceptionDemo{
    public static void main(String[] args){
        exception_multiCatch d = new exception_multiCatch();
//对方声明几个异常，就对应几个catch块， 如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面
        try{
            int x = d.div(4,0);
            System.out.println("x=" + x);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }catch (Exception e){
//            这个父类异常异地昂要卸载最后，不让上面的就不执行了。因为所有子类都属于这个类
            System.out.println(e.toString());
        }

        System.out.println("Over");
    }
}
