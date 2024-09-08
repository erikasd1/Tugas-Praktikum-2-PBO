package No1dan2;

public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika2 matematika1 = new Matematika2(20, 10);
        System.out.println("Pertambahan: " +matematika1.getA()+ " + " +matematika1.getB()+ " = " +matematika1.getPertambahan());
        
        Matematika2 matematika2 = new Matematika2(10, 5);
        System.out.println("Pengurangan: " +matematika2.getA()+ " - " +matematika2.getB()+ " = " +matematika2.getPengurangan());
        
        Matematika2 matematika3 = new Matematika2(10, 3);
        System.out.println("Perkalian: " +matematika3.getA()+ " * " +matematika3.getB()+ " = " +matematika3.getPerkalian());
        
        Matematika2 matematika4 = new Matematika2(21, 2);
        System.out.println("Pembagian: " +matematika4.getA()+ " / " +matematika4.getB()+ " = " +matematika4.getPembagian());
    }
}
