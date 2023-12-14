package Lab_11;

public class Rectangle {
    int a,b;
    public Rectangle(int a,int b){this.a = a; this.b = b;}
    public void pr(){System.out.println("a = "+a+"\n"+"b = " + b);}
    public int perimeter(){return ((a+b)*2);}
    public double square(){return (a*b);}
    public static void main(String[] args){Rectangle rc = new Rectangle(3,4);
        rc.pr();
        System.out.println("Площадь = "+rc.square() + "\n" + "Периметр = "+rc.perimeter());
    }
}
