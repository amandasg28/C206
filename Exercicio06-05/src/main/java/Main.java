import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Chocolate c1 = new Chocolate();
        Chocolate c2 = new Chocolate();
        Nutella n1 = new Nutella();
        Nutella n2 = new Nutella();
        Brigadeiro b1 = new Brigadeiro();
        Brigadeiro b2 = new Brigadeiro();

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());
        nomes.add(sc.nextLine());

        ArrayList<Brownie> brownies = new ArrayList<Brownie>();
        brownies.add(c1);
        brownies.add(n1);
        brownies.add(b1);
        brownies.add(c2);
        brownies.add(n2);
        brownies.add(b2);

        for (int i = 0; i < brownies.size(); i++) {
            brownies.get(i).nome = nomes.get(i);
            brownies.get(i).preco = new Random().nextDouble()*100;
        }
        Collections.sort(brownies,Collections.reverseOrder());

    }
}
