/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package classes;

import Entity.Recource;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NewRecource implements Serializable{
    public Recource createRecource(){
        System.out.println("-- Создание нового ресурса --");
        Recource recource = new Recource();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя ресурса: ");
        recource.setName(scanner.nextLine());
        System.out.print("URL ресурса: ");
        recource.setUrl(scanner.nextLine());
        System.out.print("Логин: ");
        recource.setLogin(scanner.nextLine());
        System.out.print("Password: ");
        recource.setPassword(scanner.nextLine());
        return recource;
    }
}
