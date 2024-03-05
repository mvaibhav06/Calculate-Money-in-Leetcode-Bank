public class CalculateMoney {
    public static int totalMoney(int n){
        // (1 2 3 4 5 6 7) + (2 3 4 5 6 7 8) + (3 4 5 6 7 8 9) + (4 5 6 7 8)
        // 28

        int sum = 0;
        int start = 1;
        for (int i=1; i<=n; i++){
            if (i <= 7){
                sum += i;
            }else {
                int sum1 = (i % 7) + start;
                if (i%7==0){
                    sum1 += 7;
                    start++;
                }
                sum += sum1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(totalMoney(26));
    }
}
