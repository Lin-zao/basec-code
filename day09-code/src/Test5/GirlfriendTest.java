package Test5;
/*定义数组存储 4 个女朋友的对象
女朋友的属性：姓名、年龄、性别、爱好
要求 1：计算出四个女朋友的平均年龄
要求 2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。*/
public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend g1 = new Girlfriend("lq",18,"女","吃饭");
        Girlfriend g2 = new Girlfriend("ww",19,"女","哈哈");
        Girlfriend g3 = new Girlfriend("gy",20,"女","嘻嘻");
        Girlfriend g4 = new Girlfriend("lrt",28,"女","吃饭");

        Girlfriend[] arr = new Girlfriend[4];
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i].getAge();
        }
        double avg = sum*1.0 / arr.length;
        System.out.println(avg);

        //统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge() < avg){
                System.out.println(arr[i].getName()+" ," +arr[i].getAge()+" ," +arr[i].getGender()+" ," +arr[i].getLove());
            }
        }
    }
}
