package com.lilou.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    // but : additionner des entiers
    // exemple d'une erreur qui donne une levee d'exception : si on va plus loin que les bornes
    public static int add(int opG, int opD) {
        int res = opG + opD;
        //
        return res;
    }



    // but : diviser des entiers
    // exemple d'une erreur qui donne une levee d'exception : diviseur = 0
    public static int divide(int opG, int opD) {

        if (opD == 0 ) {
            throw new IllegalArgumentException("On ne peut pas diviser par 0, changez le diviseur");
        }

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
