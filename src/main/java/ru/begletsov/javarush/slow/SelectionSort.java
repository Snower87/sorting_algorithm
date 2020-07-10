package ru.begletsov.javarush.slow;

/**
 * Class BubbleSort сортировка данных выбором
 * неэффективная, сложность алгоритма O(n^2)
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 10.07.2020
 * @version 1
 */

public class SelectionSort {
    /**
     * Метод меняет расположение элементов
     * @param array значение ссылки на массив
     * @param ind1 первый элемент
     * @param ind2 второй элемент
     */
    public void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    SelectionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }
}
