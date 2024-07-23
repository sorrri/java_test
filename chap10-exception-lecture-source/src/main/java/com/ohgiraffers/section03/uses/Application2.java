package com.ohgiraffers.section03.uses;

/* 수업목표. try-with-resource 구문을 이해하고 활용할 수 있다. (feat.finally 안쓰기) */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("test.dat"))){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
