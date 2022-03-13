import java.util.Scanner;


class Cliente{
    private int id;
    private int age;
    private String name;
    private String phone;


    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


public class main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] ids;
        int[] ages;
        String[] names;
        String[] phones;

        ids = new int[16];
        ages = new int[16];
        names = new String[16];
        phones = new String[16];



        int counter = 0;

        while (true){
            if (counter >= 16) {
                break;
            }

            Cliente cliente = new Cliente();

            System.out.print("ID: ");
            int id = input.nextInt();
            cliente.setId(id);

            if (id == 0){
                break;
            }

            System.out.print("Idade: ");
            int age = input.nextInt();
            cliente.setAge(age);

            input.nextLine();

            System.out.print("Nome: ");
            String name = input.nextLine();
            cliente.setName(name);

            System.out.print("Telefone: ");
            String phone = input.nextLine();
            cliente.setPhone(phone);

            ids[counter] = id;
            ages[counter] = age;
            names[counter] = name;
            phones[counter] = phone;


            counter += 1;

        }

        for (int i = 0; i < 16; i++){
            if (names[i] == null) {
                System.out.println("---------------------------------------------");
                break;
            }

            System.out.println("---------------------------------------------");

            System.out.printf("Nome: %s\n", names[i]);
            System.out.printf("Idade: %d\n", ages[i]);
            System.out.printf("ID: %d\n", ids[i]);
            System.out.printf("Tel.: %s\n", phones[i]);

        }
    }
    
}
