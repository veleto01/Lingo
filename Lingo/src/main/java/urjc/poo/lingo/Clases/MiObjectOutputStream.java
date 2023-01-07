/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urjc.poo.lingo.Clases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Manuel
 */
public class MiObjectOutputStream extends ObjectOutputStream {


    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }

    protected MiObjectOutputStream() throws IOException, SecurityException{
        super(); 
    }
    
    @Override
    protected void writeStreamHeader() throws IOException{
    }
    
}
