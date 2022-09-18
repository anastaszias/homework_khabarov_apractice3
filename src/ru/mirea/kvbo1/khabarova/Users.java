package ru.mirea.kvbo1.khabarova;

public class Users {
    public static void main(String[] args) {
        int [] mas = new int[4];

        for (int i = 0; i < mas.length; i++) {
            int a = (int) (Math.random() * 90) + 10;
            mas[i] = a;
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        if (mas[0] < mas[1] && mas[1] < mas[2] && mas[2] < mas[3]) {
            System.out.println("Строго возрастающая последовательность");
        } else {
            System.out.println("Не строго возрастающая последовательность");
        }
    }
}
