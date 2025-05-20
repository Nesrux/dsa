package pilhas_filas.desafios;

/*
 * Problema "sandwich" (leetcode number-student ubable to eat lunch)
 * 
 * Uma fila de N alunos aguarda para comer N sadubas disponiveis
 * cada sanduba é representado por 0 ou 1, indicando se o sanduiche é
 * redondo ou quadrado respectivamente.
 * 
 * A dinâmica da fila de alunos funciona assim: o primeiro aluno da fila
 * observa o primeiro sanduíche disponivel, se o sanduiche for do tipo
 * que o aluno quer comer, o aluno pega o sanduiche e sai da fila, caso
 * o contrário o aluno vai para o final da fila.
 * 
 * o processo se repete até quando todos os sanduíches forem pegos, 
 * ou até que a fila de alunos for toda percorrida e nenhum aluno
 * quis pegar o primeiro sanduíche disponive.
 * 
 * Faça uma função que receba dois vetores representando a sequencia 
 * de alunos e a sequencia de sanduiches disponiveis, a função deve 
 * retornar  quantos alunos sobraram na fila sem pegar seu sanduíche
 */
//Não feito por mim, refazer posteriormente.
public class Sandwich {

    public static void main(String[] args) {

    }

   public int countStudents(int[] students, int[] sandwiches) {
        int ones = 0; 
        int zeros = 0; 
		
        for(int stud : students){
            if(stud == 0) zeros++;
            else ones++;
        }
        
      
        for(int sandwich : sandwiches){
            if(sandwich == 0){  
                if(zeros == 0){ 
                    return ones;
                }
                zeros--;
            }
            else{ 
                if(ones == 0){  
                    return zeros;
                }
                ones--;
            }
        }
        return 0;
    }
}
