import java.io.*;

public class Reader {
    private InputStreamReader inpustream;
    private BufferedReader bufferedReader;

    // constructor por defecto
    public Reader() {
        this.inpustream = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(inpustream);
    }

    public Reader(InputStream inputStream) {
        this.inpustream = new InputStreamReader(inputStream);
        bufferedReader = new BufferedReader(inpustream);
    }

    public String readLine() {
        try {
            return this.bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
