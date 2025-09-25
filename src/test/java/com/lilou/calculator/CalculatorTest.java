package com.lilou.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        Calculator calc = new Calculator();

        // WHEN
        int resultat = calc.add(2,3);

        // THEN
        assertEquals(5, resultat, "2 + 3 devrait etre egal a 5");
    }

    @Test
    void add_devrait_retourner_une_erreur_si_opG_est_var(){
        // GIVEN

        // WHEN

        // THEN

    }

    @Test
    void add_devrait_retourner_une_erreur_si_opD_est_var(){
        // GIVEN

        // WHEN

        // THEN

    }

    @Test
    void add_devrait_retourner_une_erreur_si_opG_null(){
        // GIVEN

        // WHEN

        // THEN

    }

    @Test
    void add_devrait_retourner_une_erreur_si_opD_null(){
        // GIVEN

        // WHEN

        // THEN

    }

    @Test
    void divide_devrait_calculer_la_division_de_deux_int(){
        // GIVEN
        Calculator calc = new Calculator();

        // WHEN
        int resultat = calc.divide(10,5);

        // THEN
        assertEquals(2,resultat, "10 divise par 5 doit donner 2");
    }

    @Test
    void divide_devrait_retourner_une_erreur_si_opD_est_zero(){
        // GIVEN

        // WHEN

        // THEN
    }

    @Test
    void divide_devrait_retourner_une_erreur_si_opG_est_var(){
        // GIVEN

        // WHEN

        // THEN

    }

    @Test
    void divide_devrait_retourner_une_erreur_si_opD_est_var(){
        // GIVEN

        // WHEN

        // THEN

    }

    @Test
    void divide_devrait_retourner_une_erreur_si_opG_null(){
        // GIVEN

        // WHEN

        // THEN

    }

    @Test
    void divide_devrait_retourner_une_erreur_si_opD_null(){
        // GIVEN

        // WHEN

        // THEN

    }

}