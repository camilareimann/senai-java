import java.util.Scanner;

public class Trello05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Apresentar as opções para o usuário
        System.out.println("Escolha a categoria:");
        System.out.println("1. Comprimento");
        System.out.println("2. Peso");
        System.out.print("Opção: ");
        int categoria = scanner.nextInt();

        // Verificar a categoria escolhida e apresentar as opções de unidades correspondentes
        switch (categoria) {
            case 1: // Comprimento
                System.out.println("\nEscolha a unidade de origem:");
                System.out.println("1. Metros");
                System.out.println("2. Centímetros");
                System.out.println("3. Polegadas");
                break;
            case 2: // Peso
                System.out.println("\nEscolha a unidade de origem:");
                System.out.println("1. Quilogramas");
                System.out.println("2. Gramas");
                System.out.println("3. Libras");
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.print("Opção: ");
        int unidadeOrigem = scanner.nextInt();

        // Verificar a unidade de origem escolhida e apresentar as opções de unidades de destino correspondentes
        switch (unidadeOrigem) {
            case 1: // Metros ou Quilogramas
                if (categoria == 1) {
                    System.out.println("\nEscolha a unidade de destino:");
                    System.out.println("1. Metros");
                    System.out.println("2. Centímetros");
                    System.out.println("3. Polegadas");
                } else {
                    System.out.println("\nEscolha a unidade de destino:");
                    System.out.println("1. Quilogramas");
                    System.out.println("2. Gramas");
                    System.out.println("3. Libras");
                }
                break;
            case 2: // Centímetros ou Gramas
                if (categoria == 1) {
                    System.out.println("\nEscolha a unidade de destino:");
                    System.out.println("1. Metros");
                    System.out.println("2. Centímetros");
                    System.out.println("3. Polegadas");
                } else {
                    System.out.println("\nEscolha a unidade de destino:");
                    System.out.println("1. Quilogramas");
                    System.out.println("2. Gramas");
                    System.out.println("3. Libras");
                }
                break;
            case 3: // Polegadas ou Libras
                if (categoria == 1) {
                    System.out.println("\nEscolha a unidade de destino:");
                    System.out.println("1. Metros");
                    System.out.println("2. Centímetros");
                    System.out.println("3. Polegadas");
                } else {
                    System.out.println("\nEscolha a unidade de destino:");
                    System.out.println("1. Quilogramas");
                    System.out.println("2. Gramas");
                    System.out.println("3. Libras");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.print("Opção: ");
        int unidadeDestino = scanner.nextInt();

        // Capturar o valor a ser convertido
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        // Realizar a conversão com base nas unidades de origem e destino escolhidas
        double resultado = 0;
        switch (categoria) {
            case 1: // Comprimento
                switch (unidadeOrigem) {
                    case 1: // Metros
                        switch (unidadeDestino) {
                            case 1: // Metros
                                resultado = valor;
                                break;
                            case 2: // Centímetros
                                resultado = valor * 100;
                                break;
                            case 3: // Polegadas
                                resultado = valor * 39.37;
                                break;
                        }
                        break;
                    case 2: // Centímetros
                        switch (unidadeDestino) {
                            case 1: // Metros
                                resultado = valor / 100;
                                break;
                            case 2: // Centímetros
                                resultado = valor;
                                break;
                            case 3: // Polegadas
                                resultado = valor / 2.54;
                                break;
                        }
                        break;
                    case 3: // Polegadas
                        switch (unidadeDestino) {
                            case 1: // Metros
                                resultado = valor * 0.0254;
                                break;
                            case 2: // Centímetros
                                resultado = valor * 2.54;
                                break;
                            case 3: // Polegadas
                                resultado = valor;
                                break;
                        }
                        break;
                }
                break;
            case 2: // Peso
                switch (unidadeOrigem) {
                    case 1: // Quilogramas
                        switch (unidadeDestino) {
                            case 1: // Quilogramas
                                resultado = valor;
                                break;
                            case 2: // Gramas
                                resultado = valor * 1000;
                                break;
                            case 3: // Libras
                                resultado = valor * 2.20462;
                                break;
                        }
                        break;
                    case 2: // Gramas
                        switch (unidadeDestino) {
                            case 1: // Quilogramas
                                resultado = valor / 1000;
                                break;
                            case 2: // Gramas
                                resultado = valor;
                                break;
                            case 3: // Libras
                                resultado = valor * 0.00220462;
                                break;
                        }
                        break;
                    case 3: // Libras
                        switch (unidadeDestino) {
                            case 1: // Quilogramas
                                resultado = valor * 0.453592;
                                break;
                            case 2: // Gramas
                                resultado = valor * 453.592;
                                break;
                            case 3: // Libras
                                resultado = valor;
                                break;
                        }
                        break;
                }
                break;
        }

        // Exibir o resultado da conversão
        System.out.println("Resultado da conversão: " + valor + " " + obterUnidade(categoria, unidadeOrigem) + " = " + resultado + " " + obterUnidade(categoria, unidadeDestino));

        scanner.close();
    }

    private static String obterUnidade(int categoria, int opcao) {
        if (categoria == 1) { // Comprimento
            switch (opcao) {
                case 1:
                    return "metros";
                case 2:
                    return "centímetros";
                case 3:
                    return "polegadas";
            }
        }
        return "";
    }
}