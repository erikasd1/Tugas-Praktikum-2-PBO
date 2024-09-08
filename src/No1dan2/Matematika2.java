package No1dan2;

public class Matematika2 implements InterfaceMatematika2{
    int a, b;
    int pertambahan, pengurangan, perkalian, pembagian;
    
    public Matematika2(int a, int b){
        this.a = a;
        this.b = b;
        this.pertambahan = a + b;
        this.pengurangan = a - b;
        this.perkalian = a * b;
        this.pembagian = a / b;
    }
    public int getPertambahan(){
        return pertambahan;
    }
    public int getPengurangan(){
        return pengurangan;
    }
    public int getPerkalian(){
        return perkalian;
    }
    public int getPembagian(){
        return pembagian;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}
