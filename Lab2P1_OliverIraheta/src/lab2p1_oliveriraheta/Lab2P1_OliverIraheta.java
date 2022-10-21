package lab2p1_oliveriraheta;

import java.util.Scanner;

public class Lab2P1_OliverIraheta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Opcion 1: Índice académico");
            System.out.println("Opcion 2: ¡OK Boomer!");
            System.out.println("Opcion 3: ¡Gotta Know Them All!");
            System.out.println("Ingrese Opcion(otro numero para salir) ");
            opc = in.nextInt();

            if (opc == 1) {
                System.out.println("Bienvenido a Indice Academico ");
                System.out.println("Usted debera de Ingresar dos numero enteros positivos ");
                System.out.println("Primer numero: ");
                int num1 = in.nextInt();
                System.out.println("Segundo numero: ");
                int num2 = in.nextInt();
                int may = 0;

                while (num1 <= 0 || num2 <= 0) {
                    System.out.println("Los numeros ingresados deben ser positivos");
                    System.out.println("Primer numero: ");
                    num1 = in.nextInt();
                    System.out.println("Segundo numero: ");
                    num2 = in.nextInt();
                }
                if (num1 == num2) {
                    System.out.println("(Sus numero son iguales -_-)El MCD es: " + num1);
                }

                while (num1 != num2) {
                    while (num1 > num2) {
                        num1 = num1 - num2;
                        if (num1 == num2) {
                            System.out.println("El MCD ES: " + num1);
                        }
                    }
                    while (num2 > num1) {
                        num2 = num2 - num1;
                        if (num1 == num2) {
                            System.out.println("El MCD es: " + num1);
                        }
                    }
                }

            } else if (opc == 2) {
                System.out.println("Bienvenido a ¡OK Boomer! ");
                System.out.println("Ingrese su año de nacimiento y le dire a que generacion pertenece ");
                int año = in.nextInt();
                if (año >= 1946 && año <= 1964) {
                    System.out.println("Usted es de la generacion: Baby Boomer Gen");
                } else if (año >= 1965 && año <= 1979) {
                    System.out.println("Usted es de la generacion: Generation X");
                } else if (año >= 1980 && año <= 1985) {
                    System.out.println("Usted es de la generacion: Xennials");
                } else if (año >= 1986 && año <= 1994) {
                    System.out.println("Usted es de la generacion: Millenials");
                } else if (año >= 1995 && año <= 2012) {
                    System.out.println("Usted es de la generacion: Gen Z");
                } else if (año >= 2013 && año <= 2025) {
                    System.out.println("Usted es de la generacion: Gen Alpha");
                } else {
                    System.out.println("Año no valido");
                }

            } else if (opc == 3) {
                System.out.println("Bienvenido a ¡Gotta Know Them All! ");
                System.out.println("Debera de ingresar dos pokemones(un atacante y un defensor) y  le dire que tan eficaz es su atacante contra su defensor");
                System.out.println("Pokemones: 1. fighting     2. Psychic     3. Steel     4. Fairy");
                System.out.println("Ingrese el numero de su Pokemon atacante");
                int atac = in.nextInt();
                System.out.println("Ingrese el numero de su Pokemon defensor");
                int def = in.nextInt();
                //todas las combinaciones que son neutrales
                if (atac == 1 && def == 1 || atac == 3 && def == 1 || atac == 2 && def == 4 || atac == 3 && def == 2 || atac == 4 && def == 2 || atac == 4 && def == 4) {
                    System.out.println("Su atacante es neutral contra su defensor");
                    //todas las combinaciones que son debiles
                } else if (atac == 1 && def == 2 || atac == 1 && def == 4 || atac == 2 && def == 2 || atac == 2 && def == 3 || atac == 3 && def == 3 || atac == 4 && def == 3) {
                    System.out.println("Su atacante es debil contra su defensor");
                    //todas las combinaciones que son super eficaz
                } else if (atac == 1 && def == 3 || atac == 2 && def == 1 || atac == 3 && def == 4 || atac == 4 && def == 1) {
                    System.out.println("Su atacante es Super Eficaz contra su defensor");
                } else {
                    System.out.println("Opcion no valida");
                }

            } else {
                System.out.println("Opcion no valida");
            }
        } while (opc >= 1 && opc <= 3);
    }
}
