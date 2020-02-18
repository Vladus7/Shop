package com.vlad;
import java.io.*;
import com.vlad.resources.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Products> productsRead = new ArrayList<>();

    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	User user = new User("Max", "Pushkinskaj/5", 1100, 1550);

//	Fruit apple = new Fruit("Apple", 50, "UK", 1);
//    Clothes Jeans = new Clothes("Jeans", 500, "TK", "denim");
//    Speakers Beats = new Speakers("Beats", 1500, "Jp", 300);
//    Products[] products = new Products[] {apple, Jeans, Beats};
//    writePeople(products);
        readProduct();
        for (Products prt: productsRead) {
            System.out.println(prt);
        }


	System.out.println("Список товаров:");
        for (Products product:productsRead) {
            product.printProduct();
        }

        Informer informer = new Informer();
        int n = 0;
        while (true)
        {
            n++;
            System.out.println();
            System.out.println("Здравствуйте " + user.getName() + " ваш баланс " + user.getBalance());

            int i =0;
            for (Products iterator:productsRead) {
                System.out.println("Товар " + i + " " + iterator.getName() + " по цене " + iterator.getCost());
                i++;
            }
                System.out.println("Выберете номер товара и нажмите Enter:");

                String str = reader.readLine();
                int productNumber = Integer.parseInt(str);

                if (productNumber >= 0 && productNumber < productsRead.size())
                {

                    if (productsRead.get(productNumber).getCost() < user.getBalance())
                    {
                        informer.buy(user, productsRead.get(productNumber));
                    }
                    else
                    {
                        System.out.println("У вас недостаточно средств");
                    }

                }
                else
                {
                    System.out.println("Таких товаров нет");
                }
            }
    }
    private static void readProduct() {
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("myObjects.txt")))) {
            try {
                while (true) {
                    productsRead.add((Products) oi.readObject());
                }
            } catch (EOFException ignored) {
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writePeople(Products[] products){
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File("myObjects.txt")))) {
            for (Products per : products) {
                o.writeObject(per);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        }
    }
}
