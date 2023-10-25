package com.liceolapaz.des.sfr;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            //Escribir menú
            escribirMenu();
            //Escribir la opción y guardarla
            int opcion= guardarOpcion();
            //Escoger opción
            escogerOpcion(opcion);
        } while (true);
    }

    private static void escogerOpcion(int opcion) {
        switch (opcion) {
            case 0:
            //Salir del menú
                System.exit(0);
                break;
            case 1:
            //Establecer área del triángulo
                    //Base:
                    System.out.println("Escriba la base del triángulo: ");
                        //Guardar número introducido (base)
                        double baseTriangulo= baseTriangulo();
                    //Altura:
                    System.out.println("Escriba la altura del triángulo: ");
                        //Guardar número introducido (altura)
                        double alturaTriangulo= alturaTriangulo();
                    //Hacer la operación
                    double resultado1;
                    resultado1 = (baseTriangulo * alturaTriangulo )/2;
            //Establecer perimetro del triángulo
                    //Lado 1
                    System.out.println("Escriba el  valor del 1º lado ");
                        //Guardar lado 1
                        double lado1= ladoTriangulo1();
                    //Lado 2
                    System.out.println("Escriba el valor del 2º lado ");
                        //Guardar lado 2
                        double lado1_2= ladoTriangulo2();
                    //Lado 3
                    System.out.println("Escriba el valor del 3ºlado ");
                        //Guardar lado 3
                        double lado1_3= ladoTriangulo3();
                    //Hacer la operación
                    double resultado2;
                    resultado2 = lado1 + lado1_2 + lado1_3;
            //Escribir los dos resultados
            System.out.println("El área del triangulo es " + resultado1 + " y el perimetro es " + resultado2);
            case 2:
            //Establecer área del rectángulo
                //Base
                System.out.println("Escriba la base del rectángulo: ");
                    //Guardar número introducido (base)
                    double baseRectangulo= baseRectangulo();
                //Altura
                System.out.println("Escriba la altura del rectángulo: ");
                    //Guardar número introducido (altura)
                    double alturaRectangulo= alturaRectangulo();
                //Hacer la operación
                double resultado3;
                resultado3 = baseRectangulo * alturaRectangulo;
            //Establecer perimetro del rectángulo
                //Lado 1
                System.out.println("Escriba el valor del 1º lado ");
                    //Guardar lado 1
                    double lado2_1= ladoRectangulo1();
                //Lado 2
                System.out.println("Escriba el valor del 2º lado ");
                    //Guardar lado 2
                    double lado2_2= ladoRectangulo2();
                //Lado 3
                System.out.println("Escriba el valor del 3º lado ");
                    //Guardar lado 3
                    double lado2_3= ladoRectangulo3();
                //Lado 4
                System.out.println("Escriba el valor del 4º lado ");
                    //Guardar lado 4
                    double lado2_4= ladoRectangulo4();
                //Hacer la operación
                double resultado4;
                resultado4= lado2_1 + lado2_2 + lado2_3 + lado2_4;
            //Escribir los dos resultados
            System.out.println("El área del rectángulo es "+ resultado3 + " y el perimetro es " + resultado4);
            case 3:
            //Establecer área del cuadrado
                //Lado 1
                System.out.println("Escriba el valor del 1º lado ");
                    //Guardar número introducido (área)
                    double ladoAreaCuadrado1= areaCuadrado1();
                //Lado 2
                System.out.println("Escriba el valor del 2º lado");
                    //Guardar número introducido (área)
                    double ladoAreaCuadrado2= areaCuadrado2();
                //Hacer la operación
                double resultado5;
                resultado5= ladoAreaCuadrado1 * ladoAreaCuadrado2;
            //Establecer perimetro del cuadrado
                //Lado 1
                System.out.println("Escriba el valor del 1º lado ");
                //Guardar lado 1
                double lado3_1= ladoCuadrado1();
                //Lado 2
                System.out.println("Escriba el valor del 2º lado ");
                //Guardar lado 2
                double lado3_2= ladoCuadrado2();
                //Lado 3
                System.out.println("Escriba el valor del 3º lado ");
                //Guardar lado 3
                double lado3_3= ladoCuadrado3();
                //Lado 4
                System.out.println("Escriba el valor del 4º lado ");
                //Guardar lado 4
                double lado3_4= ladoCuadrado4();
                //Hacer la operación
                double resultado6;
                resultado6= lado3_1 + lado3_2 + lado3_3 + lado3_4;
            //Escribir los dos resultados
            System.out.println("El área del cuadrado es "+ resultado5 + " y el perimetro es " + resultado6);
            case 4:
            //Establecer perimetro del pentágono
                //Lado 1
                System.out.println("Escriba el valor del 1º lado ");
                //Guardar lado 1
                double lado4_1= ladoPentagono1();
                //Lado 2
                System.out.println("Escriba el valor del 2º lado ");
                //Guardar lado 2
                double lado4_2= ladoPentagono2();
                //Lado 3
                System.out.println("Escriba el valor del 3º lado ");
                //Guardar lado 3
                double lado4_3= ladoPentagono3();
                //Lado 4
                System.out.println("Escriba el valor del 4º lado ");
                //Guardar lado 4
                double lado4_4= ladoPentagono4();
                //Lado 5
                System.out.println("Escriba el valor del 5º lado ");
                //Guardar lado 5
                double lado4_5= ladoPentagono5();
                //Hacer la operación
                double resultado7;
                resultado7= lado4_1 + lado4_2 + lado4_3 + lado4_4;
            //Establecer área del pentágono
                //Apotema
                System.out.println("Escriba el valor de la apotema: ");
                double apotema= apotemaPentagono();
                //Perimetro ya hecho antes (arriba)
                //Hacer la operación
                double resultado8;
                resultado8= (resultado7 * apotema) /2;
            //Mostrar los dos resultados
            System.out.println("El área del pentágono es: " + resultado8 + " y el perimetro es: " + resultado7);
        }
    }



    private static double apotemaPentagono() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoPentagono5() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoPentagono4() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoPentagono3() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoPentagono2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoPentagono1() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoCuadrado4() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoCuadrado3() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoCuadrado2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoCuadrado1() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double areaCuadrado2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double areaCuadrado1() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoRectangulo4() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoRectangulo3() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoRectangulo2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoRectangulo1() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double alturaRectangulo() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double baseRectangulo() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoTriangulo3() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoTriangulo2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double ladoTriangulo1() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }


    private static double alturaTriangulo() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double baseTriangulo() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static int guardarOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }


    private static void escribirMenu() {
        System.out.println
                ("FIGURAS GEOMÉTRICAS\n" +
                "1.Triángulo\n" +
                "2.Rectángulo\n" +
                "3.Cuadrado\n" +
                "4.Pentágono\n" +
                "0.Salir\n"+
                "Elija una  opción: ");
    }
}
