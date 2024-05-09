import java.util.Random;

public class First {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumb = random.nextInt(41) - 20;
        if (randomNumb > 0){
            System.out.println("Випадкове натуральне число з проміжку [-20;20]:"+randomNumb);
        }
        else{
            do{
                randomNumb = random.nextInt(41)-20;
            }while (randomNumb <= 0);
            System.out.println("Випадкове натуральне число з проміжку [-20;20]:"+randomNumb);
        }
    }
}