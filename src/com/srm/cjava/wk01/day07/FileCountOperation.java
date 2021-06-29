package com.srm.cjava.wk01.day07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCountOperation {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\file1.txt"); 
        String[] wordList=null;   
        FileReader fr = new FileReader(f1);  
        BufferedReader br = new BufferedReader(fr); 
        String line;
        int countword=0;
        int flag;
        int vowel=0;
        int cons=0;
        
        while((line=br.readLine())!=null)
        {
             wordList = line.split("\\s+");
                  
            countword += wordList.length;
           for(int i=0;i<wordList.length;i++)
           {
              for(int j=0;j<wordList[i].length();j++)
              {
                 char ch=wordList[i].charAt(j);   
                 if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')   
                 {
                        flag=1; 
                        vowel=vowel+1;
                        System.out.println("Vowel Found: " +ch);
                  }
                 else{
                     flag=0;
                     cons=cons+1;
                     System.out.println("Consonant Found : "+ch);
                 }
              }
                }
        }
        System.out.println("Total number of words in the File: " +countword);
        System.out.println("Total Characters in the File: " +(countword-1));
        System.out.println("Total Count of Vowels in the File:  "+vowel);
        System.out.println("Total Count of Consonants in the File: " +cons);
        br.close();
}
     }
        
