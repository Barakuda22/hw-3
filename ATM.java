public class ATM {
    public static void main(String[] args) {

    }

    public int countBanknotes(int sum){
        int [] banknotes = {500,200,100,50,20,10,5,2,1};
        int numbers=0;
        int i=0;
        while (sum!=0){
            if (sum >= banknotes[i]) // Сумма больше первого элемента массива (500)
            {
                numbers = numbers + sum / banknotes[i]; // sum (735) / bank[0] (500) = 1!
                sum = sum - (sum / banknotes[i]) * banknotes[i]; // 735 - ( 735 / 500) * 500
            }
            i++;
        }
        return numbers;
    }
}
