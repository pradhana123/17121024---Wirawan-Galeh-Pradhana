package Game;

public class Software{
	protected String code, namagame, lisensi;

	public Software(){

	}

	public Software(String kode, String game, String lisen){
		this.code = kode;
		this.namagame = game;
		this.lisensi = lisen;
	}

	public void setCode(String kode){
		this.code = kode;
	}

	public String getCode(){
		return code;
	}

	public void setNamagame(String game){
		this.namagame = game;
	}

	public String getNamagame(){
		return namagame;
	}

	public void setLisensi(String lisen){
		this.lisensi = lisen;
	}

	public String getLisensi(){
		return lisensi;
	}
}