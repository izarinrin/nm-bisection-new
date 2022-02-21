/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bisectionmethod;

/**
 *
 * @author Ehhhh
 */
public class first {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double a = 1.0, b = 2.0, c = 0.0, tol = 0.01, fa = 0.0, fb = 0.0, fc = 0.0, e = 0.0, co = 0.0,num=0.0;
        int i = 0;
        Boolean tolcheck = false;

        System.out.println("[a          ,b          ,c          ,f(a)          ,f(b)          ,f(c)]          ,e");
        while (!tolcheck) {
            co = c;
            c = (a + b) / 2.0;
            fa = (Math.pow(a, 7.0)) - 3.0 * a;
            fb = (Math.pow(b, 7.0)) - 3.0 * b;
            fc = (Math.pow(c, 7.0)) - 3.0 * c;
            i++;
            System.out.printf("%.9f", a);
            System.out.print(" ");
            System.out.printf("%.9f", b);
            System.out.print(" ");
            System.out.printf("%.9f", c);
            System.out.print(" ");
            System.out.printf("%.9f", fa);
            System.out.print(" ");
            System.out.printf("%.9f", fb);
            System.out.print(" ");
            System.out.printf("%.9f", fc);
            

            if ((fa * fc) < 0) {
                b = c;
            } else {
                a = c;
            }
            e = (c - co) / c;
            if ((Math.abs(e)) <= tol) {
                tolcheck = true;
            }
            System.out.print(" ");
            System.out.printf("%.2f", (Math.abs(e))*100);
            System.out.print("%");
            System.out.println("  iteration #" + i);
        }
        System.out.println("The root of the function is "+c);
    }
}
