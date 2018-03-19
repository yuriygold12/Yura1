package lesson_22;

import java.io.FileReader;
import java.io.IOException;

public class Replacer {
    private IRead reader;
    private IWrite writer;

    public Replacer(IRead reader, IWrite writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void findAndReplace() throws IOException {
        String readLine = reader.readInformation();
        String repLine = readLine.replace("w", "X");
        writer.writeInformation(repLine);
    }


    public static void main(String[] args) throws IOException {
        IRead rd1 = new Readerfile();
        IWrite wr = new Writefile();
        Replacer rp = new Replacer(rd1,wr);
        rp.findAndReplace();
    }

}
