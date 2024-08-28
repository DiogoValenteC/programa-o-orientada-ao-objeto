
class BalancoTrimestral {

        public static void main(String[] args) {
            
            int janeiro = 15000;
            int fevereiro = 23000;
            int marco = 17000;

            int GastoTrimestral = janeiro + fevereiro + marco;
            int media = GastoTrimestral / 3;

            System.out.println("media: " + media);
            System.out.println("Gasto Trimestral; " + GastoTrimestral);

        }
    
}