/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Abstract.pessoaModal;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author Lemontech
 */
public class UsuarioModal extends pessoaModal {

    private int ID;
    private String usuario;
    private String hashSenha;
    private String Filial;
    private String Cargo;

    public UsuarioModal(String usuario, String SenhaAberta, String Filial, String Cargo, String NomeCompleto, String CPF, String RG, String cep, String endereço, String cidade, String estado, String telefone, String celular) {
        super(NomeCompleto, CPF, RG, cep, endereço, cidade, estado, telefone, celular);
        this.usuario = usuario;
        this.Filial = Filial;
        this.Cargo = Cargo;
        setSenha(SenhaAberta);
    }

    public UsuarioModal(int ID, String usuario, String SenhaAberta, String Filial, String Cargo, String NomeCompleto, String CPF, String RG, String cep, String endereço, String cidade, String estado, String telefone, String celular) {
        super(NomeCompleto, CPF, RG, cep, endereço, cidade, estado, telefone, celular);
        this.ID = ID;
        this.usuario = usuario;
        this.hashSenha = hashSenha;
        this.Filial = Filial;
        this.Cargo = Cargo;
        setSenha(SenhaAberta);
    }
    
    public String getFilial() {
        return Filial;
    }

    public void setFilial(String Filial) {
        this.Filial = Filial;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

      public String getHashSenha() {
        return hashSenha;
    }

    public void setHashSenha(String senha) {
        this.hashSenha = senha;
    }
       
    public void setSenha(String senhaAberta) {
        this.hashSenha = BCrypt.hashpw(senhaAberta, BCrypt.gensalt());
    }
    
    public boolean validarSenha(String senhaAberta) {
        return BCrypt.checkpw(senhaAberta, hashSenha);
    }

}
