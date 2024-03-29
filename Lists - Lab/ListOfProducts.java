package Lists.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();

            productList.add(product);
        }

        Collections.sort(productList);
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + 1 + "." + productList.get(i));
        }
    }
}
