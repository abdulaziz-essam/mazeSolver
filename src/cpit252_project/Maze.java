
package cpit252_project;

public class Maze  implements mazeCopier{
char maze[][] =new char[10][10];
char block='B'; 
char space=' ';
//char[][] maze = new char[][]{ // the initial array for the maze
//            
//         {block, block, block, block, block, block, block, block, block,block },
//        {block, start.getValue(), space, space, space, space, space, space, space, block},
//        {block, space, space, space, block, space, block, block, space, 8},
//        {block, space, block, block, block, space, block, block, space, block},
//        {block, space, space, space, space, block, block, block, space, block},
//        {block, block,block,block, space, block, block, block, space, block},
//        {block, block, block, block, space, block, space, space, space, block},
//        {block, block, space, block, space, block, block, space, space, block},
//        {block, block, space, space, space, space, space, space, space, block},
//        {block, block, block, block, block, block, 0, block, block, 'F'}
//    };
    public Maze() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               maze[i][j]=' ';
                                  
            }
         }
    }

    
    public void setMaze(char[][] maze) {
        this.maze = maze;
    }

    public char[][] getMaze() {
        return maze;
    }
//   public cha getMAze(){
//        System.out.println("");
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(maze[i][j]+" ");
//            }System.out.println("");
//        }

//    @Override
//    public Maze makeCopy() {
//      Maze mazeCopy = null; 
// try { mazeCopy = (Maze) super.clone(); } 
// catch (CloneNotSupportedException e) { e.printStackTrace(); } 
// return mazeCopy;
//    }



    @Override
    public Maze makeCopy() {
 Maze sheepObj = null; 
 try { sheepObj = (Maze) super.clone(); } 
 catch (CloneNotSupportedException e) { e.printStackTrace(); } 
 return sheepObj;
    }

    
  


    
}
