
package cpit252_project;

import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;


public final class Singleton {
    private static Singleton instance;
    private char value;
static File file;
PrintWriter pw;
Scanner sc;
char [][]maze=new char[10][10];
Maze mazeOp=new Maze();
    private Singleton() {
    
        System.out.println("trvwcrekrepkcer");
        
    }
    

    public static Singleton getInstance() {
        if (instance == null) {
             System.out.println("please select file"); 
            JFileChooser fc = new JFileChooser("");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.showSaveDialog(null);
         file = fc.getSelectedFile();
       if(!file.getName().endsWith("txt")){
           System.out.println("file type must be text");
       }
       else {
            
           instance = new Singleton();
        }
       
        }else{
            
            System.out.println("file already selected");
        }
        
        return instance;
    }

    public char getValue() {
        return value;
    }  
    public char [][] load() throws FileNotFoundException{
      sc=new Scanner(file);
      
      int y=0;
        while (sc.hasNextLine()) {            
           String line=sc.nextLine();
            for (int i = 0; i < line.length(); i++) {
                maze[y][i]=line.charAt(i);
               
            }
            y++;
        }   
        
       
        return maze ;
        
    }
    public  void save(char [][]maze) throws FileNotFoundException{
       pw=new PrintWriter(file );
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
             pw.print(maze[i][j]);
              
            }
            pw.println();
        }
        pw.close();
        
    }       
    
    
}
