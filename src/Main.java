
import java.lang.*;
class Rownania{
    public int makeByXs(int a1, int b1, int g1){
        int res = a1+b1+g1;
        return res;
    }
    public int makeFree1(int c1, int d1, int e1, int f1, int h1){
        int part1= c1* d1;
        int part2 = e1* f1;
        int res= part2+part1+h1;
        res = - res;
        return res;
    }
    public void getResult1(){
        int resLeft= this.makeByXs(1,-2,3);
        int resRight = this.makeFree1(-2, 5, 3,4,-8);
        int resFinal= resRight/ resLeft;
        System.out.println("x= "+resFinal);
    }
    public  int makeByX2(int a2, int b2, int g2){
        int resA = a2 / a2;
        int resB = b2 * a2;
        int resG = g2 * a2;
        int res = resA + resB + resG;
        return res;
    }
    public int makeFree2(int a2, int d2, int e2, int i2){
        int part1 = d2* e2 * a2;
        int part2 = i2 * a2;
        int res = part1 + part2;
        res = - res;
        return  res;
    }
    public void getResult2(){
        int left = this.makeByX2(2, -3, 5);
        int right = this.makeFree2(2, -3, -2, -16);
        double res = right/left;
        System.out.println("x= "+res);

    }
}
public class Main {
    public static void main(String[] args) {
     Rownania row1 = new Rownania();
     row1.getResult1();
     row1.getResult2();
     //
    }
}