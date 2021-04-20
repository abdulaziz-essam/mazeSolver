
package cpit252_project;

public class FactoryMaze {

    public FactoryMaze() {
   
    }

    public void createStart(int x, int y, Maze maze) {

        maze.maze[x][y] = 'S';

       
    }

    public void createEnd(int x, int y, Maze maze) {

        maze.maze[x][y] = 'F';
       

    }

    public void creatobstacle(int x, int y, Maze maze) {

        if (maze.maze[x][y] == ' ' || maze.maze[x][y] == 'B') {
            maze.maze[x][y] = 'B';

        } else {
            System.out.println("you  cant add  obsticel here ");
        }

    }

    public void  removebstacle(int x, int y, Maze maze) {

        if (maze.maze[x][y] == 'B') {
            maze.maze[x][y] = ' ';

        } else {
            System.out.println("you  cant add  obsticel here ");
        }

       

    }

    public void creato_10_obstacle( Maze maze) {
        int count = 0;
        int x = 0;
        int y = 0;
        while (true) {
            if (count == 10) {
                break;
            }
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            if (maze.maze[x][y] == ' ') {
                maze.maze[x][y] = 'B';
                count++;
            } else {

            }
        }

      
    }
}
