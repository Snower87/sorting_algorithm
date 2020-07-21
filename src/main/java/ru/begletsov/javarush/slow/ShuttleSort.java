package ru.begletsov.javarush.slow;

/**
 * Class ShuttleSort челночная сортировки
 * неэффективная, сложность алгоритма O(n^2)
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 21.07.2020
 * @version 1
 */

public class ShuttleSort {
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

    ShuttleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
