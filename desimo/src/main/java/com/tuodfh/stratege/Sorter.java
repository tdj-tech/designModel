package com.tuodfh.stratege;

/**
 * @author tdj
 * 2022/4/14 0014
 * 自定义的策略需要有专门的方法对其进行处理
 */
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comparator.compara(arr[j], arr[j+1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private void swap(T[] arr, int i, int j) {
        T a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

}
