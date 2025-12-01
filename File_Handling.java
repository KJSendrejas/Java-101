import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class File_Handling {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("Sample.txt",true);
        fw.write("Carl\n");
        fw.close();

        FileWriter fwbr = new FileWriter("Sample_file.txt",true);
        BufferedWriter bw = new BufferedWriter(fwbr);
        bw.write("Hello World");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("NewAppointments.txt"));
        String line;
        while((line = br.readLine()) != null){
        System.out.println(line);

      
    }
}
}

