package src;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class Varios {

  public static void main(String ars[]) throws IOException {

    // Creando ruta del archivo y contenido
    String ruta = "D:\\Dev\\index.js";
    String contenido = "const sayHello = () => console.log('Hello World Done with JavaScript and Deno');\n"
        + "sayHello();";

    // Creando archivo
    File file = new File(ruta);

    // Si el archivo no existe es creado
    if (!file.exists()) {
      file.createNewFile();
    }

    // Instancias para escribir en el archivo
    FileWriter fw = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(contenido);
    bw.close();

    // Instancias para leer el archivo y ejecutar un proceso en la consola
    Process process = Runtime.getRuntime().exec("deno run " + ruta);

    // Mostrar la ejecución del archivo en la consola
    InputStream is = process.getInputStream();
    BufferedInputStream bis = new BufferedInputStream(is);
    int i = bis.read();

    while (i != -1) {
      System.out.print((char) i);
      i = bis.read();
    }

  }
}