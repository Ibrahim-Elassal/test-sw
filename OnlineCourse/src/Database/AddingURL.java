
package Database;

import java.awt.Desktop;


public class AddingURL {
   
    public static void URL(String url){
       Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(java.net.URI.create(url));
        } catch (Exception exception ) {
        } 
    }
    
}
