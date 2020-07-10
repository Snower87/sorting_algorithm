package ru.begletsov.javarush.slow;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void when10NumbersThenSorting() {
        //1. Входные данные для сортировки
        int[] numbers = {1, 5, 7, 8, 9, 2 ,4, 3, 6, 10};
        BubbleSort bubbleSort = new BubbleSort(numbers);
        //2. Выходные, ожидаемые данные
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //3. Выдать ошибку, если массивы не равны
        assertArrayEquals(expected, numbers);
    }
}