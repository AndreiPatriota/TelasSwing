package MinhasClasses;

import java.util.Date;

public class Pessoa 
{   
    private String nome;
    //private Date data_nasc;
    private Boolean sexo;
    private float peso;
    private float altura;

    public Pessoa(String nome, Boolean sexo) 
    {
        this.nome = nome;
        //this.data_nasc = data_nasc;
        this.sexo = sexo;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    /*
    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }
*/
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
