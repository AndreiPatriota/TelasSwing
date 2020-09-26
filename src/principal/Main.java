package principal;

import telas.JFrPrincipal;
import MinhasClasses.Pessoa;
import java.sql.Connection;
import java.util.ArrayList;


public class Main 
{   
    public static JFrPrincipal app = null;
    public static Connection con = null;
    
    public static void main(String[] args)
    {    
        app = new JFrPrincipal();
    }
}
