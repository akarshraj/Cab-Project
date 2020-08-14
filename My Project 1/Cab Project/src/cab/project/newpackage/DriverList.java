package cab.project.newpackage;
import java.util.*;

public class DriverList {
    
    static HashMap<Integer, DriverDetails> d_hm_details;
    static ArrayList<DriverDetails> d;
    static HashMap<Integer, Integer> d_p = new HashMap<Integer, Integer>();
    
    static {
        d = new ArrayList<DriverDetails>();
        d.add(new DriverDetails(101,"Santosh", "931246654"));
        d.add(new DriverDetails(102,"Rakesh", "943126643"));
        d.add(new DriverDetails(103,"Gautam", "950923456"));
        d.add(new DriverDetails(104,"Rishi", "7931206654"));
        d.add(new DriverDetails(105,"Vikas", "7872105500"));
        d.add(new DriverDetails(106,"Shiv", "8223456789"));
        d.add(new DriverDetails(107,"Suraj", "9102287817"));
        d.add(new DriverDetails(108,"Ajay", "7872004400"));
        insertDriverDetails();
    }
    
    public DriverDetails getDriverDetails(int id)
    {
        DriverDetails d_details = d_hm_details.get(id);
        return d_details;
    }
    
    public Location getDriverLocation(int d_id)
    {
        Location loc;
        DriverDetails dd = d_hm_details.get(d_id);
        loc = dd.getCurrentLocation();
        return loc;
    }
     
    public DriverDetails findDriver(int pid)
    {
        DriverDetails df = null;
        PassengerList pd = new PassengerList();
        Location p_loc = pd.getPassengerLocation(pid);
        int p_x = p_loc.getX();
        int p_y = p_loc.getY();
        int pl = p_x*p_x + p_y*p_y;
        int minDis = 25;
        DriverList d_l = new DriverList();
        for(Map.Entry mp : d_hm_details.entrySet())
        {
            int key = (int)mp.getKey();
            DriverDetails dd = (DriverDetails)mp.getValue();
            if(dd.getD_status() == 0)
            {
                Location d_loc = d_l.getDriverLocation(key);
                int d_x = d_loc.getX();
                int d_y = d_loc.getY();
                int dl = d_x*d_x + d_y*d_y;
                int temp = Math.abs(dl - pl);
                if(temp <= minDis)
                {
                    df = dd;
                    minDis = temp;
                }
            }
        }
        return df;
    }
    
    public void setPassengerForDriver(int did, int pid, int x, int y)
    {
        d_p.put(did, pid);
        DriverDetails dd = d_hm_details.get(did);
        dd.setCurrentLocation(x, y);
    }
    
    
    public PassengerDetails getPassengerForDriver(int did)
    {
        int pid;
        PassengerDetails pd = null;
        if(d_p.containsKey(did))
        {
            pid = d_p.get(did);
            PassengerList pl = new PassengerList();
            pd = pl.getPassengerDetails(pid);
        }
        return pd;
    }
    
    public static void insertDriverDetails()
    {
        d_hm_details = new HashMap<Integer, DriverDetails>();
        
        int key = 101;
        for(DriverDetails i : d)
        {
            d_hm_details.put(key++, i);
        }
    }
    
}
