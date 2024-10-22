public class Main {
    public static void main(String[] args) {     //ders1. task3 (cut ededlerin cemi)
        int cem=0;
        for(int a=1; a<100; a++){
            if(a%2==0){
                cem+=a;
            }
        }
        System.out.println("1-den 100-e qeder cut ededlerin cemi= "+cem);
    }
}