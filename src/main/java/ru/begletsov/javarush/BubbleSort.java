package ru.begletsov.javarush;

/**
 * Class BubbleSort сортировка данных методом пузырька
 * простая и неэффективная, сложность алгоритма O(n^2)
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 10.07.2020
 * @version 1
 */

public class BubbleSort {
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

    BubbleSort(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }
}
