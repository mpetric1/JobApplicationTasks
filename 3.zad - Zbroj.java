class NizBrojeva{
    public static void main(String[] args){

        int[] N = {2,5,1,15};
        int B = 11;

        NizBrojeva m = new NizBrojeva();
        System.out.println("Korišteno brojeva: " + m.nZamjena(N, B)
                + "\nZadana vrijednost: " + B);
    }

    int nZamjena(int[] N, int B){

        int ukupnoN = N.length;

        // Array koji sprema podprobleme
        double[][] arr = new double[ukupnoN + 1][B + 1];

        // Inicijalizacija pozitivnog
        for(int j = 0; j <= B; j++){
            arr[0][j] = Double.POSITIVE_INFINITY;
        }

        // Inicijalizacija prvog reda = 0
        for(int i = 1; i <= ukupnoN; i++){
            arr[i][0] = 0;
        }

        // Rekurzija
        for(int i = 1; i <= ukupnoN; i++){
            for(int j = 1; j <= B; j++){
                if(N[i - 1] <= j)
                    arr[i][j] = min(1 + arr[i][j - N[i - 1]], arr[i - 1][j]);

                else
                    arr[i][j] = arr[i - 1][j];
            }
        }
        if ((int)arr[ukupnoN][B] > B ){
            return -1;
        }else
            return (int)arr[ukupnoN][B];
    }

    // Pomoc rekurziji
    double min(double a, double b){
        if(a <= b){
            return a;
        }
        else{
            return b;
        }
    }
}