import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args) throws IOException {
            FileWriter fr = new FileWriter("Storage.txt", true);
            BufferedWriter bw  = new BufferedWriter(fr);
            bw.write("DAVE\n");
            bw.close();
    }
}

