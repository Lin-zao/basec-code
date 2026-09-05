package practice;

public class practiceDemo2 {
    public static void main(String[] args) {
        /*红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
        绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
        那么红茶和绿茶现在的钱一样多，请问对么？*/
        double redSister = 21;
        double blueSister = 24;
        double redSister1 = 2 * redSister + 3;
        double blueSister1 = 2 * blueSister;
        String result = redSister1 == blueSister1 ? "钱一样多":"钱不一样多";
        System.out.println(result);

    }
}
