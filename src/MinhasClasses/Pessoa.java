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

public class Pessoa 
{   
    private String nome;
    private Date data_nasc;
    private long data_milis;
    private Boolean sexo;
    private float peso;
    private float altura;
    
    
    public static ArrayList<Pessoa> buscaPessoaBd(Connection conn, JFrame jframe)
    {
        String qry = "SELECT * FROM pessoas_nova";
        ArrayList<Pessoa> vct_pessoas = new ArrayList<Pessoa>();
        
        try(Statement stmt = conn.createStatement())
        {
            ResultSet myrs = stmt.executeQuery(qry);
            
            while(myrs.next())
            {
                vct_pessoas.add(new Pessoa(myrs.getString("nome"),
                                    myrs.getDate("data_milis"),
                                    myrs.getBoolean("sexo"),
                                    myrs.getFloat("peso"),
                                    myrs.getFloat("altura")));
            }
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(jframe, "Não foi possível obter os dados da tabela", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        return vct_pessoas;
    }
    
    
    public void salvaPessoaBd(Connection conn)
    {   
        String qry_create_tbl = "CREATE TABLE IF NOT EXISTS pessoas_nova (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	nome text NOT NULL,\n"
                + "	data_milis long,\n"
                + "	sexo boolean,\n"
                + "	peso real,\n"
                + "	altura real\n"
                + ");";
        
        String qry_insert_row = "INSERT INTO pessoas_nova(nome,data_milis,sexo,peso,altura) VALUES(?,?,?,?,?)";
        
        try(Statement stmt = conn.createStatement())
        {
            stmt.execute(qry_create_tbl);   
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try(PreparedStatement pstmt = conn.prepareStatement(qry_insert_row)) 
        {
            pstmt.setString(1, nome);
            pstmt.setLong(2, data_milis);
            pstmt.setBoolean(3, sexo);
            pstmt.setFloat(4, peso);
            pstmt.setFloat(5, altura);
            pstmt.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    public Pessoa(String nome, Date data_nasc, Boolean sexo, float peso, float altura)
    {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(data_nasc);
        this.data_milis = cal.getTimeInMillis();
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + "\n, data_nasc=" + data_nasc + "\n, sexo=" + sexo + "\n, peso=" + peso + "\n, altura=" + altura + '}';
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
