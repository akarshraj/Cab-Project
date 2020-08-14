package cab.project.newpackage;

public class Location {
    private int x, y;

    
    //Default Constructor
    public Location() {
        x=0;
        y=0;
    }

    //Initialiser Constructor
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    //Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
