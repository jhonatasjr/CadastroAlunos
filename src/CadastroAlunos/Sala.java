/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroAlunos;
import CadastroAlunos.Alunos;
import java.util.ArrayList;
/**
 *
 * @author jhona
 */
public class Sala {
    
    Alunos aluno;
    ArrayList<Alunos> lstAlunos;
    
    public Sala(){
        lstAlunos = new ArrayList<Alunos>();
    }
    
    public void inserirAluno(Alunos aluno){
        lstAlunos.add(aluno);
    }
    
    public void ListarTodos(){
        for(Alunos al:lstAlunos) {
            al.Listar();
            al.calcularNotas();
        }
    }
    
}
