package cab.project.newpackage;
import java.util.*;

public class PassengerList {
    static HashMap<Integer, PassengerDetails> p_hm_details;
    static ArrayList<PassengerDetails> p;
    static int key = 101;
    
    static {
        p = new ArrayList<PassengerDetails>();
        p.add(new PassengerDetails("Ayushmaan", "9112233445", 2, 3));
        p.add(new PassengerDetails("Mr. Sen", "966923388", 2, 1));
        p.add(new PassengerDetails("Vrusheel", "9100091000", 3, 4));
        p.add(new PassengerDetails("Abhivyakti", "7878888888",5, 0));
        insertDriverDetails();
    }
    
    public int addPassengerDetails(String p_name, 
            String p_phone, int p_x, int p_y)
    {
        int p_id = key;
        PassengerDetails p_details =new PassengerDetails(
                                        p_name, p_phone, p_x, p_y);
        p.add(p_details);
        p_hm_details.put(key++, p_details);
        return p_id;
    }
    
    public Location getPassengerLocation(int p_id)
    {
        Location loc;
        PassengerDetails pd = p_hm_details.get(p_id);
        loc = pd.getCurrentLocation();
        return loc;
    }
    
    public PassengerDetails getPassengerDetails(int p_id)
    {
        PassengerDetails pd = p_hm_details.get(p_id);
        return pd;
    }
    
    public String getNameOf(int p_id)
    {
        PassengerDetails p_details = p_hm_details.get(p_id);
        String name = p_details.getP_name();
        return name;
    }
    
    public void updatePassengerLocation(int p_key, int x, int y)
    {
        PassengerDetails pd = p_hm_details.get(p_key);
        pd.setCurrentLocation(x, y);
    }
    
    public static void insertDriverDetails()
    {
        p_hm_details = new HashMap<Integer, PassengerDetails>();
        
        for(PassengerDetails i : p)
        {
            p_hm_details.put(key++, i);
        }
    }
    
}

