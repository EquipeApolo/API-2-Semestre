/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package projeto.model.tipos;

/**
 *
 * @author Aluno
 */
public enum FuncaoUsuario {
    
    CLIENTE(0),
    SUPORTE(1),
    ADMIN(2);
    
    private final int id;
    
    FuncaoUsuario(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public static FuncaoUsuario getFuncaoByID(int id){
        
        for(FuncaoUsuario tipo : values()){
            if(tipo.getId() == id){
                return tipo;
            }
        }
        
        return null;
    }
    
    public static FuncaoUsuario getFuncaoByName(String name){
        
        for(FuncaoUsuario tipo : values()){
            if(tipo.toString().equalsIgnoreCase(name)) return tipo;
        }
        
        return null;
    }
}
