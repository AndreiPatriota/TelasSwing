package principal;

import telas.JFrPrincipal;
import MinhasClasses.Pessoa;
import java.util.ArrayList;


public class Main 
{   
    public static JFrPrincipal app = null;
    public static ArrayList<Pessoa> arLsPessoas = null;
    
    public static void main(String[] args)
    {
        arLsPessoas = new ArrayList<>();
        
        app = new JFrPrincipal();
    }
}
