package beadando1;

import java.io.*;

public class Titkosito {
    public String titkosit(String titkositando) throws UnsupportedEncodingException {
        byte[] titkositandoCharValueArray = titkositando.getBytes("Windows-1250");
        String titkositott = "";
        for (byte titkositandoCharValue : titkositandoCharValueArray) {
            titkositandoCharValue++;
            titkositott = titkositott + (char) titkositandoCharValue;
        }
        return titkositott;
    }
}
