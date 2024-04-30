
package creararchivo;
import java.io.File;
import java.io.IOException;


public class Creararchivo {

    public static void main(String[] args) {
        File archivo = new File("D:\\Descargas\\Miarchivo.txt"); //Ruta + el nombre del archivo a crear con su extension
        try{
            if(archivo.createNewFile()){
                System.out.println("Archivo creado: " +archivo.getName());
            }
            else{
                System.out.println("El archivo ya existe");
            }
        }
        catch (IOException e){
            System.out.println("Se produjo un error");
            e.printStackTrace();
        }
        
    }
    
}
