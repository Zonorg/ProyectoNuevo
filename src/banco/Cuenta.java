/*
Clase Cuenta donde se creará un array
 */
package banco;


public class Cuenta {;
    public static int x=2;
    public static registrar [] usuarios = new registrar[50];
    
    public class registrar {
	String  Nombre;
        String Apellido;
        String Usuario;
        String Email;
        String  Password;  
	int Saldo;
    }
    
        public void Preregistro(){
        usuarios[1]=new registrar();    
        usuarios[1].Nombre="";
        usuarios[1].Apellido="";
        usuarios[1].Email="";
        usuarios[1].Usuario="admin";
        usuarios[1].Password="admin";    
        usuarios[1].Saldo=0;
    }
        
        public void Crear(String nombre, String apellido, String email, String  usuario, String password, int saldo) {    
        usuarios[x]=new registrar();    
        usuarios[x].Nombre=nombre;
        usuarios[x].Apellido=apellido;
        usuarios[x].Email=email;
        usuarios[x].Usuario=usuario;
        usuarios[x].Password=password;
        usuarios[x].Saldo=saldo;
        x++;
    }
        
        public void Abonar(String usuario, int deposito) {            
            for(int i=1;i<x;i++)    {                                       
                if (usuario.equals(usuarios[i].Usuario))   {    
                    usuarios[i].Saldo=usuarios[i].Saldo+deposito;                 
                }
            }
	}      	
                
        public boolean Validar(String usuario, String password ) {        
        boolean band=false;
        for(int i=1;i<x;i++)    {                                       
            if (usuario.equals(usuarios[i].Usuario) && password.equals(usuarios[i].Password))  {
                band=true; 
                break;
            }
        }                   
        return band;
    }
        
        public void Retirar(String usuario, int retiro) {
        for(int i=1;i<x;i++)    {                                       
                if (usuario.equals(usuarios[i].Usuario))   {    
                    usuarios[i].Saldo=usuarios[i].Saldo-retiro;    
                }
            }
        }
}
