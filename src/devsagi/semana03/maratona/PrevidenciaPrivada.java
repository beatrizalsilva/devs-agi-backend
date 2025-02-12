package devsagi.semana03.maratona;

import java.util.Scanner;

public class PrevidenciaPrivada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idadeAtual, idadeAposentadoria, mesesParaAposentadoria, anosParaAposentadoria;
        float contribuicaoMensal, jurosAnual, jurosMensal;
        double saldoAcumulado;
        double[] saldosAnuais;

        System.out.println("-- Simulador de Previdência Privada --");
        System.out.print("Qual a sua idade atual?: ");
        idadeAtual = input.nextInt();

        System.out.print("Quanto você quer contribuir por mês (em reais)?: ");
        contribuicaoMensal = input.nextFloat();

        System.out.print("Qual a taxa de juros anual (em porcentagem)?: ");
        jurosAnual = input.nextFloat() / 100; // converte para decimal

        System.out.print("Com que idade você deseja se aposentar?: ");
        idadeAposentadoria = input.nextInt();
        input.close();

        mesesParaAposentadoria = (idadeAposentadoria - idadeAtual) * 12;
        anosParaAposentadoria = mesesParaAposentadoria / 12;
        jurosMensal = jurosAnual / 12;

        // calcular o saldo acumulado e armazenar o valor anual em um vetor
        saldosAnuais = new double[anosParaAposentadoria];
        for (int index = 0; index < anosParaAposentadoria; index++){
            saldoAcumulado = contribuicaoMensal * (Math.pow(1 + jurosMensal, (index + 1) * 12) - 1) / jurosMensal;
            saldosAnuais[index] = saldoAcumulado;
        }
    }
}
