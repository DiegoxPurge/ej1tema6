import java.util.Scanner;

static Scanner sc;

public static void main(String[] args){
    int opcion;
    utils.sc = new Scanner(System.in);

    do {
        menu();
        opcion = utils.validaInt();
        switch (opcion){
            case 1: //EJ 1
                ej1();
                break;
            case 2: // EJ 2
                ej2();
                break;
            case 3: // EJ 3
                ej3();
                break;
            case 4: // EJ 4
                ej4();
                break;
            case 5: //EJ 5
                ej5();
                break;
            case 6:
                ej6();
                break;
            case 7:
                ej7();
                break;
            case 8:
                ej8();
                break;
            case 9:
                ej9();
                break;
            case 10:
                ej10();
                break;
            default: // en otro caso
                System.out.println("ERROR! opcion incorrecta");
        }
    }while (opcion!=9);
}
public static void menu(){
    System.out.println("Que quieres hacer?");
    System.out.println("1. Ejercicio 1");
    System.out.println("2. Ejercicio 2");
    System.out.println("3. Ejercicio 3");
    System.out.println("4. Ejercicio 4");
    System.out.println("5. Ejercicio 5");
    System.out.println("6. Ejercicio 6");
    System.out.println("7. Ejercicio 7");
    System.out.println("8. Ejercicio 8");
    System.out.println("9. Ejercicio 9");
    System.out.println("10. Ejercicio 10");


    System.out.print("Introduce opcion valida");


}


public static void ej1(){
    /*Escribe un programa que pida dos números reales por teclado y muestre por
pantalla el resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números*/
    int n1,n2;


    System.out.println("Introduce un numero");
    n1 = utils.validaInt();
    System.out.println("Introduce un numero");
    n2 = utils.validaInt();

    System.out.println("Multiplicacion" + multiplica(n1,n2));


}

public static double multiplica(int a, int b){
    int resultado = a * b;
    return resultado;
}


public static void ej2(){
    /*Escribe un programa que pida la edad por teclado y muestre por pantalla si eres
    mayor de edad o no. Implementa y utiliza la función:
    boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
*/

    int edad1;

    System.out.println("Introduce una edad");
    edad1= utils.validaInt();

    if (esMayorEdad(edad1)==true){
        System.out.println("Edad: "+ edad1 + ", es mayor de edad");
    }else{
        System.out.println("Edad:  "+ edad1 + ", es menor de edad");
    }


}

public static boolean esMayorEdad (int a){
    boolean esMayorEdad = false;

    if (a>=18){
        esMayorEdad = true;
    }
    return esMayorEdad;
}
public static void ej3(){
   /* Escribe un programa que pida dos números enteros por teclado y muestre por
    pantalla cual es el mínimo. Implementa y utiliza la función:
    int minimo(int a, int b) // Devuelve el menor entre a y b*/

    int a, b;
    System.out.println("Introduce un numero");
    a = utils.validaInt();
    System.out.println("Introduce un numero");
    b = utils.validaInt();


    System.out.println("El numero menor es "+minimo(a,b));


}

public static int minimo(int a ,int b) {

    if (a<b){
        return a;
    }else {
        return b;
    }

}
public static void ej4(){
    /*Escribe un programa que pida un número entero por teclado y muestre por
    pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
    int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo*/

    int a;



    System.out.println("Introduce un numero");
    a = utils.validaInt();


    System.out.println("El numero es : "+dimeSigno(a));
}

public static int dimeSigno(int a){
    if (a > 0){
        a=1;
    }
    if (a<0) {
        a=-1;
    }
    if (a==0){
        a=0;
    }
    return a;
}


public static void ej5(){
/*Escribe un programa que pida un valor entero en millas y muestre su equivalente
en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y
utiliza la función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
*/

    int a;

    System.out.println("Escribe un valor en millas");
    a = utils.validaInt();


    System.out.println(a + " millas en km son : "+ millas_a_kilometros(a)+" km");
}

public static double millas_a_kilometros(int millas){


    double totalkm = millas * 1.60934;


    return totalkm;
}

public static void ej6(){
/*. Escribe un programa que pida cinco precios y muestre por pantalla el precio de
venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA*/
    int n1;

    for (int i = 0; i < 5; i++) {
        System.out.println("Introduce el precio sin iva del producto "+(i+1));
        n1 = utils.validaInt();


        System.out.println("Precio total " + n1 + " mas el 21% IVA es de "+ precioConIVA(n1));
    }


}
public static double precioConIVA(double precio){




    double a = precio * 1.21;


    return a;
}

public static void ej7(){

}

public static void ej8(){

}

public static void ej9(){

}

public static void ej10(){

}

