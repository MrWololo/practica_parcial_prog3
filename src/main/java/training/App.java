package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                ////////////////////////////////////////////////////////////////////////

                System.out.println("Ingredientes creados: ");
                Ingrediente lupulo = new Ingrediente("lupulo", "gramo de lupulo", 3);
                System.out.println(lupulo.toString());
                Ingrediente cebada = new Ingrediente("cebada", "gramo de cebada", 1);
                System.out.println(cebada.toString());
                Ingrediente levadura = new Ingrediente("levadura", "gramo de levadura", 2);
                System.out.println(levadura.toString());
                Ingrediente agua = new Ingrediente("agua", "litro de agua", 50);
                System.out.println(agua.toString());
                Ingrediente vidrio = new Ingrediente("vidrio", "kilo de vidrio", 3);
                System.out.println(vidrio.toString());

                System.out.println("\nPresione una tecla para continuar...");
                scan.nextLine();

                ////////////////////////////////////////////////////////////////////////

                System.out.println("\nRecetas hechas: ");
                ArrayList<Ingrediente> ingredientesRubia = new ArrayList<>();
                Collections.addAll(ingredientesRubia, lupulo.indicarCantidad(3), cebada.indicarCantidad(175),
                                levadura.indicarCantidad(1), agua.indicarCantidad(3));
                Receta recetaRubia = new Receta("Como se debe", "Alemania", ingredientesRubia);
                System.out.println("\n" + recetaRubia.toString());

                ArrayList<Ingrediente> ingredientesRoja = new ArrayList<>();
                Collections.addAll(ingredientesRoja, lupulo.indicarCantidad(5), cebada.indicarCantidad(300),
                                levadura.indicarCantidad(4), agua.indicarCantidad(10));
                Receta recetaRoja = new Receta("Intento de vino", "Tanzania", ingredientesRoja);
                System.out.println("\n" + recetaRoja.toString());

                ArrayList<Ingrediente> ingredientesNegra = new ArrayList<>();
                Collections.addAll(ingredientesNegra, lupulo.indicarCantidad(15), cebada.indicarCantidad(100),
                                levadura.indicarCantidad(1), vidrio.indicarCantidad(3));
                Receta recetaNegra = new Receta("Ew", "Argentina", ingredientesNegra);
                System.out.println("\n" + recetaNegra.toString());

                System.out.println("\nPresione una tecla para continuar...");
                scan.nextLine();

                ////////////////////////////////////////////////////////////////////////

                System.out.println("\nCervezas: ");
                Rubia rubia = new Rubia("Cerveza Rubia", 90, 5, "Bien", true, recetaRubia);
                System.out.println("\n" + rubia.toString());
                Roja roja = new Roja("Cerveza Roja", 110, 9, "meh", true, recetaRoja);
                System.out.println("\n" + roja.toString());
                Negra negra = new Negra("Cerveza Negra", 15, 25, "ouch", false, recetaNegra);
                System.out.println("\n" + negra.toString());

                System.out.println("\nPresione una tecla para continuar...");
                scan.nextLine();

                scan.close();
        }
}
