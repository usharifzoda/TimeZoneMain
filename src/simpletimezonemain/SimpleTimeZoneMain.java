package simpletimezonemain;

import java.util.Locale;
import java.util.SimpleTimeZone;

/**
 *
 * @author usharifzoda
 */
public class SimpleTimeZoneMain {

    public static void main(String[] args) {
        
        SimpleTimeZone myTimeZone = new SimpleTimeZone(-18000000, "America/New_York");
        System.out.println(myTimeZone);
        System.out.println(myTimeZone.getID());
        System.out.println(myTimeZone.getDisplayName());
        System.out.println(myTimeZone.getRawOffset());
        
        
    }
    
}
