package study02.exam02;

public class Application1 {
    public static void main(String[] args){
        Conv obj = new Conv(3);
        obj.a=5;
        int b = obj.func();
        System.out.print(obj.a + b);
    }
}
