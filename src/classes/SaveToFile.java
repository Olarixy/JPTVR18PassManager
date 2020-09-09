/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Entity.Recource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class SaveToFile  {
    public void saveRecource(List<Recource> listRecources){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("listRecource");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listRecources);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE,  "FileNotExist", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Recource> loadListRecources(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("listRecource");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Recource>) objectInputStream.readObject();
 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return new ArrayList<Recource>();
    }
    
}
