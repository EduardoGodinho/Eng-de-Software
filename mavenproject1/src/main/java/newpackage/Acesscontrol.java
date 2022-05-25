package newpackage;

import java.util.List;
import java.util.ArrayList;

public class Acesscontrol{
    
    private Usuario user;
    private Leitura l = new Leitura();
    private List<Usuario> bdUser = new ArrayList<Usuario>();
    private gerUser gerUser = new gerUser();
    
    public void Menu(){
 
        boolean vai = true;
		int op = 0;

        while(vai){
            
            System.out.printf("\n1-Cadastrar usuário");
            System.out.printf("\n2-Atualização de Usuário");
            System.out.printf("\n3-Excluir Usuário");
            op = Integer.parseInt(l.entDados("\n\nEscolha uma opcao: "));
			
            switch(op){
				
                case 1:				
                    System.out.printf("\nCadastrar um usuario ");
                    user = new Usuario();
                    user = gerUser.cadUser(user);
                    if(user!=null){					
                        l.entDados("\nUsuario cadastrado com successo! Press <Enter>...");					
                    }else{		
                        l.entDados("\nJa existe um Usuario com esse codigo! Press <Enter>...");
			}					
                    break;		
                    
                case 2:
                    System.out.printf("\nAtualizar um Usuario");
                    user = new Usuario();
                    user.setCPF(Integer.parseInt(l.entDados("\nQual o CPF do usuario a ser atualizado: ")));
                    user = gerUser.consCPFuser(user);

                    if(user != null){
                        gerUser.attUser(user);
                    }else{
                        l.entDados("\nNao existe Usuario com este CPF! Press <Enter>... ");		
                    }	
                    break;	
                    
                case 3:
                    System.out.printf("\nRemover um Usuario");	
                    user = new Usuario();
                    user.setCPF(Integer.parseInt(l.entDados("\nEscolha o codigo do time de basquete para ser removido: ")));
                    user = gerUser.consCPFuser(user);

                    if(user != null){
                        gerUser.removeUser(user);
                    }else{
			l.entDados("\nNao existe Usuario com este CPF! Press <Enter>... ");		
                    }	
                    break;
            }
        }
    }   
}