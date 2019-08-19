package com.zhangjianxin.designpattern.jdkcodeanalyze;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-19 21:32
 * @Version V1.0
 **/
public class DecoratorMode {
    public static void main(String[] args) throws IOException {
        DataInputStream stream = new DataInputStream(new FileInputStream("D:\\abc.txt"));
        stream.read();

    }
}
