import java.util.Scanner;

class Calculadora {
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double diminuir(double num1, double num2) {
        return num1 > num2 ? num1 - num2 : num2 - num1;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return num1 / num2;
    }

    public double potenciacao(int num1, int num2) {
        return Math.pow(num1, num2);
    }
	
    public int fatorial(int num1) {
        int resultado = 1;
        for (int i = num1; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
}

class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora c1 = new Calculadora();
        int escolha;

        do {
            menu();
            escolha = scan.nextInt();

            double num1 = 0, num2 = 0;
            if (escolha >= 1 && escolha <= 5) {
                System.out.print("Informe o primeiro número: ");
                num1 = scan.nextDouble();
                System.out.print("Informe o segundo número: ");
                num2 = scan.nextDouble();
            } else if (escolha == 6) {
                System.out.print("Informe o número para calcular o fatorial: ");
                num1 = scan.nextInt();
            }

            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + c1.somar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + c1.diminuir(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + c1.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + c1.dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Resultado: " + c1.potenciacao((int)num1, (int)num2));
                    break;
                case 6:
                    System.out.println("Resultado: " + c1.fatorial((int)num1));
                    break;
                case 7:
                    System.out.println("Obrigado por usar a calculadora.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (escolha != 7);

        scan.close();
    }

    public static void menu() {
        System.out.println("Qual operação você deseja?\n" +
                           "1 - Soma\n" +
                           "2 - Subtração\n" +
                           "3 - Multiplicação\n" +
                           "4 - Divisão\n" +
                           "5 - Potenciação\n" +
                           "6 - Fatorial\n" +
                           "7 - Sair");
    }
}
