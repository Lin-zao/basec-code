package text;

public class Text5 {
    public static void main(String[] args) {
        //获取三个人的最高身高

        double height1 = 130.5;
        double height2 = 179.6;
        double height3 = 150;
        double result1 = height1 > height2 ? height1 : height2;
        double result2 = result1 > height3 ? result1 : height3;
        System.out.println("三个的最高身高为:");
        System.out.println(result2);

    }
}
