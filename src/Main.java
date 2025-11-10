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
            case 11:
                ej11();
                break;
            case 12:
                ej12();
                break;
            case 13:
                ej13();
                break;
            case 14:
                ej14();
                break;
            case 15:
                ej15();
                break;
            case 16:
                ej16();
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
    System.out.println("11. Ejercicio 11");
    System.out.println("12. Ejercicio 12");
    System.out.println("13. Ejercicio 13");
    System.out.println("14. Ejercicio 14");
    System.out.println("15. Ejercicio 15");
    System.out.println("16. Ejercicio 16");


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
/*Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
pantalla su área y su perímetro. Implementa y utiliza las funciones:
 double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 double areaRectangulo(double ancho, double alto) // Devuelve el área*/

    System.out.println("Introduce ancho del rectangulo");
    double ancho = utils.validaDouble();
    System.out.println("Introduce el alto del rectangulo");
    double alto = utils.validaDouble();

    System.out.println("El perimetro del rectangulo es " + perimetroRectangulo(ancho,alto));
    System.out.println("El area del rectangulo es "+ areaRectangulo(ancho,alto));
}

public static double perimetroRectangulo(double ancho, double alto){
    double multiplica;

    multiplica= ancho * alto;

    return multiplica;
}

public static double areaRectangulo(double ancho, double alto){
    double area;

    area = 2*(ancho+alto);
    return area;
}

public static void ej8(){
/*Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa
y utiliza las funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
*/

    System.out.println("Introduce un valor entero");
    int n = utils.validaInt();

    System.out.println("Suma de 1 a n " + suma1an(n));
    System.out.println("Producto de 1 a n " + producto1an(n));
    System.out.println("Intermedio de 1 a n "+ intermedio1an(n));
}

public static int suma1an(int n) {
   int suma = 0;
    for (int i = 1; i <= n; i++) {
        suma += i;
    }
    return suma;

}

public static int producto1an(int n){
    int producto = 1;
    for (int i = 1; i <= n; i++) {
        producto *=i;
    }

    return producto;
}

public static double intermedio1an(int n){

    return (1 + n) / 2.0;

}

public static void ej9(){
/*Realiza un programa que pida introducir tres valores enteros y nos diga cuál de
ellos es el más elevado. Impleméntalo creando únicamente una función a la que
le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.*/



    System.out.println("Introduce numero 1");
    int a= utils.validaInt();
    System.out.println("Introduce numero 2");
    int b= utils.validaInt();
    System.out.println("Introduce numero 3");
    int c= utils.validaInt();


    System.out.println("El numero mayor es : "+ mayor3(a,b,c));
    System.out.println("El numero mayor es : "+ mayor2(a,b));
}

public static int mayor3(int a, int b, int c){
    if ( a > b){
        return a;
    }else if (b > c){
        return b;
    }else {
        return c;
    }

}

public static int mayor2(int a,int b){
    if (a > b){
        return a;
    }else{
        return b;
    }
}

public static void ej10(){
/*Realiza un programa que lea una fecha introduciendo el día, mes y año por
separado y nos diga si la fecha es correcta o no. Supondremos que todos los
meses tienen 30 días. Se debe crear una función donde le pasemos los datos y
devuelva si es correcta o no.*/

    System.out.print("Introduzca una fecha");
    System.out.println("Introduzca el día (Max 30)");
    int dia = utils.validaInt();
    System.out.println("Introduzca el mes (Por ejemplo Junio = 6)");
    int mes = utils.validaInt();
    System.out.println("Introduzca el año");
    int año = utils.validaInt();

    if (fecha(dia,mes,año)){
        System.out.println("La fecha "+ dia + "-" + mes +"-"+año+". Es correcta");
    }else {
        System.out.println("Fecha incorrecta");
    }

}

public static boolean fecha(int a, int b, int c) {
    if (a < 1 || a > 30 || b < 1 || b > 12 || c < 1900 || c > 2025) {
        return false;
    }
    return true;
}
public static void ej11(){
/*11. Realiza un programa que escriba la tabla de multiplicar de un número
introducido por teclado. Para ello implementa una función que reciba como
parámetro un número entero y muestre por pantalla la tabla de multiplicar de
dicho número.*/

    System.out.println("Introduce un numero");
    int n1 = utils.validaInt();

    multiplicar(n1);


}

public static void multiplicar(int a){

    for (int i = 1; i <= 10; i++) {
        System.out.println(a + "x" + i + "=" +(a * i));
    }

}

public static void ej12(){
/* Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
programa debe tener una función que reciba como parámetro una cantidad en
kilómetros y nos la devuelva en millas.
*/
    System.out.println("Introduce cantidad de KM");
    double km = utils.validaDouble();

    System.out.println(km + "KM = "+ millas(km)+" millas" );

}

public static double millas(double a){
    double millas = a * 1.60934;

    return millas;
}

public static void ej13(){
        }

public static void ej14(){

}

public static void ej15(){

}

public static void ej16(){

}
