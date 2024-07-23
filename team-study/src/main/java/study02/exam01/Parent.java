package study02.exam01;

class Parent {
    int x, y;

    Parent(int x, int y) {              // (1)
        this.x = x;
        this.y = y;
    }

    int getT() {                        // (2)
        return x*y;
    }
}
