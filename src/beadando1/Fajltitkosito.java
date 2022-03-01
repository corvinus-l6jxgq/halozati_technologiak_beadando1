package beadando1;

import java.io.*;

public class Fajltitkosito {
    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new FileReader("uzenet.txt"));
            //out = new PrintWriter("uzenet_titkositott.txt");
            out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("uzenet_titkositott.txt"), "Windows-1250"));

            String line = in.readLine();
            String titkositando = "";

            while (line != null) {
                titkositando = line;
                Titkosito t = new Titkosito();
                out.println(t.titkosit(titkositando));
                line = in.readLine();
            }
            System.out.println("A fájl titkosítása befejeződött.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.print("Hiba történt: " + e.toString());
        } finally {
            try {
                in.close();
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
