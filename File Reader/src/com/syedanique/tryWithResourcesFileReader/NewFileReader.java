package com.syedanique.tryWithResourcesFileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NewFileReader {
    public static void main(String[] args) {
        File file = new File("table.csv");
        List<String> lines = new ArrayList<>();
// Try with resources is being used
        try(
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ){
            String line = bufferedReader.readLine();
            bufferedReader.readLine();
            while(line != null){

                line = bufferedReader.readLine();
                lines.add(line);
//                System.out.println(line);
            }
            System.out.println(lines);
//            for (String linee: lines) {
//                for (int i = 0; i < linee.length(); i++) {
//                    int start = linee.indexOf(",",i);
//                    int end = linee.indexOf(",", i++);
//                    String num = linee.substring(start,end);
//                    Double d = Double.parseDouble(num);
//                }
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
