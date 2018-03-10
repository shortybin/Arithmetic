/**
 * Created by wuhuabin on 2018/3/9.
 */
public class Sort {

    /**
     * 冒泡排序，外层循环数组长度-1，内层循环数组个数-i
     *
     * @param data
     */
    public static void bubbleSort_1(int[] data) {
        int tem;
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j + 1]) {
                    tem = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tem;
                }
                printline(data);
            }
        }

        printline(data);
    }

    /**
     * 优化后的冒泡排序，用一个标志符记录最后一个更换的位置，下次循环
     * 最多到了循环位置
     *
     * @param data
     */
    public static void bubbleSort_2(int[] data) {
        int tem;
        int num = data.length - 1;
        while (num > 0) {
            int tag = 0;
            for (int i = 0; i < num; i++) {
                if (data[i] > data[i + 1]) {
                    tag = i;
                    tem = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tem;
                }
            }
            num = tag;
        }
        printline(data);
    }

    /**
     * 选择排序
     *
     * @param data
     */
    public static void selectSort(int[] data) {
        int tem;
        int tag;//记录最小值的下标
        for (int i = 0; i < data.length-1; i++) {
            tag = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[tag] > data[j]) {//把记录的数值和循环的数值比较，有更小的替换记录下标
                    tag = j;
                }

            }
            if (i != tag) {
                tem = data[i];
                data[i] = data[tag];
                data[tag] = tem;
            }
            //printline(data);

        }
        printline(data);
    }


    /**
     * 打印数组内数字
     *
     * @param data
     */
    public static void printline(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");

    }

}
