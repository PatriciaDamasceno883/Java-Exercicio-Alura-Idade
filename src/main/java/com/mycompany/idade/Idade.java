/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.idade;

/**
 *
 * @author ailto
 */
public class Idade {

    public static void main(String[] args) {
        int Idade = 25;
        {
        System.out.println("A idade atual é "+Idade+"\n");
        }
        int IdadeNoAnoQueVem;
        IdadeNoAnoQueVem = Idade+1;
        {
            System.out.println("A idade no ano que vem é "+IdadeNoAnoQueVem+"\n");
        }
        int IdadeDaqui40Anos;
        IdadeDaqui40Anos = Idade+40;
        {
            System.out.println("A idade daqui 40 anos é "+IdadeDaqui40Anos+"\n");
        }
        int IdadeEm2070;
        IdadeEm2070 = Idade+(2070-2022);
        {
            System.out.println("A idade daqui em 2070 será "+IdadeEm2070+"\n");
        }
        int IdadeEm2005;
        IdadeEm2005 = Idade-(2022-2005);
        {
            System.out.println("A idade em 2005 era "+IdadeEm2005+"\n");
        }
    }
}
