package Lab_11;

public class Triangle {int a,b,c;
    public Triangle(int a,int b,int c){
        this.a = a; this.b = b; this.c = c;}
    public void pr(){
        System.out.println("a = "+a+"\n"+"b = " + b + "\n"+"c = "+ c );
    }
    public int perimeter(){
        return (a+b+c);
    }
    public double square(){double p = perimeter()/2;
        return (Math.sqrt(p*(p-a)*(p-b)+(p-c)));}
    public static void main(String[] args){Triangle tr = new Triangle(3,4,5);
        tr.pr();
        System.out.println("Площадь = "+tr.square() + "\n" + "Периметр = "+tr.perimeter());
    }
}
