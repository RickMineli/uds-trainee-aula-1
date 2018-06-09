import java.util.Scanner;

class Main {


    //Subtração do saldo na hora da compra, mais verificação
    //de saldo suficiente ou não
    public static Double calcularSaldo(Double saldo,Double gasto) {
        if (saldo < gasto){
            System.out.println("------------------------------");
            System.out.println("Você nâo tem saldo suficiente!");
            System.out.println("------------------------------");
            System.out.println();

            return saldo;
        }else {
            saldo = saldo - gasto;
            return saldo;
        }
    }
    public static Double mostrarCategorias1Carros(Double saldotemp) {
        Double saldo = saldotemp;
        int k;
        System.out.println("Carros");
        System.out.println("Seu saldo é de:" + saldo);
        System.out.println("[1]Fusca         500.00");
        System.out.println("[2]Honda Civic   200.00");
        System.out.println("[3]Nissan Versa  300.00");
        System.out.println("[4]Mustang 69    200.00");
        System.out.println("[5]Camaro 74     350.00");
        System.out.println("Digite o número do item que gostaria de comprar: ");
        Scanner entrada = new Scanner(System.in);
        k = entrada.nextInt();
        switch (k) {
            case 1:
                return calcularSaldo(saldo,500.00);
            case 2:
                return calcularSaldo(saldo,200.00);
            case 3:
                return calcularSaldo(saldo,300.00);
            case 4:
                return calcularSaldo(saldo,200.00);
            case 5:
                return calcularSaldo(saldo,350.00);
            default:
                return (999.00);
        }
    }
    public static Double mostrarCategorias2Sucos(Double saldotemp) {
        Double saldo = saldotemp;
        int k;
        System.out.println("Sucos");
        System.out.println("Seu saldo é de:" + saldo);
        System.out.println("[1]Suco de Uva      3.00");
        System.out.println("[2]Suco de Melancia 5.00");
        System.out.println("[3]Suco de Laranja  2.50");
        System.out.println("[4]Suco de Abacaxi  4.50");
        System.out.println("[5]Suco de Maracuja 3.50");
        System.out.println("Digite o número do item que gostaria de comprar: ");
        Scanner entrada = new Scanner(System.in);
        k = entrada.nextInt();
        switch (k) {
            case 1:
                return calcularSaldo(saldo,3.00);
            case 2:
                return calcularSaldo(saldo,5.00);
            case 3:
                return calcularSaldo(saldo,2.50);
            case 4:
                return calcularSaldo(saldo,4.50);
            case 5:
                return calcularSaldo(saldo,3.50);
            default:
                return (999.00);
        }
    }
    public static Double mostrarCategorias3Cafeinados(Double saldotemp) {
        Double saldo = saldotemp;
        int k;
        System.out.println("Cafeinados");
        System.out.println("Seu saldo é de:" + saldo);
        System.out.println("[1]Cafe           4.00");
        System.out.println("[2]Cappuccino     8.00");
        System.out.println("[3]Cafe ao Leite  5.00");
        System.out.println("[4]cafe Macchiato 8.50");
        System.out.println("[5]Cafe Ruim      1.00");
        System.out.println("Digite o número do item que gostaria de comprar: ");
        Scanner entrada = new Scanner(System.in);
        k = entrada.nextInt();
        switch (k) {
            case 1:
                return calcularSaldo(saldo,4.00);
            case 2:
                return calcularSaldo(saldo,8.00);
            case 3:
                return calcularSaldo(saldo,5.00);
            case 4:
                return calcularSaldo(saldo,8.50);
            case 5:
                return calcularSaldo(saldo,1.00);
            default:
                return (999.00);
        }
    }

    public static Double mostrarCategorias4Brinquedos(Double saldotemp) {
        Double saldo = saldotemp;
        int k;
        System.out.println("Brinquedos");
        System.out.println("Seu saldo é de:" + saldo);
        System.out.println("[1]Carrinho       15.00");
        System.out.println("[2]Macaco Pelucia 30.00");
        System.out.println("[3]Max Steel      22.00");
        System.out.println("[4]Urso Falante   50.00");
        System.out.println("[5]Peixe Que Nada 12.00");
        System.out.println("Digite o número do item que gostaria de comprar: ");
        Scanner entrada = new Scanner(System.in);
        k = entrada.nextInt();
        switch (k) {
            case 1:
                return calcularSaldo(saldo,15.00);
            case 2:
                return calcularSaldo(saldo,30.00);
            case 3:
                return calcularSaldo(saldo,22.00);
            case 4:
                return calcularSaldo(saldo,50.00);
            case 5:
                return calcularSaldo(saldo,12.00);
            default:
                return (999.00);
        }
    }
    public static Double mostrarCategorias5Consoles(Double saldotemp) {
        Double saldo = saldotemp;
        int k;
        System.out.println("Consoles");
        System.out.println("Seu saldo é de:" + saldo);
        System.out.println("[1]PS4              250.00");
        System.out.println("[2]XBOX ONE         200.00");
        System.out.println("[3]Nintendo Switch  100.00");
        System.out.println("[4]GBA              50.00");
        System.out.println("[5]Atari Jaguar     2.00");
        System.out.println("Digite o número do item que gostaria de comprar: ");
        Scanner entrada = new Scanner(System.in);
        k = entrada.nextInt();
        switch (k) {
            case 1:
                return calcularSaldo(saldo,250.00);
            case 2:
                return calcularSaldo(saldo,200.00);
            case 3:
                return calcularSaldo(saldo,100.00);
            case 4:
                return calcularSaldo(saldo,50.00);
            case 5:
                return calcularSaldo(saldo,2.00);
            default:
                return (999.00);
        }
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
            System.out.println("[2] Sucos");
            System.out.println("[3] Cafeinados");
            System.out.println("[4] Brinquedos");
            System.out.println("[5] Consoles");
            System.out.println("Digite o número da categoria que gostaria de acessar");
            System.out.println("Digite 0 para sair:");
            // System.out.println("Seu saldo é de:"+calcularSaldo(saldo,10.00));
            // saldo =calcularSaldo(saldo,10.00);
            Scanner entrada = new Scanner(System.in);
            k = entrada.nextInt();
            switch (k) {
                case 1:
                    saldo = mostrarCategorias1Carros(saldo);
                    break;
                case 2:
                    saldo = mostrarCategorias2Sucos(saldo);
                    break;
                case 3:
                    saldo = mostrarCategorias3Cafeinados(saldo);
                    break;
                case 4:
                    saldo = mostrarCategorias4Brinquedos(saldo);
                    break;
                case 5:
                    saldo = mostrarCategorias5Consoles(saldo);
                    break;
            }
        }


    }
}


