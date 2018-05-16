package cn.zywy.bean;

import org.junit.jupiter.api.Test;

public class Demo {
    /**
     * 暴力破解法
     * 鸡兔同笼
     *  鸡兔头50，脚120
     * 韩信点兵：
     *  部下1000多员
     *  5人一组剩一人
     *  7人一组剩2人
     *  8人一组剩3人
     */
    @Test
    public void test01() {
        int a, b;
        for (a = 0; a <= 50; a++) {
            b = 50 - a;
            if ((2 * a + 4 * b) == 120) {
                System.out.println("鸡" + a + ",兔" + b);
            }
        }

        int c;
        for (c = 1000; c < 2000; c++) {
            if (c % 5 == 1 && c % 7 == 2 & c % 8 == 3) {
                System.out.println("韩信有" + c + "名部下。");
            }
        }
    }

}
