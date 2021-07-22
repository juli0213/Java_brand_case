//实现这个算法可以简单分为三个步骤：
//
//        　　　　（1）     把n-1个盘子由A 移到 B；
//
//        　　　　（2）     把第n个盘子由 A移到 C；
//
//        　　　　（3）     把n-1个盘子由B 移到 C；
public class HanoiTower {
    public static void main(String[] args){
        int nDisk = 3;
        doTowers(nDisk, 'A', 'B', 'C');
    }
    public static void doTowers(int topN, char from, char inter, char to){
        if (topN == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        }
        else {
            doTowers(topN -1, from ,to, inter);
            System.out.println("Disk " + topN + " from" + " to " +to);
            doTowers(topN -1, inter, from, to);
        }
    }
}
