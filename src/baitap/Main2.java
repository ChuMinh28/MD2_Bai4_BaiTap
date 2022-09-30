package baitap;

public class Main2 {
    public static void main(String[] args) {
        // Khoi tao array co 10000 phan tu
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.random()*10000;
        }
        // Start dong ho de bat dau dem thoi gian giai thuat
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        // Thuc hien giai thuat
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <array.length; j++) {
                if (array[i]>array[j]){
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        //Stop dong ho de tinh so thoi gian thuc hien giai thuat
        stopWatch.stop();
        //In so thoi gian thuc hien giai thuat
        System.out.println("thoi gian thuc hien giai thuat la: "+stopWatch.getElapsedTime());
    }
}
