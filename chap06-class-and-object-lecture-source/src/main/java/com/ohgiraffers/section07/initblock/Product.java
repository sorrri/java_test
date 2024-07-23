package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "아이폰";              // 상품명
    private int price;                          // 상품 가격
    private static String brand;                // 제조사

    {
        System.out.println("초기화 블럭 실행...");
        name = "헬쥐폰";
        brand = "헬쥐";
    }

    static {
//        name = "싸이온";
        brand = "엘지";
    }

    public Product() {
        System.out.println("Product 기본생성자 호출됨...");
        name = "아이뽕";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", brand='" + Product.brand + '\'' +
                '}';
    }
}
