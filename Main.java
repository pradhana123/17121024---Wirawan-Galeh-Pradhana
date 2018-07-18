package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String code;
		String nama;
		String jenis;
		String tipe;
		String lisen;
		int pilihan;

		Game print = new Game("","");
		Game $print = new Game("","","");

		System.out.println("-------Game Pertama-------");
		System.out.println("==========================");

			System.out.println("Kode Game: ");
			print.code = code = input.readLine();
			System.out.println("Nama: ");
			print.namagame = nama = input.readLine();
			System.out.println("Jenis: ");
			print.jenis = jenis = input.readLine();
			System.out.println("Type: ");
			print.type = tipe = input.readLine();
			System.out.println("Lisensi: ");
			print.lisensi = lisen = input.readLine();
			System.out.println("");

		System.out.println("-------Game Kedua-------");
		System.out.println("==========================");

			System.out.println("Kode Game: ");
			$print.code = code = input.readLine();
			System.out.println("Nama: ");
			$print.namagame = nama = input.readLine();
			System.out.println("Jenis: ");
			$print.jenis = jenis = input.readLine();
			System.out.println("Type: ");
			$print.type = tipe = input.readLine();
			System.out.println("Lisensi: ");
			$print.lisensi = lisen = input.readLine();
			System.out.println("");


			System.out.println("Lihat Data");
			System.out.println("1. Data Pertama\n"
				+ "2. Data Kedua\n"
				+ "0. Exit");
			System.out.println("Masukkan Pilihan: ");

			pilihan = Integer.parseInt(input.readLine());

			while(pilihan!=0){
				switch(pilihan){
					case 1:
					System.out.println("Rincian Game" +print.getNama());
					System.out.println("==============================");
					System.out.println("Kode Game: "+print.getCod());
					System.out.println("-----------------");
					System.out.println("Nama Game: "+print.getNama());
					System.out.println("-----------------");
					System.out.println("Jenis Game: "+print.getJenis());
					System.out.println("-----------------");
					System.out.println("Type Game: "+print.getType());
					System.out.println("-----------------");
					System.out.println("Lisensi Game: "+print.getLis());
					System.out.println("-----------------");
					break;

					case 2:
					System.out.println("Rincian Game" +$print.getNama());
					System.out.println("==============================");
					System.out.println("Kode Game: "+$print.getCod());
					System.out.println("-----------------");
					System.out.println("Nama Game: "+$print.getNama());
					System.out.println("-----------------");
					System.out.println("Jenis Game: "+$print.getJenis());
					System.out.println("-----------------");
					System.out.println("Type Game: "+$print.getType());
					System.out.println("-----------------");
					System.out.println("Lisensi Game: "+$print.getLis());
					System.out.println("-----------------");
					break;
				default: 
				}

				System.out.println("Lihat Data");
				System.out.println("1. Data Pertama\n"
					+ "2. Data Kedua\n"
					+ "0. Exit");
				System.out.println("Masukkan pilihan: ");
				pilihan = Integer.parseInt(input.readLine());
			}
	}
}