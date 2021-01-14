import java.util.Scanner;


 class KamenSkarePapir {
    public static void main(String[] args) {

        //inicijalizacija i welcome msg
        Scanner in = new Scanner(System.in);
        System.out.println("Dobrodošli na igru kamen, škare, papir!");
        int korRez =0;
        int racRez =0;

        //Koristi while(true) petlju i prekida samo ako korisnik unese izlaz

        while(true) {

            //dohvaća korisnikov potez
            System.out.print("Koji je vaš potez? Upišite kamen skare ili papir. Za izlaz upišite izlaz. \n");
            String mojPotez = in.nextLine();

            //Provjerava da li korisnik želi izaći
            if(mojPotez.equals("izlaz")) {
                break;
            }

            //provjera je li korisnikov potez ispravan
            if(!mojPotez.equals("kamen") && !mojPotez.equals("papir") && !mojPotez.equals("skare")) {

                System.out.println("Upisali ste krivi izraz!");

            } else {
                //Dohvati random broj između 0 i 3 i spremi ga kao int tako da su mu mogućnosti samo 0, 1 i 2

                int rand = (int)(Math.random()*3);

                //Random broj pretvara u string i ispisuje
                String racPotez = "";
                if(rand == 0) {
                    racPotez = "kamen";
                } else if(rand == 1) {
                    racPotez = "papir";
                } else {
                    racPotez = "skare";
                }
                System.out.println("Potez računala: " + racPotez);

                //print rezultata igre
                if(mojPotez.equals(racPotez)) {
                    System.out.println("Nerješeno!");
                } else if((mojPotez.equals("kamen") && racPotez.equals("skare")) || (mojPotez.equals("skare") && racPotez.equals("papir")) || (mojPotez.equals("papir") && racPotez.equals("kamen"))) {
                    System.out.println("Dobili ste rundu!");
                    korRez++;
                } else {
                    System.out.println("Izgubili ste rundu!");
                    racRez++;
                }

            }

        }

        //Print izlaza iz igre
        System.out.println("Rezultati:");
        System.out.println("Korisnik: "+ korRez + " Računalo: "+ racRez);
        System.out.println("Hvala vam na sudjelovanju!");

    }
}