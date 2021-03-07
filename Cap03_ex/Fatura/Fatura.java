// Fatura (Invoice) Class declaration

// 3.12 (Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
// fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
// número (tipo String), a descricao (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
// classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de ins-
// tância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
// preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço
// por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
// capacidades da classe Invoice.

public class Fatura {
    String numero;    // variável de instância
    String descricao; // variável de instância
    int qntItem;      // variável de instância
    double prcItem;   // variável de instância

    // construtor padrão da classe fatura
    public Fatura(){};
    // construtor da classe fatura
    public Fatura(String num, String desc, int qntI, double prcI)
    {
        this.numero = num;
        this.descricao = desc;
        if (qntI > 0 || prcI > 0)
        {
            this.qntItem = qntI;
            this.prcItem = prcI;
        }
    }

    // retorna o nº da fatura
    public String getNumFatura()
    {
        return numero;
    }
    // atribui o nº da fatura
    public void setNumFatura(String num)
    {
        this.numero	= num;
    }

    // retorna a descricao da fatura
    public String getDescFatura()
    {
        return descricao;
    }
    // atribui a descricao da fatura
    public void setDescFatura(String desc)
    {
        this.descricao	= desc;
    }
    
    // retorna a quantidade de itens na fatura
    public int getQntItem()
    {
        return qntItem;
    }
    // atribui a quantidade de itens na fatura
    public void setQntItem(int qntI)
    {
        this.qntItem = qntI;
    }

    // retorna o preço do item na fatura
    public double getPrcItem()
    {
        return prcItem;
    }
    // atribui o preço do item na fatura
    public void setPrcItem(double prcI)
    {
        this.prcItem = prcI;
    }


    // retorna o valor total da fatura
    public double getFaturaValor(int qntd, double preco)
    {
        if (qntd < 0 || preco < 0)
        {
            qntd = 0;
            preco = 0.0;
        }
        return qntd * preco;
    }
}
