/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urjc.poo.lingo.Clases;
import javax.swing.JComboBox;
import urjc.poo.lingo.Login.*;

public class administradorPerfil {
    AlmacenUsuarios aU;
    AlmacenPartidas aP;
    int tamañoAlmacen = aU.tamañoAlmacen();
    String [] nombres;
   private void colocarListaDesplegables(){
       
      for (int i = 0; i < tamañoAlmacen; i++){
          nombres[i]=aU.getUsu(i).getNombre();
       }
      
       JComboBox lista = new JComboBox(nombres);
       lista.setBounds(20,2,100, 30);
   
   }
    
}
