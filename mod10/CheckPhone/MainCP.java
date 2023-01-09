package CheckPhone;

import java.io.*;
import java.util.Objects;


class MainCP {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/art_of_d/Java/mod10/CheckPhone/file.txt");

        try(FileInputStream fileInputStream = new FileInputStream(file)){
            int nextChar = -1;
            char[] c = new char[(int) file.length()];
            int i = 0;
            while((nextChar = fileInputStream.read()) != -1) {
                    c[i] = (char) nextChar;
                    i++;
            }

            Check chNumber = new Check(c);
            for (String s : chNumber.getCrctPhoneList()) {
                if (!(Objects.equals(s, null))) System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}