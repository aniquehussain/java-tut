package com.syedanique.learningOldFileReader;

import java.io.*;

public class OldFileReader {
    public static void main(String[] args) {

        File file = new File("ab1c.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while(line !=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }


        }catch (FileNotFoundException err){
            System.out.println("File not found");
            err.printStackTrace();
        }catch(IOException err){
            System.out.println("Problem reading file" + file.getName());
            err.printStackTrace();
        } finally {
            try{
               if(bufferedReader != null){
                   bufferedReader.close();
               }
                if(fileReader != null){
                    fileReader.close();
                }

            }catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
