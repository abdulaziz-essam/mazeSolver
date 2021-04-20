
package cpit252_project;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cpit252_project {

    public static void main(String[] args) throws FileNotFoundException, CloneNotSupportedException {
//        char start = "";
//    //free space   (white Square)
//    final static int C = 0;
//    //initial state
//    final static int S = 2;
//    //goal
//    final static int E = 8;
//    // the path
//    final static int V = 9;
//

//    //initial state   (i,j)
//    final static int START_I = 1, START_J = 1;
//    //goal  (i,j)
//    final static int END_I = 2, END_J = 9;


//           for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(maze[i][j]+"|");
//             
//            }
//               System.out.println("");
//           }
//           prototype p=new prototype(maze);
//           p.getMAze();
Maze maze=new Maze();
Game game=new Game(maze);
           Scanner sc=new Scanner(System.in);
           int command ;
             FactoryMaze factoryMaze=new FactoryMaze();
              
           int x = 0,y = 0;
           while (true) {            
               System.out.println("choose from 1 to 9");
               System.out.println("1) Select Start position.\n" +
"2) Select Finish position.\n" +
"3) Add obstacle\n" +
"4) Remove obstacle\n" +
"5) Randomly generate 10 obstacles.\n" +
"6) Calculate shortest path\n" +
"7) Print maze\n" +
"8) Load maze from file\n" +
"9) Save maze in file");
               Singleton s ;
               
             command=  Integer.parseInt(sc.nextLine());
       
             switch (command) {
        case 1:
            System.out.println("enter start position");
            System.out.print("enter x :");
            x=Integer.parseInt(sc.nextLine());
              System.out.print("enter y : ");
               y=Integer.parseInt(sc.nextLine());
           factoryMaze.createStart(x, y,maze);
            
            break;
        case 2:
               System.out.println("enter end position"); 
            System.out.print("enter x :");
            x=Integer.parseInt(sc.nextLine());
              System.out.print("enter y : ");
               y=Integer.parseInt(sc.nextLine());
             factoryMaze.createEnd(x, y,maze);
           break;
        case 3:
              System.out.println("enter obstacle position"); 
            System.out.print("enter x :");
            x=Integer.parseInt(sc.nextLine());
              System.out.print("enter y : ");
               y=Integer.parseInt(sc.nextLine());
           factoryMaze.creatobstacle(x, y, maze);
            break;
        case 4:
             System.out.println("enter obstacle position to remove"); 
            System.out.print("enter x :");
            x=Integer.parseInt(sc.nextLine());
              System.out.print("enter y : ");
               y=Integer.parseInt(sc.nextLine());
         factoryMaze.removebstacle(x, y, maze);
            break;
              case 5:
                  System.out.println("generate 10 obstacle randomly");
                 factoryMaze.creato_10_obstacle(maze);
            break;
              case 6:
             game.findS();
                  game.slove(game.getStartX(), game.startY);
                  
            break;
              case 7:
           game.printMAze();
            break;
            
              case 8:
                  System.out.println("load");
                  game.printMAze();
                s=Singleton.getInstance();
                char [][]loadGame=new char[10][10];
                  
                loadGame=s.load();
//                  for (int i = 0; i < 10; i++) {
//                      for (int j = 0; j < 10; j++) {
//                          System.out.print(loadGame[i][j]);
//                      }
//                      System.out.println("");
//                  }
            
               
                game.setMazeArr(loadGame);
                
                game.printMAze();
          
            break;
              case 9:
              s=Singleton.getInstance();      
              
          s.save(maze.getMaze());
            break;
                case 0:
            System.exit(0);
            break;
        default:
            System.out.println("wrong number ");
    }
            
//          char[][]copyArr = new char[10][10];
//          copyArr=copy.getMaze();
//               for (int i = 0; i < 10; i++) {
//                   for (int j = 0; j < 10; j++) {
//                       System.out.print(copyArr[i][j]+"|");
//                       
//                   }
//                                 
//                   System.out.println("");
//               
//               }
               
        }
           
           
           
           
//           System.out.println("enter x ");
//           int x=Integer.parseInt(sc.nextLine());
//              System.out.println("enter y ");
//           int y=Integer.parseInt(sc.nextLine());
//           Maze maze=new Maze();
//           Game g=new Game(maze);
//          g.endPostion(x, y);
//           g.printMAze();
//             System.out.println("enter ob ");
//            x=Integer.parseInt(sc.nextLine());
//               y=Integer.parseInt(sc.nextLine());
//           g.addObstacle(0, 1);
//            g.addObstacle(1, 0);
//           g.printMAze();
//           System.out.println("");
//           System.out.println("");
////            System.out.println("enter ob ");
////            x=Integer.parseInt(sc.nextLine());
////               y=Integer.parseInt(sc.nextLine());
////               g.removeObstacle(x, y);
////               g.printMAze();
//
////g.printMAze();
//g.startPostion(x, y);
//g.randomlyGenerate();
//g.slove(x, y);
//g.printMAze();

    }
    
}
