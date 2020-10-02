package principal;

import telas.JFrPrincipal;
import java.sql.Connection;
import java.util.ArrayList;


public class Main 
{   
    public static JFrPrincipal app = null;
    public static Connection conn = null;
    public static boolean isConnected;
    
    public static void main(String[] args)
    {    
        isConnected = false;
        app = new JFrPrincipal();
    }
}
    