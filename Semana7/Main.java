
package ProjetoSemana7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Empregado EmpregadoUm = new Empregado();        
        Scanner leitor = new Scanner(System.in);
      
        System.out.println("Informe o seu nome.");
        EmpregadoUm.setNome(leitor.nextLine());
        System.out.println("Informe o seu sobrenome.");
        EmpregadoUm.setSobrenome(leitor.nextLine());
        System.out.println("Informe o seu salário.");
        EmpregadoUm.setSalario(leitor.nextFloat());

        
        
    }
    }
