// Exercício 9.15 - Hierarquia Employee 2
// Classe Employee -> HourlyEmployee - subclasse direta

public class HourlyEmployee extends Employee {
    private double salario;
    private double horas;

    public HourlyEmployee(String nome, String sobrenome, String segSocial, double salario, double horas) {
        super(nome, sobrenome, segSocial);
        if (salario < 0.0)
            throw new IllegalArgumentException("salário base deve ser maior que zero");
        if (horas < 0.0)
            throw new IllegalArgumentException("horas não podem ser negativas");

        this.salario = salario;
        this.horas = horas;
    }

    public void setSalario(double salario) {
        if (salario < 0.0) throw new IllegalArgumentException("salário base deve ser maior que zero");
        this.salario = salario;
    }
    public void setHoras(double horas) {
        if (horas < 0.0) throw new IllegalArgumentException("horas não podem ser negativas");
        else if (horas > 168.0) throw new IllegalArgumentException("horas não podem passar do limite por semana");
        this.horas = horas;
    }
    
    public double getSalario(){return salario;}
    public double getHoras(){return horas;}

    public double earnings(){
        return salario*horas;
    }

    @Override
    public String toString(){
        return String.format("%s%s: %s%n%s: %s%n", super.toString(),
        "Salário do empregado", earnings(),
        "Horas trabalhadas do empregado", getHoras()
        );
    }
}
