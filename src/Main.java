import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        int inputValue;
        do {
            System.out.printf("\nNhap vao gia tri muon xoa: ");
            inputValue = input.nextInt();
            for(int i = 0; i < arr.length; i++){
                boolean checkValue = false;
                if(inputValue == arr[i]){
                    checkValue = true;
                }
                if(checkValue){
                    for(int k= i, j = i+1; k < arr.length; k++, j++){
                        if(k == arr.length - 1){
                            arr[k] = 0;
                        }else {
                            arr[k] = arr[j];
                        }
                    }
                }
            }
            printArr(arr);
        }while (1 == 1);
    }

    public static void printArr(int[] arr){
        System.out.printf("[ ");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("]");
    }
}