
package ProjetoSemana6;
import java.util.Scanner;   
    
public class Principal {

    
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        System.out.println("Olá! Você possui estas opções:");
        int opcao;
        float fahrenheit;
        float celsius;
        float cotacaoDolar;
        float real;
        float dolar;
        {
            System.out.println(" [1] Para converter Celcius para Fahrrenheit");
            System.out.println(" [2] Para converter Fahrrenheit para Celcius");
            System.out.println(" [3] Para converter real para dólar");
            System.out.println(" [4] Para converter dólar para real");
            System.out.println(" [5] Para sair do aplicativo");
            System.out.println("Digite a sua opção desejada:");
            opcao = leitor.nextInt();
            if (opcao == 1); {
                System.out.println("Digite a temperatura em Celcius que deseja converter:");
                celsius = leitor.nextFloat();
                fahrenheit = (float) ((celsius * 1.8) + 32);
                System.out.println("A temperatura é de " + fahrenheit + "º Fahrrenheit");
            } if (opcao == 2); {
                System.out.println("Digite a temperatura em Fahrrenheit que deseja converter:");
                fahrenheit = leitor.nextFloat();
                celsius = (float) ((fahrenheit - 32) / 1.8);
                System.out.println("A temperatura é de " + celsius + "º Celcius");
            } if (opcao == 3); {
                System.out.println("Informe a cotação do dólar:");
                cotacaoDolar = leitor.nextFloat();
                System.out.println("Informe o valor em reais que deseja converter:");
                real = leitor.nextFloat();
                dolar = real / cotacaoDolar;
                System.out.println("O valor informado, equivale à: " + dolar + "USD");
            } if (opcao == 4); {
                System.out.println("Informe a cotação do dólar:");
                cotacaoDolar = leitor.nextFloat();
                System.out.println("Informe o valor em Dólar que deseja converter:");
                dolar = leitor.nextFloat();
                real = dolar * cotacaoDolar;
                System.out.println("O valor informado, equivale à::R$ " + real);
            } else if(opcao == 5);{
                System.out.println("Obrigada pela sua participação!");
                System.exit(0);
            }
            }
 } while (opcao >= 1 || opcao < 5);
        If (opcao == 5){
        System.out.prinln(“ Obrigada pela sua participação!);
    }
        System.exit(0);
           }
    }
