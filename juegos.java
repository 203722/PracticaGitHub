import java.util.Scanner;

class juegos {
    static Scanner sc = new Scanner(System.in);
    static int suma;

    public static void main(String args[]) {
        System.out.println("bienbenido al juego del Dado para continuar presione 1 para cerrar presione 2");
        int dec;
        dec = sc.nextInt();
        if (dec > 0 & dec < 2) {
            lanzamiento var= new lanzamiento();
            var.setDado1((int)(Math.random()*6)+1);
            var.setDado2((int)(Math.random()*6)+1);
            suma = var.getDado1()+var.getDado2();
            System.out.println("lanzando dados...");
            System.out.println("El resultado es: "+var.getDado1()+" y "+var.getDado2());
            System.out.println("la suma de los dados es "+suma);
            juegos llamar=new juegos();
            llamar.fin_juego();
        }
    }
    public void fin_juego() {
    switch (suma) {
        case 1:
        System.out.println("ola");
        break;
        case 2:
        System.out.println("perdiste");
        System.out.println("desea repetir el juego? 1 para no 2 para si");
        break;
        case 3:
        System.out.println("perdiste");
        System.out.println("desea repetir el juego? 1 para no 2 para si");
        break;
        case 4:
        System.out.println("desea volver a tirar? 1 para no 2 para si");
        break;
        case 5:
        System.out.println("desea volver a tirar? 1 para no 2 para si");
        break;
        case 6:
        System.out.println("desea volver a tirar? 1 para no 2 para si");
        break;
        case 7:
        System.out.println("ganaste");
        System.out.println("desea repetir el juego? 1 para no 2 para si");
        break;
        case 8:
        System.out.println("desea volver a tirar? 1 para no 2 para si");
        break;
        case 9:
        System.out.println("desea volver a tirar? 1 para no 2 para si");
        break;
        case 10:
        System.out.println("desea volver a tirar? 1 para no 2 para si");
        break;
        case 11:
        System.out.println("ganaste");
        System.out.println("desea repetir el juego? 1 para no 2 para si");
        break;
        case 12:
        System.out.println("perdiste");
        System.out.println("desea repetir el juego? 1 para no 2 para si");
        break;
        }
    }
}