

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BuilderNotaFiscal {	
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private String observacao;
	private List<ItemNota> itens = new ArrayList<>();
	private double valorBruto;
	private double impostos;
	private List<AcoesAposGerarNota> listaAcoesAposGerarNota;
	
	public BuilderNotaFiscal() {
        listaAcoesAposGerarNota = new ArrayList<>();        
    }

	public BuilderNotaFiscal adicionarAcaoAposGerarNota(AcoesAposGerarNota acoes) throws Exception {
	    listaAcoesAposGerarNota.add(acoes);
	    return this;
	}
	
    public BuilderNotaFiscal paraEmpresa(String razaoSocial) throws Exception {        
		if (razaoSocial.length()>10) {
		    throw new Exception("fodeu");
		} else {		
		    this.razaoSocial = razaoSocial;
		    return this;
		}
	}
	
	public BuilderNotaFiscal paraCNPJ(String cnpj) {
		this.cnpj = cnpj;		
		return this;
	}
	
	public BuilderNotaFiscal paraDataAtual() {
		this.dataDeEmissao = LocalDate.now();
		return this;
	}
	
	public BuilderNotaFiscal comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	public BuilderNotaFiscal comItem(ItemNota itemnota) {
		this.itens.add(itemnota);
		this.valorBruto += itemnota.getValor();
		this.impostos += itemnota.getValor()*0.05;
		return this;
	}
	
	public NotaFiscal gravarNota() {	
	    NotaFiscal nf = new NotaFiscal(this.razaoSocial, this.cnpj, this.dataDeEmissao, this.valorBruto, this.impostos, this.itens, this.observacao);
		
	    this.listaAcoesAposGerarNota.forEach(acao-> acao.executaAcao(nf));
	    
		return nf;
	}
	
	
}
