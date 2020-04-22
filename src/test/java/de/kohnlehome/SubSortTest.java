package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class SubSortTest {
    private ISubSort subSort;

    @BeforeEach
    public void init(){
        // ===== ARRANGE =====
        // Testdouble erstellen
        subSort = new SubSort();

    }

    @Test
    public void test(){
        // ===== ACT =====
        // zu testende Methode aufrufen
        int[] array = {1,2,4,7,10,11,7,12,6,7,16,18,19};
        int[] result = subSort.subSort(array);

        // ===== ASSERT =====
        // Überprüfen, ob Methode richtigen Wert zurückgibt
        assertThat(result[0]).isEqualTo(3);
        assertThat(result[1]).isEqualTo(9);

    }

    @Test
    public void test2(){
        // ===== ACT =====
        // zu testende Methode aufrufen
        int[] array = {1,2,4,5,6,11,7,12,9,7,16,18,19};
        int[] result = subSort.subSort(array);

        // ===== ASSERT =====
        // Überprüfen, ob Methode richtigen Wert zurückgibt
        assertThat(result[0]).isEqualTo(5);
        assertThat(result[1]).isEqualTo(9);

    }

    @Test
    public void test3(){
        // ===== ACT =====
        // zu testende Methode aufrufen
        int[] array = {1,4,3,5,6,11,7,12,6,7,16,18,19};
        int[] result = subSort.subSort(array);

        // ===== ASSERT =====
        // Überprüfen, ob Methode richtigen Wert zurückgibt
        assertThat(result[0]).isEqualTo(1);
        assertThat(result[1]).isEqualTo(9);

    }

    @Test
    public void test4(){
        // ===== ACT =====
        // zu testende Methode aufrufen
        int[] array = {1,4,3,5,6,11,7,12,6,7,4,18,19};
        int[] result = subSort.subSort(array);

        // ===== ASSERT =====
        // Überprüfen, ob Methode richtigen Wert zurückgibt
        assertThat(result[0]).isEqualTo(1);
        assertThat(result[1]).isEqualTo(10);

    }
}