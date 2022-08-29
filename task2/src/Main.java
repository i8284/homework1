public class Main {

    public static void main(String[] args) {
        int a, b = 0;
        int i = 1;

        int[] array = new int[] {5, 6, 3, 2, 5, 1, 4, 9};

        System.out.print("Дан массив: ");

        for(int j = 0; j<array.length; j++) {
            System.out.print(array[j] + " ");
        }

        System.out.print("\n");

        while(i>0){

            if(i<array.length){
                if(array[i]<array[i-1]){
                    a = array[i-1];
                    array[i-1] = array[i];
                    array[i] = a;
                    b = 1;
                }
            }
            if(i==array.length-1){
                if(b==1){
                    i=0;
                    b=0;
                }
                else {
                    break;
                }
            }
            i++;
        }


        System.out.print("Массив после сортировки: ");
        for(int j = 0; j<array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}