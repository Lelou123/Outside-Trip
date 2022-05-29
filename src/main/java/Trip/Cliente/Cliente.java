package Trip.Cliente;

import java.util.Date;

import Trip.Bagagem.Bagagem;
import Trip.Hotel.Hotel;
import Trip.Pagamento.MetodoPagamento;
import Trip.Passagem.Passagem;

public class Cliente {
	
	private Integer IdCliente;
	private String NomeCompleto;
	private Date DataNascimento;
	private String Email;
	private String Telefone;
	private String Documento;
	private String Usuario;
	private String Senha;
	
	private MetodoPagamento MetodoP;
	private Bagagem Bagagem;
	private Hotel Hotel;
	private Passagem Passagem;
	
	
	
	
	public Cliente(Integer idCliente, String nomeCompleto, Date dataNascimento,  String email, String telefone, String documento, String usuario, String senha, 
			  MetodoPagamento metodoP, Trip.Bagagem.Bagagem bagagem,
			Trip.Hotel.Hotel hotel, Trip.Passagem.Passagem passagem) {
		super();
		IdCliente = idCliente;
		NomeCompleto = nomeCompleto;
		DataNascimento = dataNascimento;
		Email = email;
		Telefone = telefone;
		Documento = documento;
		Usuario = usuario;
		Senha = senha;
		MetodoP = metodoP;
		Bagagem = bagagem;
		Hotel = hotel;
		Passagem = passagem;	
	}
	
	


	public Cliente(String nomeCompleto, Date dataNascimento,String email, String telefone, String documento,  
			String usuario, String senha
			 ) {
		super();
		
		NomeCompleto = nomeCompleto;
		DataNascimento = dataNascimento;
		Email = email;
		Telefone = telefone;		
		Documento = documento;		
		Usuario = usuario;
		Senha = senha;
	}
	public Integer getIdCliente() {
		return IdCliente;
	}
	public Integer getId() {
		return IdCliente;
	}
	public Cliente(Integer idCliente) {
		IdCliente = idCliente;
	}
	public String getNomeCompleto() {
		return NomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDocumento() {
		return Documento;
	}
	public void setDocumento(String documento) {
		Documento = documento;
	}
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public MetodoPagamento getMetodoP() {
		return MetodoP;
	}
	public void setMetodoP(MetodoPagamento metodoP) {
		MetodoP = metodoP;
	}
	public Bagagem getBagagem() {
		return Bagagem;
	}
	public void setBagagem(Bagagem bagagem) {
		Bagagem = bagagem;
	}
	public Hotel getHotel() {
		return Hotel;
	}
	public void setHotel(Hotel hotel) {
		Hotel = hotel;
	}
	public Passagem getPassagem() {
		return Passagem;
	}
	public void setPassagem(Passagem passagem) {
		Passagem = passagem;
	}
	
	
	public void CadastrarCliente(Cliente cliente)
	{
		
	}
}
