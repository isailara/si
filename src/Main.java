import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("archivo.txt");

        try {
            boolean fileCreated=file.createNewFile();

            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write("Real Good Feeling");
            fileWriter.close();

            if(fileCreated){
                System.out.println("El archivo se creó");
            }
            else{
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Lectura del archivo
        try {
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String data=scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}