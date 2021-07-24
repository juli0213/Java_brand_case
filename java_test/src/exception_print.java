public class exception_print {
    public static void main(String[] args){
//        tyr是正常代码块，catch是对异常的处理
        try {
//            自定义异常
//            throw关键字抛出异常，必须使用try-catch与句话捕获处理，否则在方法的声明处通过throws关键字指明要抛出给方法调用者的异常，继续下一步操作
            throw new Exception("my exception");
        }catch (Exception e){
//            异常会有一个异常类接受的
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():"+e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }
}
