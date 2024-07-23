package study02.exam01;

public class Child extends Parent{
    int x;

    Child (int x) {                             // (3)
        super(x+1, x);
        this.x = x;
    }

    int getT(int n){                            // (4)
        return super.getT()+n;
    }
}
