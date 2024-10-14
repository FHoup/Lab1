import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) throws IOException {
        int a = in.nextInt(),b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        if (a < b) {
            if (c < d) {
                if (b < c) {
                    out.println(b);
                }
                else {
                    if (a<c) {
                        out.println(c);
                    }
                    else {
                        if (a < d) {
                            out.println(a);
                        }
                        else {
                            out.println(d);
                        }
                    }
                }
            }
            else {
                if (b < d) {
                    out.println(b);
                }
                else {
                    if (c < a)  {
                        out.println(c);
                    }
                    else {
                        if (a < d) {
                            out.println(d);
                        }
                        else {
                            out.println(a);
                        }
                    }
                }
            }
        }
        else {
            if (c < d) {
                if (a < c) {
                    out.println(a);
                }
                else {
                    if (b < c) {
                        out.println(c);
                    }
                    else {
                        if (b < d) {
                            out.println(b);
                        }
                        else {
                            out.println(d);
                        }
                    }
                }
            }
            else {
                if (a < d) {
                    out.println(a);
                }
                else {
                    if (b < d)  {
                        out.println(d);
                    }
                    else {
                        if (b < c) {
                            out.println(b);
                        }
                        else {
                            out.println(c);
                        }
                    }
                }
            }
        }
    }
}