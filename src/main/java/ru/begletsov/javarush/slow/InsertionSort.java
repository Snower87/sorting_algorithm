package ru.begletsov.javarush.slow;

/**
 * Class InsertionSort сортировка вставками
 * Данная сортировка является "устойчивой". Это значит, что одинаковые элементы не изменят свой порядок
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 13.07.2020
 * @version 1
 */

public class InsertionSort {
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

    InsertionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            while (i-- >= 0) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }

    }
}
