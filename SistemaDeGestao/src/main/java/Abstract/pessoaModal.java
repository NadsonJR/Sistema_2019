/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

public class pessoaModal {
 private String NomeCompleto;
 private String CPF;
 private String RG;
 private int idade;
 private String cep;
 private String endereço;
 private String cidade;
 private String estado;
 private String telefone;
 private String celular;

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public pessoaModal(String NomeCompleto, String CPF, String RG, int idade, String cep, String endereço, String cidade, String estado, String telefone, String celular) {
        this.NomeCompleto = NomeCompleto;
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
        this.cep = cep;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.celular = celular;
    }
 
 
 
}
