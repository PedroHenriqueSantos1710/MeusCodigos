public class vetor {
    public static void main(String[] args) {
        

        String[][] tabela = {
            {"Rosa Alves", "1.200.00"},
            {"Pedro da silva", "1.345.00"},
            {"ana souza", "9.000.00"},
            {"luis pires", "5.500.00"},
            {"Santra Rios ", "9.000.00"}
        };
        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Nome: " + tabela[i][0]);
            System.out.println("Valor: " + tabela[i][1]);
            System.out.println("-----");
            System.out.println("Maior valor: "  );
        } 

        
    }
}
