package arithmeticoperator;

public class arithmeticoperatorDemo4 {
    public static void main(String[] args){
        //字符相加

        /*当**字符 + 字符**、**字符 + 数字**时，
        会把字符通过 ASCII 码表查询到对应的数字再进行计算*/
        System.out.println(1 + 'a');//a的ASCII码为97
        System.out.println("abc" + 'a');

    }
}
