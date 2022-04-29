/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.model;

/**
 *
 * @author Aluno
 */
public class Projeto {
    
    private int id;
    private String nome;
    private String descricao;
    private int idCliente;
    
    public Projeto(String nome, String descricao, int idCliente){
        this.idCliente = idCliente;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public Projeto(int id, String nome, String descricao, int idCliente){
        this.id = id;
        this.idCliente = idCliente;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
