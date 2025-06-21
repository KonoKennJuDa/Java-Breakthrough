package JavaBreakthrough.PackageExp;

import JavaBreakthrough.PackageExp.Forest.Something.SomeClass;
import JavaBreakthrough.PackageExp.Forest.Squirrel;
import JavaBreakthrough.PackageExp.Forest.Tree; // Импорт класса из другого пакета

import java.util.Scanner; // Импорт класса Scanner из пакета java -> util -> Scanner. Утилитарный пакет util


public class App {

    public static void main(String[] args) {

        Tree tree = new Tree(); // Создание объекта из класса, который лежит в другом пакете
        Squirrel squirrel = new Squirrel();
        SomeClass someClass = new SomeClass();

        System.out.println();

        Scanner scanner = new Scanner(System.in); // Класс из пакета java.util

    }

    // Package - пакеты. По сути это что-то типа папок, как в операционной системе

}
