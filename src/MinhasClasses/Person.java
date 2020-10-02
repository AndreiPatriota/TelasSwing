package MinhasClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Person 
{   
    private String name;
    private Date birthdayDate;
    private long birthdayMilis;
    private Boolean sex;
    private float wieght;
    private float hieght;
    
    
    public static ArrayList<Person> fetchPersonBd(Connection conn, JFrame jframe)
    {
        String qry = "SELECT * FROM tblpeople";
        ArrayList<Person> vct_people = new ArrayList<Person>();
        
        try(Statement stmt = conn.createStatement())
        {
            ResultSet myrs = stmt.executeQuery(qry);
            
            while(myrs.next())
            {
                vct_people.add(new Person(myrs.getString("name"),
                                    myrs.getDate("birthdayMilis"),
                                    myrs.getBoolean("sex"),
                                    myrs.getFloat("wieght"),
                                    myrs.getFloat("hieght")));
            }
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(jframe, "Não foi possível obter os dados da tabela\n " + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        return vct_people;
    }
    
    
    public static ArrayList<Person> fetchPersonBd(Connection conn, JFrame jframe, String qry_filter)
    {
        String qry = "SELECT * FROM tblpeople WHERE " + qry_filter;
        ArrayList<Person> vct_people = new ArrayList<Person>();
        
        try(Statement stmt = conn.createStatement())
        {
            ResultSet myrs = stmt.executeQuery(qry);
            
            while(myrs.next())
            {
                vct_people.add(new Person(myrs.getString("name"),
                                    myrs.getDate("birthdayMilis"),
                                    myrs.getBoolean("sex"),
                                    myrs.getFloat("wieght"),
                                    myrs.getFloat("hieght")));
            }
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(jframe, "Não foi possível obter os dados da tabela", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        return vct_people;
    }
    
    public void savePersonBd(Connection conn)
    {   
        String qry_create_tbl = "CREATE TABLE IF NOT EXISTS tblpeople (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	birthdayMilis long,\n"
                + "	sex boolean,\n"
                + "	wieght real,\n"
                + "	hieght real\n"
                + ");";
        
        String qry_insert_row = "INSERT INTO tblpeople(name,birthdayMilis,sex,wieght,hieght) VALUES(?,?,?,?,?)";
        
        try(Statement stmt = conn.createStatement())
        {
            stmt.execute(qry_create_tbl);   
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try(PreparedStatement pstmt = conn.prepareStatement(qry_insert_row)) 
        {
            pstmt.setString(1, name);
            pstmt.setLong(2, birthdayMilis);
            pstmt.setBoolean(3, sex);
            pstmt.setFloat(4, wieght);
            pstmt.setFloat(5, hieght);
            pstmt.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    public Person(String name, Date birthdayDate, Boolean sex, float wieght, float hieght)
    {
        this.name = name;
        this.birthdayDate = birthdayDate;
        this.sex = sex;
        this.wieght = wieght;
        this.hieght = hieght;
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthdayDate);
        this.birthdayMilis = cal.getTimeInMillis();
        
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + "\n, birthdayDate=" + birthdayDate + "\n, sex=" + sex + "\n, wieght=" + wieght + "\n, hieght=" + hieght + '}';
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public float getWieght() {
        return wieght;
    }

    public void setWieght(float wieght) {
        this.wieght = wieght;
    }

    public float getHieght() {
        return hieght;
    }

    public void setHieght(float hieght) {
        this.hieght = hieght;
    }
    
}
