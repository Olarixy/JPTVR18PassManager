/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18;

import Entity.Recource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    private List<Resource> listResources = new ArrayList<>();
    public void run(){
        System.out.println("---Менеджер паролей---");
        String repeat = "r";
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("0 - выйти из программы");
            System.out.println("1 - добавить ресурс");
            System.out.println("2 - спискок ресурсов");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task){
                case 0:
                    repeat = "q";
                    break;
                case 1:
                    System.out.println("Выбрана задача 1 ");
                    Recource recource = new Recource();
                    recource.setName("ivkhk");
                    recource.setUrl("http://kutsehariduskeskus.ee");
                    break;
                case 2:
                    System.out.println("Выбрана задача 2 ");
                    System.out.println("Список ресурсов: ");
                    for(Recource r : listResources){
                        System.out.println(r.toString());
                    }
                    break;
            }
        } while("q".equals(repeat));    
    }
}
