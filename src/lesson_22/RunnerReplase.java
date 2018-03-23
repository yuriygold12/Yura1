package lesson_22;

import java.io.IOException;

public class  RunnerReplase {
    public static void main(String[] args) throws IOException {
        IRead rd1 = new Readerfile();
        IWrite wr = new Writefile();
        Replacer rp = new Replacer(rd1,wr);
        rp.findAndReplace();
    }
}
