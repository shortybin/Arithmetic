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
    public static void selectSort_1(int[] data) {
        int tem;
        int tag;//记录最小值的下标
        for (int i = 0; i < data.length - 1; i++) {
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
     * 优化后的选择排序，每次循环找出最大值和最小值，替换到头部和尾部
     * 总循环数为总数/2
     * @param data
     */
    public static void selectSort_2(int[] data) {
        int min, max, tem;//min为最下值下标，max为最大值下标
        for (int i = 1; i <= data.length / 2; i++) {
            min=i;max=i;
            for (int j = i+1; j <=data.length-i; j++) {
                if (data[j]>data[max]){
                    max=j;
                    continue;
                }
                if (data[j]<data[min]){
                    min=j;
                }
            }
            if (min!=i-1){
                tem=data[i-1];
                data[i-1]=data[min];
                data[min]=tem;
            }
            if (max!=data.length-i){
                tem=data[data.length-i];
                data[data.length-i]=data[max];
                data[max]=tem;
            }
        }
        printline(data);
    }

    /**
     * 插入排序 从下标为i开始，和i-1之前的所有数比较，小的换到前面
     *
     * @param data
     */
    public static void instertionSort(int[] data) {
        int tem;
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j] < data[j - 1]) {
                    tem = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tem;
                }
            }
        }
        printline(data);
    }

    /**
     * 优化后的插入排序，当j下标的元素大于j-1的元素，之前的不用再去比较，之前的数据
     * 都是已经排好的
     *
     * @param data
     */
    public static void instertionSort_1(int[] data) {
        int tem;
        for (int i = 1; i < data.length; i++) {
            int j = i;
            while (j > 0 && data[j] < data[j - 1]) {
                tem = data[j];
                data[j] = data[j - 1];
                data[j - 1] = tem;
                j--;
            }
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
