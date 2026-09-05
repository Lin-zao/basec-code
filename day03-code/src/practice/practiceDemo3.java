package practice;

public class practiceDemo3 {
    public static void main(String[] args) {
        /*某小伙想定一份外卖，商家的优惠方式如下：
        鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
        订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
        那么这个小伙要点这三样东西，最少要花多少钱？*/
        int fish = 24;
        int peanut = 8;
        int rice = 3;
        double plan1 = (fish + peanut + rice) * 0.8;
        double plan2 = (16 + peanut + rice);
        double leastCost = plan1 > plan2 ? plan2:plan1;
        System.out.println("这个小伙要点这三样东西，最少要花:");
        System.out.println(leastCost);

    }
}
