/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroAlunos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jhona
 */
public class Main {
    public static void main (String[] args){

        int op = 0;
        float nota;
        Scanner scan = new Scanner(System.in);
//        ArrayList<Alunos> listaDeAlunos = new ArrayList<Alunos>();
        Alunos aluno;
        Sala sala = new Sala();          
        do{
            System.out.println("Bem vindo ao sistema de Cadastro de Alunos\n");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Situacao");
            System.out.println("4 - Sair\n");
            op = scan.nextInt();
            scan.nextLine();

            switch(op){
                case 1:
                     
                System.out.println("Aluno: ");
                String nome = scan.nextLine();

                System.out.println("CPF: ");
                String cpf = scan.nextLine();
                
                System.out.println("Quantidade de notas: ");
                int qtd = scan.nextInt();
                
                aluno = new Alunos(nome, cpf, qtd);
                sala.inserirAluno(aluno);
                
                scan.nextLine();
                int pos2 = 0;
                pos2 = sala.lstAlunos.size() - 1;
                
                for(int i=0; i<=qtd-1;i++){
                    int j = i+1;
                    System.out.println("Nota: " + j);
                    nota = scan.nextFloat();
                    sala.lstAlunos.get(pos2).insereNota(nota,i);
                    
                }
                    break;
                case 2:
                    sala.ListarTodos();
                    break;
                case 3:
                    for(int i=0; i< sala.lstAlunos.size(); i++){
                        System.out.println("Aluno: " + sala.lstAlunos.get(i).nome);
                        
                        if(sala.lstAlunos.get(i).calcularNotas() <= 70){
                            System.out.println("REPROVADO\n");
                        }
                        else {
                            System.out.println("APROVADO\n");
                        }
                    }
                    break;     
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }while(op != 4);
    }
}
