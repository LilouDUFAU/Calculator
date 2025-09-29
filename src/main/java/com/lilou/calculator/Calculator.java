package com.lilou.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    // but : additionner des entiers
    public static int add(int opG, int opD){
        return opG + opD;
    }

    // but : diviser des entiers
    public static int divide(int opG, int opD) {
        return opG/opD;
    }

    // but : recuperer tous les chiffres composant un nombre
    public Set<Integer> ensembleChiffres(int pNombre){
        // creer mon set (qui sera rempli de int)
        Set<Integer> chiffres = new HashSet<>();

        // on transforme le set de int en chaine
        String strNombre = String.valueOf(Math.abs(pNombre));

        // pour chaque caratere dans la chaine, on ajoute le chiffre dans le set s'il n'est pas deja present
        for (char c : strNombre.toCharArray()) {
            chiffres.add(Character.getNumericValue(c));
        }

        // on retourne le set plein
        return chiffres;
    }
}
