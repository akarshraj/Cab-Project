package cab.project.newpackage;

public class DriverDetails {
    private String d_name, d_phone;
    private int d_id;
    private Location d_c_loc; 
    private int d_status;             // 0 --> Available 
                                      // 1 --> Busy
    
    //Constructor
    public DriverDetails(int d_id, String d_name, String d_phone) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_phone = d_phone;
        this.d_c_loc = new Location();
        this.d_status = 0;
    }
    
    //Getter Methods
    public int getD_id() {
        return d_id;
    }
    
    public String getD_name() {
        return d_name;
    }

    public String getD_phone() {
        return d_phone;
    }

    public int getD_status() {
        return d_status;
    }
    
    //Setter Methods
    public void setD_id(int d_id) {
        this.d_id = d_id;
    }
    
    
    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public void setD_phone(String d_phone) {
        this.d_phone = d_phone;
    }

    public void setD_status(int d_status) {
        this.d_status = d_status;
    }
    
    //Setting and getting the driver's 
    //currrent location to some new location
    public void setCurrentLocation(int d_x, int d_y)
    {
        d_c_loc.setX(d_x);
        d_c_loc.setY(d_y);
    }
    public Location getCurrentLocation()
    {
        Location sample_loc = new Location
                          (d_c_loc.getX(),d_c_loc.getY());
        return sample_loc;
    }
    
}
