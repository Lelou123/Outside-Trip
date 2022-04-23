package Trip.Cliente;

import java.util.Date;

import Trip.Bagagem.Bagagem;
import Trip.Hotel.Hotel;
import Trip.Pagamento.MetodoPagamento;
import Trip.Passagem.Passagem;

public class Cliente {
	
	private Integer Id;
	private String Name;
	private String Senha;
	private String Usuario;
	private String Email;
	private String Documento;
	private Date DataNascimento;
	private String Telefone;
	
	private MetodoPagamento MetodoP;
	private Bagagem Bagagem;
	private Hotel Hotel;
	private Passagem Passagem;
	
	
	
	
	public Cliente(Integer id, String name, String senha, String usuario, String email, String documento,
			Date dataNascimento, String telefone, MetodoPagamento metodoP, Trip.Bagagem.Bagagem bagagem,
			Trip.Hotel.Hotel hotel, Trip.Passagem.Passagem passagem) {
		super();
		Id = id;
		Name = name;
		Senha = senha;
		Usuario = usuario;
		Email = email;
		Documento = documento;
		DataNascimento = dataNascimento;
		Telefone = telefone;
		MetodoP = metodoP;
		Bagagem = bagagem;
		Hotel = hotel;
		Passagem = passagem;
	}
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
