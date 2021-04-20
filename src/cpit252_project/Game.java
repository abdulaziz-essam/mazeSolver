
package cpit252_project;

import java.util.LinkedList;
import static javafx.scene.input.KeyCode.V;
import javax.swing.JOptionPane;

public class Game {
  Maze maze;
    char block='B'; 
char space=' ';
char[][]mazeArr =new char[10][10];
  int startX, startY,endX,endY;

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }
boolean found=false;
    public Game(Maze maze) {
        this.maze = maze;
        this.mazeArr=maze.getMaze();
    }


    public char[][] getMazeArr() {
        return mazeArr;
    }

    public void setMazeArr(char[][] mazeArr) {
        this.mazeArr = mazeArr;
    }
private final char start='S';
private final char finish='F';        
 
public void startPostion(int x,int y){
    setStartX(x);
    setStartY(y);
    mazeArr= maze.getMaze();
 mazeArr [x][y]=start;

   }
public void endPostion(int x,int y){
  setEndX(x);
    setEndY(y);
    mazeArr= maze.getMaze();
 mazeArr [x][y]=finish;

   }
public void printMAze(){
        for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.print(mazeArr[i][j]+"|");    
        }
            System.out.println("");
    }
        
}

public void addObstacle(int x,int y){
 mazeArr= maze.getMaze();
 if(mazeArr[x][y]==space|| mazeArr[x][y]==block){
    mazeArr [x][y]=block;
    
 }
 else{
      System.out.println("you can't add obstacle here ");
 }


   }
public void  removeObstacle(int x,int y){
 mazeArr= maze.getMaze();
 if(mazeArr[x][y]==block){
 mazeArr [x][y]=space;

}else{
            System.out.println("get out");
}

}

public void randomlyGenerate(){
    int count=0;
    int x=0;
    int y=0;
    while (true) {        
        if(count==10){
            break;
        }
        x=(int) (Math.random()*10);
      y=(int) (Math.random()*10);
    if(mazeArr[x][y]==space){
        mazeArr[x][y]=block;
        count++;
    }else{
       
    }
    }
}
public char up(int x, int y) {
        char cell = 0;
        if (x > 0) {

            cell = mazeArr[x-1][y];

            return cell;
        } else {
            return 'x';
        }

    }
//The down cell is x,y-1

    public char dwon(int x, int y) {
        char cell = 0;
        if (x <= 8) {
            cell = mazeArr[x + 1][y];

            return cell;
        } else {

            return 'x';
        }

    }

    //The right cell is x+1,y
    public char right(int x, int y) {
        char cell = 0;
        if (y < 9) {
            cell = mazeArr[x][y + 1];

            return cell;
        } else {

            return 'x';
        }

    }
    //The left cell is x-1,y

    public char left(int x, int y) {
        char cell = 0;
        if (y > 0) {
            cell = mazeArr[x][y - 1];

            return cell;
        }
        return 'x';

    }
       
    public boolean slove(int x, int y) {

        if ((this.right(x, y) == 'F' || this.left(x, y) == 'F' || this.up(x, y) == 'F' || this.dwon(x, y) == 'F' || this.rightdwon(x, y) == 'F' || this.rightup(x, y) == 'F' || this.leftup(x, y) == 'F'|| this.leftdwon(x, y) == 'F' ) && !found) {
        found=true;
            System.out.println("found");
        
            return true;
        }

        if(dwon(x, y)== ' ' &&  !found) {
            mazeArr[x + 1][y] = 'v';

             slove(x + 1, y);

        }  if (left(x, y) == ' '&&  !found) {
            mazeArr[x][y - 1] = 'v';
             slove(x, y - 1);

        } if (right(x, y) == ' '&&  !found) {
            mazeArr[x][y + 1] = 'v';
             slove(x, y + 1);

        } if (up(x, y) == ' ' &&  !found) {
            mazeArr[x - 1][y] = 'v';
             slove(x - 1, y);

        } 
     if (rightup(x, y) == ' '&&  !found) {
            mazeArr[x - 1][y + 1] = 'v';
            slove(x - 1, y + 1);
        }
        if (leftup(x, y) == ' '&&  !found) {
            mazeArr[x - 1][y - 1] = 'v';
            slove(x - 1, y - 1);
        }
        if (rightdwon(x, y) == ' '&&  !found) {
            mazeArr[x + 1][y + 1] = 'v';
            slove(x + 1, y + 1);
        }
        if (leftdwon(x, y) == ' '&&  !found) {
            mazeArr[x + 1][y - 1] = 'v';
            slove(x + 1, y - 1);
        }
        
        return false;
    }
    public char rightup(int x, int y) {
        char cell = 0;
        if (x > 0 && y < 9) {
            cell = mazeArr[x - 1][y + 1];

            return cell;
        }
        return 0;

    }
//The up left diagonal is x-1,y+1

    public char leftup(int x, int y) {
        char cell = 0;
        if (x > 0 && y > 0) {
            cell = mazeArr[x - 1][y - 1];

            return cell;
        }
        return 0;

    }
    //The down left diagonal is x-1,y-1

    public char leftdwon(int x, int y) {
        char cell = 0;
        if (x < 9 && y > 0) {
            cell = mazeArr[x + 1][y - 1];

            return cell;
        }
        return 0;

    }
    //The down right is x+1,y-1

    public char rightdwon(int x, int y) {
        char cell = 0;
        if (x < 9 && y < 9) {
            cell = mazeArr[x + 1][y + 1];

            return cell;
        }
        return 0;

    }
    public void findS(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
              if(mazeArr[i][j]=='S'){
                  setStartX(i);
                  setStartY(j);
              }  
            }
        }
        
    }

  


}


//if (right == ' ') {
////   this.mazeArr[row][col+1]='V';
//      return solve(row,col+1);
//  }
//  else if (down == ' ') {
////       this.mazeArr[row+1][col]='V';
//    return solve(row+1,col);
//  }
// else if (left == ' ') {
////   this.mazeArr[row][col-1]='V';
//      return solve(row,col-1);
//  }
// else  if (up == ' ') {
////    this.mazeArr[row-1][col]='V';
//      return solve(row-1,col);
//  }
//  return false;
//
//}






//
//    public int[][] clone() { //used to create savedMaze[][] we already discussed its use before
//        int[][] mazeCopy = new int[Size()][Size()];
//        for (int i = 0; i < Size(); i++) {
//            for (int j = 0; j < Size(); j++) {
//                mazeCopy[i][j] = maze[i][j];
//            }
//        }
//        return mazeCopy;
//    }
