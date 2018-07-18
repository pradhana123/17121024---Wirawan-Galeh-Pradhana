package Game;

public class Game extends Software{
	protected String jenis;
	protected String type;

	public Game(String kode, String nama, String lisen){
		super(kode, nama, lisen);
	}

	public Game(String jns, String tipe){
		this.jenis = jns;
		this.type = tipe;
		super.setCode(code);
		super.setNamagame(namagame);
		super.setLisensi(lisensi);
	}

	public String getCod(){
		return super.getCode();
	}

	public String getNama(){
		return super.getNamagame();
	}

	public String getLis(){
		return super.getLisensi();
	}

	public String getJenis(){
		return jenis;
	}

	public String getType(){
		return type;
	}
}