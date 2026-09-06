package arrarydemo;

public class ArraryDemo1 {
    public static void main(String[] args) {
        //格式:
        //静态初始化:
        //数据类型 [] 数组名 = new 数据类型[]{元素一,元素二....}
        //简化格式:
        //数据类型 [] 数组名 ={元素一,元素二....}
        int [] arr2 = new int []{11,12,14};
        int [] arr1 = {11,12,14};

        String [] arr3 = new String[]{"zhangsan","lisi"};
        String [] arr4 = {"zhangsan","lisi"};

        double [] arr6 = new double[]{1.96,1.94};
        double [] arr5 = {1.95,1.94};
        System.out.println();

        //扩展：
        //解释一下地址值的格式含义  [D@776ec8df
        //[ ：表示当前是一个数组
        //D：表示当前数组里面的元素都是double类型的
        //@：表示一个间隔符号。（固定格式）
        //776ec8df：才是数组真正的地址值，（十六进制）
        //平时我们习惯性的会把这个整体叫做数组的地址值。
    }
}
