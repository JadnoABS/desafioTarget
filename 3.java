class AnalisadorDeFaturamento {

    public static double getMenorValor(List<Double> faturamento) {
        double menorFaturamento = faturamento.get(0);
        for(double valorDia : faturamento) {
            if(valorDia <= 0) continue;
            if(valorDia < menorFaturamento) menorFaturamento = valorDia;
        }

        return menorFaturamento;
    }
    
    public static double getMaiorValor(List<Double> faturamento) {
        double maiorFaturamento = faturamento.get(0);
        for(double valorDia : faturamento) {
            if(valorDia > maiorFaturamento) maiorFaturamento = valorDia;
        }

        return maiorFaturamento;
    }

    public static int getNumeroDeDiasSuperiorAMedia(List<Double> faturamento) {
        double soma = 0;
        int numeroDeDiasUteis = 0;
        for(double valorDia : faturamento) {
            if(valorDia > 0) {
                soma += valorDia;
                numeroDeDiasUteis++;
            }
        }

        double media = soma / numeroDeDiasUteis;
        int numeroDeDiasAcimaDaMedia = 0;
        for(double valorDia : faturamento) {
            if(valorDia > media) numeroDeDiasAcimaDaMedia++;
        }

        return numeroDeDiasAcimaDaMedia;
    }

}