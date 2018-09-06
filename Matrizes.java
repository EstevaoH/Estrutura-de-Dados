public class Matriz {

    public static void main(String[] args) {

        System.out.println("1 - ADIÇÃO DE MATRIZES");
        System.out.println("2 - MULTIPLIÇÃO DE MATRIZES ");
        System.out.println("3 - SUBTRAÇÃO DE MATRIZES");
        Scanner opcao = new Scanner(System.in);
        System.out.println("Digite a opção de operação: ");
        int op = opcao.nextInt();
        
        //Dados da primeira matriz
        Scanner entrada = new Scanner(System.in);
        System.out.println("Linhas da 1ª Matriz: ");
        int linhas = entrada.nextInt();
        System.out.println("Colunas da 1ª Matriz");
        int colunas = entrada.nextInt();
        
        // Dados da segunda matriz
        System.out.println("Linhas da 2ª Matriz: ");
        int linhas2 = entrada.nextInt();
        System.out.println("Colunas da 2ª Matriz");
        int colunas2 = entrada.nextInt();

        int A[][] = new int[linhas][colunas];
        int B[][] = new int[linhas2][colunas2];
        int C[][] = new int[linhas][colunas];

        if (op == 1) {//Soma

            if (linhas != linhas2 || colunas != colunas2) {
                System.out.println("Não é possivel fazer a soma");
                System.exit(1);
            }
            System.out.println("MATRIZ A");

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.printf("A[%d][%d]: ", i + 1, j + 1);
                    A[i][j] = entrada.nextInt();
                }
            }

            System.out.println("MATRIZ B");

            for (int i = 0; i < linhas2; i++) {
                for (int j = 0; j < colunas2; j++) {
                    System.out.printf("B[%d][%d]:", i + 1, j + 1);
                    B[i][j] = entrada.nextInt();
                }
            }

            System.out.println("SOMA DA MATRIZ A + B = C ");

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                    System.out.printf("%d\t", C[i][j]);
                }
                System.out.printf("\n");
            }
        }

 
        if (op == 2) {//Multiplicação
            System.out.println("Multiplicação");

            System.out.println("MATRIZ A");

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.printf("A[%d][%d]: ", i + 1, j + 1);
                    A[i][j] = entrada.nextInt();
                }
            }

            System.out.println("MATRIZ B");

            for (int i = 0; i < linhas2; i++) {
                for (int j = 0; j < colunas2; j++) {
                    System.out.printf("B[%d][%d]:", i + 1, j + 1);
                    B[i][j] = entrada.nextInt();
                }
            }

            System.out.println("O PRODUTO DA MULTIPLICAÇÃO");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas2; j++) {
                    for (int x = 0; x < colunas; x++) {
                        C[i][j] += A[i][x] * B[x][j];
                    }
                    System.out.printf("%d\t", C[i][j]);
                }
                System.out.print("\n");
            }
        }

        if (op == 3) {//Subtração
            if (linhas != linhas2 || colunas != colunas2) {
                System.out.println("Não é possivel fazer a subtração");
                System.exit(1);
            }
            System.out.println("MATRIZ A");

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.printf("A[%d][%d]: ", i + 1, j + 1);
                    A[i][j] = entrada.nextInt();
                }
            }

            System.out.println("MATRIZ B");

            for (int i = 0; i < linhas2; i++) {
                for (int j = 0; j < colunas2; j++) {
                    System.out.printf("B[%d][%d]:", i + 1, j + 1);
                    B[i][j] = entrada.nextInt();
                }
            }

            System.out.println("SUBTRAÇÃO DA MATRIZ A - B = C ");

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                    System.out.printf("%d\t", C[i][j]);
                }
                System.out.printf("\n");
            }
        }
