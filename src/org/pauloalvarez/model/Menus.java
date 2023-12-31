package org.pauloalvarez.model;

/**
 *
 * @author Paulo Giovanni Alvarez Ramos
 */

public class Menus {
    private static Menus instancia;

    private String menuActual;
    private String icono;

    public static synchronized Menus getInstancia() {
        if (instancia == null) {
            instancia = new Menus();
        }
        return instancia;
    }

    public String cabezera() {
        menuActual = "--------------------------------------------------------------------------------\n"
            + "                      void* ltd. 1984 @All Rights Reserved\n"
            + "--------------------------------------------------------------------------------\n"
            + "                                 Void Tamagotchi\n"
            + "                                 pre-alpha 0.0.1\n"
            + "--------------------------------------------------------------------------------";
        return menuActual;
    }

    public String mNuevoTamagotchi() {
        menuActual = " \n"
            + " \n"
            + "-------------------------------Elija-su-Tamagotchi------------------------------\n"
            + "===================(1)-----------------(2)-----------------(3)==================\n"
            + "==================Atras------------Seleccionar-----------Adelante===============\n"
            + "--------------------------------------------------------------------------------";
        return menuActual;
    }

    public String mPrincipal() {
        menuActual = " \n"
            + " \n"
            + "--------------------------------------------------------------------------------\n"
            + "===-               (1)                 (2)                 (3)              -===\n"
            + "===-             Opciones             Estado              Salir             -===\n"
            + "--------------------------------------------------------------------------------";
        return menuActual;
    }

    public String mOpciones() {
        menuActual = " \n"
            + "--------------------------------------------------------------------------------\n"
            + "==-                (1)                 (2)                 (3)               -==\n"
            + "==-             Alimentar           Actividad            Cancelar            -==\n"
            + "--------------------------------------------------------------------------------\n"
            + "--------------------------------------------------------------------------------";
        return menuActual;
    }

    public String mAlimentar() {
        menuActual = "--------------------------------------------------------------------------------\n"
            + "=-                 (1)                 (2)                 (3)                -=\n"
            + "=-                Comida            Bocadillo            Cancelar             -=\n"
            + "--------------------------------------------------------------------------------\n"
            + "--------------------------------------------------------------------------------\n"
            + "--------------------------------------------------------------------------------";
        return menuActual;
    }

    public String mActividad() {
        menuActual = "--------------------------------------------------------------------------------\n"
            + "=-                 (1)                 (2)                 (3)                -=\n"
            + "=-                Juego              Estudiar            Cancelar             -=\n"
            + "--------------------------------------------------------------------------------\n"
            + "--------------------------------------------------------------------------------\n"
            + "--------------------------------------------------------------------------------";
        return menuActual;
    }

    public String mComidaBocadillo() {
        menuActual = "--------------------------------------------------------------------------------\n"
            + "-                  (1)                 (2)                 (3)                 -\n"
            + "-                 Atras            Seleccionar           Adelante              -\n"
            + "--------------------------------------------------------------------------------\n"
            + "--------------------------------------------------------------------------------\n"
            + "================================================================================";
        return menuActual;
    }

    public String mEstudiar() {
        menuActual = "--------------------------------------------------------------------------------\n"
            + "-                  (1)                 (2)                 (3)                 -\n"
            + "-                Aprender            Mostrar             Cancelar              -\n"
            + "--------------------------------------------------------------------------------\n"
            + "--------------------------------------------------------------------------------\n"
            + "================================================================================";
        return menuActual;
    }

    public String mJugar() {
        menuActual = "--------------------------------------------------------------------------------\n"
            + "                   (1)                 (2)                 (3)                  \n"
            + "                  Atras               Jugar              Adelante               \n"
            + "--------------------------------------------------------------------------------\n"
            + "--------------------------------------------------------------------------------\n"
            + "================================================================================";
        return menuActual;
    }

    public String iTotito() {
        icono = " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + "                                       |   |   \n"
            + "                                    ---+---+---\n"
            + "                                       |   |   \n"
            + "                                    ---+---+---\n"
            + "                                       |   |   \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " ";
        return icono;
    }

    public String iConnect4() {
        icono = " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + "                                  | | | | | | | |\n"
            + "                                  | | | | | | | |\n"
            + "                                  | | | | | | | |\n"
            + "                                  | | | | | | | |\n"
            + "                                  | | | | | | | |\n"
            + "                                  | | | | | | | |\n"
            + "                                  ===============\n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " ";
        return icono;
    }

    public String iTrivia() {
        icono = " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + "              En la serie \"Loki\", ¿quienes lo arrestan al comienzo?\n"
            + "                                  1. TVA\n"
            + "                                  2. Thanos\n"
            + "                                  3. Los Vengadores\n"
            + "                                  4. Ultron\n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " \n"
            + " ";
        return icono;
    }
}
