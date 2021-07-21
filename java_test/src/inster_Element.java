import java.util.Arrays;
public class inster_Element {
    public static void main(String args[]){
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("数组排序", array);
        int index = Arrays.binarySearch(array, 1);
        System.out.println("元素 1 所在位置（负数为不存在）："
                + index);
        int newIndex = -index - 1;
        array = insertELement(array, 1, newIndex);
        printArray("数组添加元素 1", array);
    }


    private static void printArray(String message, int array[]){
        System.out.println(message+": [length: " + array.length + "]");
        for (int i = 0; i < array.length;i++){
            if (i!=0){
                System.out.print("'");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] insertELement(int original[], int element, int index){
//        原始数组，元素内容，插入位置
        int length = original.length;
//        因为多了以为位置，需要新的长度的数组
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
//        Object src : 原数组
//        int srcPos : 从元数据的起始位置开始
//　　     Object dest : 目标数组
//　　     int destPos : 目标数组的开始起始位置
//　　     int length  : 要copy的数组的长度
//        上面函数就复制了orginal[0:index]
//        然后加上index上的element
        destination[index] = element;
//      最后拼接上[index:-1]
        System.arraycopy(original, index, destination, index+1, length-index);
        return destination;
    }
}
