package Trip.Pagamento;

import java.util.Date;

import Trip.Cliente.Cliente;

public class MetodoPagamento {
	private Cliente Cliente;
	private String NumeroCC;
	private String CVV;
	private Date DataValidade;
	
	
	
	
	public MetodoPagamento(Trip.Cliente.Cliente cliente, String numeroCC, String cVV, Date dataValidade) {
		super();
		Cliente = cliente;
		NumeroCC = numeroCC;
		CVV = cVV;
		DataValidade = dataValidade;
	}
	
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public String getNumeroCC() {
		return NumeroCC;
	}
	public void setNumeroCC(String numeroCC) {
		NumeroCC = numeroCC;
	}
	public String getCVV() {
		return CVV;
	}
	public void setCVV(String cVV) {
		CVV = cVV;
	}
	public Date getDataValidade() {
		return DataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		DataValidade = dataValidade;
	}
	
	
	
	public void CadastrarPagamento(MetodoPagamento metodo)
	{
		
	}
	public void ExcluirMPagamento(MetodoPagamento metodo)
	{
		
	}
	
	
}
