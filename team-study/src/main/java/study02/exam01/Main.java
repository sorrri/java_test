package study02.exam01;

class Main {
    public static void main(String[] args) {               // (5)
        Parent parent = new Child(3);                   // (6)
        System.out.println(parent.getT());                 // (7)
    }
}
