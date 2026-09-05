package Switchldemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        String noodles = "兰州拉面";
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
