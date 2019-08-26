package com.hyx.eightsort;

/**
 * fileName:BubbleSort
 * description: 冒泡排序
 * author:hyx
 * createTime:2019/7/22 19:21
 */
public class BubbleSort {
    public void bubbleSort(int[] arr, int n) {
        if (n <= 1) {
            return;//如果只有一个元素就不用排序了
        }
        for (int i = 0; i < n; i++) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            for (int j = 0; j < n - i - 1; j++) {
                //此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面，
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (arr[j] > arr[j + 1]) {
                    //即这两个相邻的数是逆序的，交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 6, 8, 5, 9};
        for (int i = 0; i < arr.length; i++) {
            //打印数组信息
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.print(i1+" ");
        }
    }
}
