package application;

import br.unit.util.ConversaoDeUnidadesDeArea;

import java.util.Objects;
import java.util.Scanner;


public class main {
    public static void main(String[] args){
        ConversaoDeUnidadesDeArea conversor = new ConversaoDeUnidadesDeArea();
        Scanner input = new Scanner(System.in);

        System.out.println("\nConversor de unidades");
        System.out.printf("[ m2 ] Metro quadrado\n[ p2 ] Pé quadrado\n[ cm2 ] Centimetro quadrado\n[ mi2 ] Milha quadrada\n[ acre ] Acre\n\n");

        String convert_from;

        do {
            System.out.print("Converter de > ");
            convert_from = input.next();
        } while ((!convert_from.equals("m2")) && (!convert_from.equals("cm2")) && (!convert_from.equals("mi2")) && (!convert_from.equals("p2")) && (!convert_from.equals("acre")));


        String convert_to;

        do {
            System.out.print("Converter para > ");
            convert_to = input.next();
        } while ((!Objects.equals(convert_to, "m2")) && (!Objects.equals(convert_to, "cm2")) && (!Objects.equals(convert_to, "mi2")) && (!Objects.equals(convert_to, "p2")) && (!Objects.equals(convert_to, "acre")));



        System.out.printf("Digite a área em %s: ", convert_from);
        double area_size = input.nextDouble();


        conversor.setArea_size(area_size);
        conversor.setConvert_from(convert_from);
        conversor.setConvert_to(convert_to);

        conversor.converter();

    }
}
