package Desafio_Interfaces_Funcionais;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioInterfacesFuncionais {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João", new BigDecimal(19000), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal(5000), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal(13000), false));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal(12000), true));

        // TODO remover funcionarios inativos
        // Passo a passo - com lambda
        Predicate<Funcionario> predicateInativo = funcionario -> funcionario.isInativo();
        funcionarios.removeIf(predicateInativo);

        // Passo a passo - com method reference
        Predicate<Funcionario> predicateInativoMR = Funcionario::isInativo;
        funcionarios.removeIf(predicateInativoMR);

        // Expressão lambda
        funcionarios.removeIf(funcionario -> funcionario.isInativo());

        // Method Reference
        funcionarios.removeIf(Funcionario::isInativo);

        // TODO ordenar funcionarios pelo valor do salario
        // Passo a passo - com lambda
        Function<Funcionario, BigDecimal> functionSalario = funcionario -> funcionario.getSalario();
        funcionarios.sort(Comparator.comparing(functionSalario));

        // Passo a passo - com method reference
        Function<Funcionario, BigDecimal> functionSalarioMR = Funcionario::getSalario;
        funcionarios.sort(Comparator.comparing(functionSalarioMR));

        // Expressão lambda
        funcionarios.sort(Comparator.comparing(funcionario -> funcionario.getSalario()));

        // Method Reference
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

        // TODO iterar e imprimir funcionarios usando o metodo estático imprimir
        // Passo a passo - com lambda
        Consumer<Funcionario> consumerFuncionario = funcionario -> imprimir(funcionario);
        funcionarios.forEach(consumerFuncionario);

        // Passo a passo - com method reference
        Consumer<Funcionario> consumerFuncionarioMR = DesafioInterfacesFuncionais::imprimir;
        funcionarios.forEach(consumerFuncionarioMR);

        // Expressão lambda
        funcionarios.forEach(funcionario -> imprimir(funcionario));

        // Method Reference
        funcionarios.forEach(DesafioInterfacesFuncionais::imprimir);
    }

    private static void imprimir(Funcionario funcionario) {
        System.out.printf("Nome: %s, Salário: R$ %.2f, Valor do imposto: R$ %.2f\n",
                funcionario.getNome(),
                funcionario.getSalario(),
                funcionario.getSalario()
                        .multiply(BigDecimal.valueOf(20))
                        .divide(BigDecimal.valueOf(100), RoundingMode.UNNECESSARY));
    }
}
