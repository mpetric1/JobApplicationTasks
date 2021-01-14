import java.util.Scanner;


 class Palindrom {
    public static void main(String[] args) {
        String original, obrnuto = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Unesi tekst i provjeri da li je palindrom:");
        original = in.nextLine();
        original = original.toLowerCase().replaceAll("\\W", ""); //Pretvori sve u malo i makni razmake, tocke, zareze...

        int duljina = original.length();
        for ( int i = duljina - 1; i >= 0; i-- )
            obrnuto = obrnuto + original.charAt(i);
        if (original.equals(obrnuto))
            System.out.println("Uneseni tekst JE palindrom!");
        else
            System.out.println("Uneseni tekst NIJE palindrom!");
    }
}