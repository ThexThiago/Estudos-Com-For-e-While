// Atividade fazer a média de várias notas dos alunos, o programa só termina quando for digitado -1
// No final mostrar a média e a quantidade de notas que foram digitados

import java.util.Scanner;

public class WhileDesafio{

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double nota = 0;
        double soma = 0;
        int quantidade = 0;
        double media = 0;


        while(true){
            System.out.println("Digite a nota do aluno ou -1 para sair:");
            nota = scan.nextDouble();
            if (nota < -1 || nota > 10){
                System.out.println("Nota inválida, Digite novamente uma nota"
                +"válida entre 0 e 10 ou -1 para sair");
                continue;}
            
            if(nota == -1){
                break;}            
            else{
                soma += nota;
                quantidade++;
                media = soma / quantidade;
                System.out.println("A média das notas é: " + media);
                System.out.println("A quantidade de notas digitadas é:" + quantidade);
                System.out.println("A soma das notas é:" + soma);
                

            }
            
            
            
            
            
        }
    }
}