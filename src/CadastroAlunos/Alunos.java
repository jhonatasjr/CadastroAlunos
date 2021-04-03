/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroAlunos;

/**
 *
 * @author jhona
 */
public class Alunos {
    
    String nome;
    private String cpf;
    private int qtd;
    private float nota[];
    
    public Alunos(String nome, String cpf, int qtd) {
        this.nome = nome;
        this.cpf = cpf;
        this.nota = new float[qtd];
    }
    
    public Alunos(String nome) {
	System.out.println(this.nome);
    }
    
    public void posicoes() {
        for(int i=0; i<nota.length;i++){
            System.out.println("Passou aqui");
        }
    }
    
    public void Listar(){
     System.out.println("Aluno: " + this.nome+"\nCPF: " + this.cpf);
     for(int i=0; i<nota.length;i++){
         int j=i+1;
         System.out.println("Nota " + j + ": " + nota[i]);
     }
    }
    
    public void setNome(String nome){
       this.nome = nome;
    }
    public String getNome(){
        return nome;
    }  
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public String getCPF(){
        return cpf;
    }
    
    public int getQtd(){
        return qtd;
    }
    
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    
    public float[] getnota(){
        return nota;
    }
    
    public void setNota(float[] nota){
        this.nota = nota;
    }
    
    public void insereNota(float nota, int pos){
        this.nota[pos] = nota;
    }
    
    public float calcularNotas() {
        float soma = 0;
        
        for(int i=0; i<nota.length;i++) {
            soma += nota[i];
        }
        System.out.println("Total: " + soma);
        return soma;
    }
}
