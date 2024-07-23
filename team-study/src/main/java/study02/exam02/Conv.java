package study02.exam02;

public class Conv {
    public Conv(int a) {
        this.a = a;
    }
    int func() {
        int b =1;
        for (int i=1; i<a; i++){
            b = a * i + b;
        }
        return a +b;
    }
    int a;
}
