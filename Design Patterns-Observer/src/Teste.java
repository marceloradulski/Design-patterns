
public class Teste {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            NotaFiscal nf = new BuilderNotaFiscal().          
                                paraCNPJ("0544787979").
                                paraEmpresa("EMPRESA SAASFASFASF").
                                paraDataAtual().
                                comObservacao("observacao").
                                comItem(new ItemNota("Item 1", 500)).
                                comItem(new ItemNota("Item 2", 300.00)).
                                adicionarAcaoAposGerarNota(new ImprimeNF()).
                                adicionarAcaoAposGerarNota(new EnviaXMLNF()).
                                gravarNota();
            System.out.println(nf.getValorBruto());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("não gravou."+e.getMessage());
        }
       
    }
    
    

}
