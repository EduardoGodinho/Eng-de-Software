package newpackage;

public class Usuario{
    private String Nomeuser = "";
    private int CPF = 0;
    private String Pwaccess = "";
    
    public Usuario(){
        Nomeuser = "";
        CPF = 0;
        Pwaccess = "";
    }

    public void setNomeuser(String Nomeuser){this.Nomeuser = Nomeuser;}
    public String getNomeuser(){return Nomeuser;}
    
    public void setCPF(int CPF){this.CPF = CPF;}
    public int getCPF(){return CPF;}
    
    public void setPwaccess(String Pwaccess){this.Pwaccess = Pwaccess;}
    public String getPwaccess(){return Pwaccess;}
    
}
