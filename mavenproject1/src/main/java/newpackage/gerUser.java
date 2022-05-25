package newpackage;


    
import java.util.List;
import java.util.ArrayList;


public class gerUser {
	
	private Usuario user;
	private List<Usuario> bdUser = new ArrayList<Usuario>();
        private Leitura l = new Leitura();
        public List<Usuario> getBdUser(){
            return bdUser;
        }   
  
//===================================== User =========================================================================

	public Usuario cadUser(Usuario user){
                
                user.setNomeuser(l.entDados("\nQual o nome do Usuário? \nR= "));
		user.setCPF(Integer.parseInt(l.entDados("\nQual o CPF do Usuario? \nR= ")));
                if(consCPFuser(user) != null){
                    return null;
                } 
                user.setPwaccess(l.entDados("\nQual o poder de acesso do Usuario (Ex: Couro, Borracha...) \nR= "));
                bdUser.add(user);
                return user;
        }
                
	public Usuario consCPFuser(Usuario user){
			for(int i = 0; i < bdUser.size(); i++){
			if (user.getCPF() == bdUser.get(i).getCPF()){
				return bdUser.get(i);
			}
		}
		return null;
	}
        
        public void attUser(Usuario user){
		
		user.setNomeuser(l.entDados("\nQual o nome do Usuário? \nR= "));
		user.setCPF(Integer.parseInt(l.entDados("\nQual o CPF do Usuario? \nR= ")));
                user.setPwaccess(l.entDados("\nQual o poder de acesso do Usuario (Ex: Couro, Borracha...) \nR= "));
               
		for(int i = 0; i < bdUser.size();i++){
			if(user.getCPF() == bdUser.get(i).getCPF()){
				bdUser.set(i,user);	
			}		
		}	
	}
	
       
	public Usuario removeUser(Usuario user){
            user = consCPFuser(user);
            if(user != null){
            bdUser.remove(user);
            }
            return user;
        }
        
}