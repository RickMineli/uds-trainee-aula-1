import java.util.Scanner;

class Main {



    public static Double calcularSaldo(Double saldo,Double gasto){
        saldo=saldo-gasto;
        return saldo;

    }
    public static Double mostrarCategorias1(Double saldotemp) {
        Double saldo = saldotemp;
        int k;
        System.out.println("Carros");
        System.out.println("[1]Fusca         10.00");
        System.out.println("[2]Honda Civic   20.00");
        System.out.println("[3]Nissan Versa  30.00");
        System.out.println("[4]Mustang 69    20.00");
        System.out.println("[5]Camaro 74     35.00");
        System.out.println("Digite o número do item que gostaria de comprar: ");
        Scanner entrada = new Scanner(System.in);
        k = entrada.nextInt();
        switch (k) {
            case 1:
                return calcularSaldo(saldo,10.00);


        }

        return (0.00);
    }

    public static void main(String[] args) {

        //Variaveis
        int k= 999;
        Double saldo = 1500.00;
        while(k != 0){
            System.out.println("Sistema de compras!!!");
            System.out.println("Seu saldo é de:" + saldo);
            System.out.println("Categorias");
            System.out.println("[1] Carros ");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[4]");
            System.out.println("[5]");
            System.out.println("Digite o número da categoria que gostaria de acessar");
            System.out.println("Digite 0 para sair:");
            // System.out.println("Seu saldo é de:"+calcularSaldo(saldo,10.00));
            // saldo =calcularSaldo(saldo,10.00);
            Scanner entrada = new Scanner(System.in);
            k = entrada.nextInt();
            switch (k) {
                case 1:
                    saldo = mostrarCategorias1(saldo);
                    break;

            }
        }


    }
    }


