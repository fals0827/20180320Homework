import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        student stus [] = new student[5];
        for (int i = 0 ; i < 5 ; i ++ ){
            stus[i]=new student(scn.next(),scn.next(),scn.next(),
                        scn.nextInt(),scn.nextInt(),scn.nextInt());
        }
        int a = 1;
        while (a != 5){
            System.out.println("1. 查詢學生資料");
            System.out.println("2. 查詢全部學生資料");
            System.out.println("3. 查詢科目平均");
            System.out.println("4. 查詢學生的總分與平均");
            System.out.println("5. 結束");
            int x = scn.nextInt();
            switch (x){
                case 1:
                    System.out.println("請問要查詢第幾位同學?");
                    int num1 = scn.nextInt();
                    stus[num1].showName();stus[num1].showSex();
                    stus[num1].showMajor();stus[num1].showEngScore();
                    stus[num1].showChiScore();stus[num1].showMathScore();
                    break;
                case 2:
                    for (int j = 0 ; j < 4 ;j ++){
                        stus[j].showName();stus[j].showSex();
                        stus[j].showMajor();stus[j].showEngScore();
                        stus[j].showChiScore();stus[j].showMathScore();
                    }
                    break;
                case 3:
                    System.out.println("請問要查詢哪個科目?\t1.英文  2.國文  3.數學");
                    int sub = scn.nextInt();
                    switch (sub){
                        case 1:
                            int sum1 = 0;
                            for (int k = 0 ; k < 5 ; k ++ ){
                                sum1 += stus[k].getEnglish();
                            }
                            System.out.println(Math.round(sum1 / 5f));
                            break;
                        case 2:
                            int sum2 = 0;
                            for (int k = 0 ; k < 5 ; k ++ ){
                                sum2 += stus[k].getChinese();
                            }
                            System.out.println(Math.round(sum2 / 5f));
                            break;
                        case 3:
                            int sum3 = 0;
                            for (int k = 0 ; k < 5 ; k ++ ){
                                sum3 += stus[k].getMath();
                            }
                            System.out.println(Math.round(sum3 / 5f));
                            break;
                    }
                case 4:
                    System.out.println("請問要查詢第幾位同學");
                            int num2 = scn.nextInt();
                            int tot =stus[num2].getEnglish()+stus[num2].getChinese()+stus[num2].getMath();
                            System.out.println("總分:"+tot+"\t"+"平均:"+Math.round(tot / 3f));
                            break;
                case 5:
                    a=5;
                    break;

            }
        }
        System.out.println("感謝您使用本系統");
    }
}
