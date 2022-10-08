package java8;

public class LambdaDemo1 {

    interface Printer{
        void print(String val);
    }

    public void printSomething(String something, Printer printer){
        printer.print(something);
    }

    public static void main(String[] args) {
        LambdaDemo1 lambdaDemo1 = new LambdaDemo1();
        String param = "asdf";

        /*Printer printer = new Printer() {
            public void print(String val) {
                System.out.println(val);
            }
        };*/

        /**
         * 不支持接口有多个方法
         */
        /*Printer printer = (String val) -> {
            System.out.println(val);
        };*/

        lambdaDemo1.printSomething(param, val -> System.out.println(val));
    }
}
