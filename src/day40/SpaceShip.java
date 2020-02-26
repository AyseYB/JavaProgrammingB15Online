package day40;

public class SpaceShip {

    String name ;
    String currentDirection ;
    int x ;
    int y ;

    public void setInitialPosition(int newX, int newY){
        x = newX;
        y = newY;


    }
    /**
     * Accept 1 String parameter to set the direction to either up , down , right , left
     *
     * @param newDirection
     */
    public void setDirection(String newDirection){
        if(     newDirection.equalsIgnoreCase("up" )||
                newDirection.equalsIgnoreCase("down")||
                newDirection.equalsIgnoreCase("right")||
                newDirection.equalsIgnoreCase("left")){
            currentDirection=newDirection;
        }else {
            System.out.println(" Invalid Direction " );
        }
    }

    /**
     * move the spaceship to 1 block according to the currect direction
     */
    public void move1Block(){

        switch (currentDirection){
            case  "right":
                x++;
                break;
            case "left":
                --x;
                break;
            case "up":
                ++y;
                break;
            case "down":
                --y;
                break;
            default:
                break;
        }


    }

    // right click in your class anywhere
    // select generate
    // select toString -->> Hit enter
    // Delete @override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    // add a functionality to move1Block with direction provided in one shot

    /**
     * This will take a direction and move spaceship object 1 block
     *
     * @param newDirection
     */
    public void move1Block (String newDirection){
        // we are reusing the functionality we already have to set the direction
        setDirection(newDirection);
        // we are reusing the functionality we already have to smove1Block
        move1Block();
    }
}
