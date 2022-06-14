import java.util.Scanner;

public class Damian {
    public static void main(String[] args) {
        int sum = 0;
        int rozx;
        int rozy;
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj rozmiar macierzy x");
        rozx =  scan.nextInt();
        System.out.println("podaj rozmiar macierzy y");
        rozy =  scan.nextInt();
        int[][] tab = new int [rozx][rozy];
        for (int i = 0; i <rozx ; i++) {
            for (int j = 0; j <rozy; j++) {
                tab[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i <rozx ; i++) {
            for (int j = 0; j <rozy; j++) {
                sum += tab[i][j];
            }
        }
        System.out.println("suma wynosi");
        System.out.println(sum);
    }

}
