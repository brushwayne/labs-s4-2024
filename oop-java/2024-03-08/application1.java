import Marketing.*;

import java.io.*;

class application1 {
    public static void main(String args[])throws IOException {
        sales s = new sales();

        s.getInput();
        s.earning();
        s.display();
    }
}
