package DataTypes.exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());//N
        int pokeTargetsDistance = Integer.parseInt(scanner.nextLine());//M
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());//Y

        int firstPower = pokePower;

        int totalPokes = 0;


        while(pokePower>=pokeTargetsDistance){

            pokePower-=pokeTargetsDistance;
            totalPokes++;

            if(pokePower==firstPower/2){
                pokePower=pokePower/exhaustionFactor;
            }

        }
        System.out.println(pokePower);
        System.out.println(totalPokes);



    }
}
