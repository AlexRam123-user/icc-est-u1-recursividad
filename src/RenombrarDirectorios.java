import java.io.File;   

public class RenombrarDirectorios {
    public void renombrarDirectorios (String path){
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es directorio valido");
            return;
        }
        //ACA vamos a cambiar los nombres
        System.out.println("La ruta path es valida");
    }
}
