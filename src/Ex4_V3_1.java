import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4_V3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер массива");
        try{
            int size = sc.nextInt();
            float[] arr = new float[size];
            System.out.println("Fill in the array:");
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>127){
                    throw new RuntimeException("Не входит в диапазон!");
                } else if(arr[i]<-128){
                    throw new RuntimeException("Не входит в диапазон!");
                }else{
                    sum+=arr[i];
                    System.out.println("Сумма массива = "+sum);
                }
            }
        }
        catch (InputMismatchException im){
            System.out.println("Ввод строки вместо числа.");
        }
    }
}
