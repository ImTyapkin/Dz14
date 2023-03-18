import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int array [] = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array [i] = random.nextInt(41) - 20;
            System.out.println(array [i] + " "); // предусловие
        }
        int max = array[0];
        int min = array[0];
        for(int i = 0; i != array.length; i ++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min); //вопрос 1
        System.out.println("Максимальное значение массива: " + max); //вопрос 1
        int a = Math.abs(min);
        int b = Math.abs(max);
        int second = Math.max(a, b);
        System.out.println("Наибольшее число по модулю: " + second);//вопрос 2

    }
}

