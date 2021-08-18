/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.itnetwork.meritko;

import java.util.Scanner;

/**
 *
 * @author janprochazka
 */
public class Meritko {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Tento program převede reálné rozměry do rozměrů vybraného měřítka. Do měřítka zadávejte celé číslo. Příklad: u měřítka 1/35 zapíšete do měřítka číslo 35.");
        System.out.println("Zadejte délku reálného předmětu: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte šířku reálného předmětu: ");
        float b = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte měřítko 1/: ");
        float c = Float.parseFloat(sc.nextLine());
        float delka = a / c;
        float sirka = b / c;
        System.out.println("Délka po přepočtu měřítka: " + delka);
        System.out.println("Šířka po přepočtu měřítka: " + sirka);
        System.out.println("Děkuji za použití mého programu. Aplikaci ukončíte libovolnou klávesou.");
    }
}
