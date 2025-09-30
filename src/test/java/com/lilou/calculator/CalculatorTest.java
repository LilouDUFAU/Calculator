package com.lilou.calculator;

// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Calculator calc;

    /*
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }
    */

    @ParameterizedTest
    @CsvSource
    ( {
        "0, 1, 1",
        "1, 2, 3",
        "-2, 2, 0",
        "0, 0, 0",
        "-1, -2, -3"
    })

    // @Test
    void add_devrait_calculer_la_somme_de_deux_int(int opG, int opD, int resultatAttendu) {
        // GIVEN

        // WHEN
        // int resultat = Calculator.add(2,3);

        // THEN
        //assertEquals(5, resultat, "2 + 3 devrait etre egal a 5");
        assertEquals(resultatAttendu, Calculator.add(opG,opD), "Le resultat n'est pas le bon");
    }

    @Test
    void add_devrait_retourner_une_erreur_quand_le_resultat_est_plus_petit_que_le_plus_petit_operateur() {

    }


    @Test
    void divide_devrait_calculer_la_division_de_deux_int(){
        // GIVEN

        // WHEN
        int resultat = Calculator.divide(10,5);

        // THEN
        assertEquals(2,resultat, "10 divise par 5 doit donner 2");
    }

    @Test
    void divide_devrait_retourner_une_erreur_si_on_divise_par_zero(){
        // GIVEN

        // WHEN
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(10, 0);
        });

        assertTrue(exception.getMessage().contains("On ne peut pas diviser par 0, changez le diviseur"));
    }


    @Test
    void set_devrait_recuperer_les_chiffres_dun_nombre() {
        // GIVEN
        Calculator calc = new Calculator();

        // WHEN
        Set<Integer> result1 = calc.ensembleChiffres(7679);
        Set<Integer> result2 = calc.ensembleChiffres(-11);

        // THEN

        assertThat(result1).containsExactlyInAnyOrder(6,7,9).hasSize(3);
        assertThat(result2).containsExactlyInAnyOrder(1).hasSize(1);
    }
}