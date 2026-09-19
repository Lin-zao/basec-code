package Test4;
/*定义数组存储 3 部手机对象。
手机的属性：品牌，价格，颜色。
要求，计算出三部手机的平均价格*/
public class PhoneTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Phone[] arr = new Phone[3];

        //2.创建手机对象
        Phone p1 = new Phone("小红",4999,"黑色");
        Phone p2 = new Phone("苹果",6999,"白色");
        Phone p3 = new Phone("三星",48999,"蓝色");

        //3.把手机对象添加在数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4.获取三部手机的总值
        int num =0;
        for (int i = 0; i < arr.length; i++) {
            num = num +arr[i].getPrice();
        }
        //5.求平均值
        double avg = num*1.0/arr.length;
        System.out.println(avg);

    }
}
