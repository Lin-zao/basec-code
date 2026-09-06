package skiploop;

public class skiploopDemo1 {
    public static void main(String[] args) {
        //1.跳过某次循环
        for(int i = 1;i<=5;i++){
            if(i == 3){
                continue;
            }
            System.out.println("小老虎在吃第" + i +"个包子");
        }

    }
}
