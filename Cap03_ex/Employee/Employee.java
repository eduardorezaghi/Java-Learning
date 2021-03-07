// Fatura (Invoice) Class declaration

/*
3.13 (Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de
teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee.
*/

public class Employee {
	String nomeFunc;    // variável de instância
	String sobrenomeFunc; // variável de instância
	double salarioMensal;   // variável de instância

	// construtor padrão da classe employee
	public Employee(){};
	// construtor da classe employee
	public Employee(String nom, String sob, double slr)
	{
		this.nomeFunc = nom;
		this.sobrenomeFunc = sob;
		if (slr > 0)
			this.salarioMensal = slr;	
	}

	public void setNomeFunc(String nome)
	{
		this.nomeFunc = nome;
	}
	public String getNomeFunc()
	{
		return nomeFunc;
	}

	public void setsobrenomeFunc(String sobrenome)
	{
		this.sobrenomeFunc = sobrenome;
	}
	public String getSobrenomeFunc()
	{
		return sobrenomeFunc;
	}

	public void setSalarioMensal(double salario)
	{
		this.salarioMensal = salario;
	}
	public double getSalarioMensal()
	{
		return salarioMensal;
	}

}
