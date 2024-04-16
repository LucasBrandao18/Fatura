import javax.management.ValueExp;

/*Crie uma classe chamada Fatura que possa ser utilizado por uma loja de suprimentos de informática para representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:
o número do item faturado,
a descrição do item,
a quantidade comprada do item e
o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. Forneça os métodos get/set para cada variável de instância. Além disso, forneça um método chamado calcular_valor_fatura que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor. Escreva também um programa de teste (main) que demonstra as capacidades da classe Fatura.*/

  class Fatura{
  private int numero, quantidade;
  private String descricao;
  private double preco;

    public int id{
      get {return numero;}
      set {numero = value;}  
    }
    public string info{
      get {return quantidade;} 
      set {quantidade = value;}  
    }
    public int qntd{
      get {return quantidade;}
      set{
        if (value < 0) {
        } 
          quantidade = 0;
        }else{quantidade =value;}
      }
    }
    public double pri{
    get {return preco;}
    set{
      if (value < 0){
        preco = 0.0;
      }else{preco = value;}
    }
    
//Inicializar produto
    private void inicializarFatura(int numero, String descricao, int quantidade, double preco){

      id = numero;
      info = descricao;
      qntd = quantidade;
      pri = preco;
    }
      
public void imprimir(){
  System.out.println("Número:  " + this.numero);
  System.out.println("Descrição:  " + this.descricao);
  System.out.println("Quantidade: " + this.quantidade);
  System.out.println("Preço: " + this.preco);
  }

//metodo de calculo do valor da fatura
public double calcular_valor_fatura(){
  double valorFatura = this.preco * this.quantidade;
  System.out.println ("Valor da fatura: {0} ", valorFatura");
    return valorFatura;
  }
}

  
