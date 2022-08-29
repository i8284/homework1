public class Main {

    public static void main(String[] args) {
        int a, b, min, max, total, average;
        max = 0;
        min = 0;
        total = 0;
        a = 10;
        b = 10;
        int[][] array = new int[a][b];
        for(int i = 0; i<a; i++) {
            for(int j = 0; j<b; j++){
                array[i][j] = 0 + (int) (Math.random()*10);
                if(i==0 && j==0){
                    max=array[0][0];
                    min=array[0][0];
                }
                if(max<array[i][j]){
                    max=array[i][j];
                }

                if(min>array[i][j]){
                    min=array[i][j];
                }

                total = total + array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        average = total/(a*b);
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Среднее значение: " + average);
    }
}
