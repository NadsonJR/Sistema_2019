/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Abstract.pessoaModal;

/**
 *
 * @author Lemontech
 */
public class ClienteMODAL extends pessoaModal{
    private int ID;
    private String datanascimento;
    private boolean status;                         

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ClienteMODAL(int ID, String datanascimento, boolean status, String NomeCompleto, String CPF, String RG, String cep, String endereco, String cidade, String estado, String telefone, String celular) {
        super(NomeCompleto, CPF, RG, cep, endereco, cidade, estado, telefone, celular);
        this.ID = ID;
        this.datanascimento = datanascimento;
        this.status = status;
    }

    public ClienteMODAL(String datanascimento, boolean status, String NomeCompleto, String CPF, String RG, String cep, String endereco, String cidade, String estado, String telefone, String celular) {
        super(NomeCompleto, CPF, RG, cep, endereco, cidade, estado, telefone, celular);
        this.datanascimento = datanascimento;
        this.status = status;
    }
     
}
