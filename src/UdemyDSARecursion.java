public class UdemyDSARecursion {

    public int findFactorialValue(int n){
        if(n==0) {
            return 1;
        } else {
//            System.out.println(n);
            return n * findFactorialValue(n - 1);
        }
    }
}
