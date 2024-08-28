class TesteIdade {
    public static void main (String[] args) {
        int idade;
        idade = 18;

        int IdadeNoAnoQueVem = idade + 1;

        double MetadeIdade = idade / 2.0;
        
        double DobroIdade = idade * 2.0;

        boolean MaiorIdade = idade >= 18;

        char TipoSangue = 'O';

        boolean tipoSangue = 'O' == 'o';

        int i = 5;
        int j = i;
        i = i + 1;

        System.out.println(idade);
        System.out.println(IdadeNoAnoQueVem);
        System.out.println(MetadeIdade);
        System.out.println(DobroIdade);
        System.out.println(MaiorIdade);
        System.out.println(TipoSangue);
        System.out.println(tipoSangue);
        System.out.println(i);
        System.out.println(j);
    }
}