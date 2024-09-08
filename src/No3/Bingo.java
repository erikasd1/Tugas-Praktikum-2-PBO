package No3;

public class Bingo {
    String verse1;
    String verse2;
    String clapped0;
    String clapped1;
    String clapped2;
    String clapped3;
    String clapped4;
    String clapped5;

    public Bingo() {
        this.verse1 = "There was a farmer who had a dog,";
        this.verse2 = "And Bingo was his name-o.";
        this.clapped0 = "B-I-N-G-O";
        this.clapped1 = "(CLAP)-I-N-G-O";
        this.clapped2 = "(CLAP)-(CLAP)-N-G-O";
        this.clapped3 = "(CLAP)-(CLAP)-(CLAP)-G-O";
        this.clapped4 = "(CLAP)-(CLAP)-(CLAP)-(CLAP)-O";
        this.clapped5 = "(CLAP)-(CLAP)-(CLAP)-(CLAP)-(CLAP)";
    }

    void printVerse(String clapped) {
        System.out.println(verse1);
        System.out.println(verse2);
        System.out.println(clapped);
        System.out.println(clapped);
        System.out.println(clapped);
        System.out.println(verse2);
        System.out.println();
    }

    public void printSong() {
        printVerse(clapped0);
        printVerse(clapped1);
        printVerse(clapped2);
        printVerse(clapped3);
        printVerse(clapped4);
        printVerse(clapped5);
        
    }

}

