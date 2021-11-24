/*
Задание 2
Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
площадь.*/
package HWOneOOP.Task002;

import java.util.Scanner;

public class Rectangle {
    double sideOneHeight;
    double sideTwoWidth;

    double areaCalculator(double someSideOne, double someSideTwo) {
        return someSideOne * someSideTwo;
    }

    double perimeterCalculator(double someSideOne, double someSideTwo) {
        return (someSideOne + someSideTwo) * 2;
    }
    //Нужно ли делать отдельный класс, чтобы оттуда запустить эту часть кода? Если да, то для чего (сугубо дробление на блоки кода)?
    public static void main(String[] args) {
        Rectangle shapeOne = new Rectangle();
        System.out.println("Программа производит операции с прямоугольником.\nВведите высоту (например, 7,5 или 5,0): ");
        Scanner in = new Scanner(System.in);
        shapeOne.sideOneHeight = in.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        shapeOne.sideTwoWidth = in.nextDouble();
        System.out.printf("Периметр равен -- %.2f.", shapeOne.perimeterCalculator(shapeOne.sideOneHeight, shapeOne.sideTwoWidth));
        System.out.printf("\nПлощадь равна -- %.2f.", shapeOne.areaCalculator(shapeOne.sideOneHeight, shapeOne.sideTwoWidth));
    }
}
