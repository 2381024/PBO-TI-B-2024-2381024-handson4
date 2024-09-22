public class ContohRekursif {
    public static int faktorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * faktorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int hasil = faktorial(4);
        System.out.println("Faktorial dari 4 adalah: " + hasil);
    }
}
