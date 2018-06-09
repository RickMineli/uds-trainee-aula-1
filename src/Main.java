import java.util.Scanner;

class Main {
   //verificarTamanhoInteger
    public static Integer verificarTamanhoInteger(Integer i){
        int length = String.valueOf(i).length();
        return length;
    }






    //convertorDeNumerosParaRomanos
    public static String convertorDNR(Integer i) {
        int length = String.valueOf(i).length();
        String numeroRomanos ="";
        if(length == 1) {
            switch (i) {
                case 1:
                    return ("I");
                case 2:
                    return ("II");
                case 3:
                    return ("III");
                case 4:
                    return ("IV");
                case 5:
                    return ("V");
                case 6:
                    return ("VI");
                case 7:
                    return ("VII");
                case 8:
                    return ("VIII");
                case 9:
                    return ("IX");
                case 10:
                    return ("X");
                default:
                    return ("Erro");
            }
        }else {
            switch (i) {
                case 1:
                    numeroRomanos=("X");
                case 2:
                    numeroRomanos=("XX");
                case 3:
                    numeroRomanos=("XXX");
                case 4:
                    numeroRomanos=("XL");
                case 5:
                    numeroRomanos= ("L");
                case 6:
                    numeroRomanos=("LX");
                case 7:
                    numeroRomanos=("LXX");
                case 8:
                    numeroRomanos=("LXXX");
                case 9:
                    numeroRomanos=("XC");

            }
            switch (i + 1) {
                case 1:
                    numeroRomanos= (numeroRomanos +"I");
                case 2:
                    numeroRomanos= (numeroRomanos +"II");
                case 3:
                    numeroRomanos= (numeroRomanos +"III");
                case 4:
                    numeroRomanos= (numeroRomanos +"IV");
                case 5:
                    numeroRomanos= (numeroRomanos +"V");
                case 6:
                    numeroRomanos= (numeroRomanos +"VI");
                case 7:
                    numeroRomanos= (numeroRomanos +"VII");
                case 8:
                    numeroRomanos= (numeroRomanos +"VIII");
                case 9:
                    numeroRomanos= (numeroRomanos +"IX");
                case 10:
                    numeroRomanos= (numeroRomanos +"X");

                }
            return numeroRomanos;
            }
    }




    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);

        Integer i1 = 165;

            System.out.println("Informe um valor de 1 até 10: ");
            i1 = entrada.nextInt();


        System.out.println("ndjaofkemc,vpofjfh");




        //convertorDeNumerosParaRomanos
        String numeroRomano = convertorDNR(i1);
        System.out.println("Em romano: "+numeroRomano);


    }

}
