
package cab.project.newpackage;

public class PassengerDetails {
    private String p_name, p_phone;
    private Location p_loc, d_loc; 
    //Constructor
    public PassengerDetails(String p_name, 
            String p_phone, int p_x, int p_y) {
        this.p_name = p_name;
        this.p_phone = p_phone;
        this.p_loc = new Location(p_x, p_y);
        this.d_loc = new Location(p_x, p_y);
    }
    
    //Getter Methods
    public String getP_name() {
        return p_name;
    }

    public String getP_phone() {
        return p_phone;
    }

    
    //Setter Methods
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void setP_phone(String p_phone) {
        this.p_phone = p_phone;
    }
    
    //Setting and getting the driver's 
    //currrent location to some new location
    public void setCurrentLocation(int p_x, int p_y)
    {
        p_loc.setX(p_x);
        p_loc.setY(p_y);
    }
    public Location getCurrentLocation()
    {
        Location sample_loc = new Location
                          (p_loc.getX(),p_loc.getY());
        return sample_loc;
    }
    
    
    public void setDropLocation(int d_x, int d_y)
    {
        d_loc.setX(d_x);
        d_loc.setY(d_y);
    }
    public Location getDropLocation()
    {
        Location sample_loc = new Location
                          (d_loc.getX(),d_loc.getY());
        return sample_loc;
    }
    
}

