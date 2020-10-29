package com.nc.autumn2020.solutions.additional;

import java.io.*;
import java.util.Base64;

public class Descriptor {
    public static void main(String[] args) throws IOException {
        File NemolyaevIV = new File("src/main/java/com/nc/autumn2020/tasks/additional/decript/Немоляев Илья Владиславович");
        FileReader fileReader = new FileReader(NemolyaevIV);
        int c;
        StringBuilder stringBuilder = new StringBuilder();
        while ((c=fileReader.read())!=-1) {
            stringBuilder.append((char) c);
        }
        byte[] bytes = stringBuilder.toString().getBytes();
        File file = new File("src/main/java/com/nc/autumn2020/solutions/additional/image");
        file.createNewFile();
        FileOutputStream fileWriter = new FileOutputStream(file);
        fileWriter.write(Base64.getDecoder().decode(bytes));
    }
}
