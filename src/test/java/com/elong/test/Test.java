package com.elong.test;

import com.elong.util.TextFile;
import sun.nio.ch.FileLockImpl;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static javafx.scene.input.KeyCode.F;

/**
 * 创建人 : peierlong
 * 描述 :
 */
public class Test {

    public static void main(String[] args) {
        TextFile.write("123.txt", "123123123\n123123123");
        String read = TextFile.read("123.txt");
        System.out.println(read);
    }

}
