/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3a;

/**
 *
 * @author WINDOWS 10
 */
public class praktikum1b {
    
	public static void main(String[] args) {
		Bus3 Bus = new Bus3(25);
		Bus.getpenumpang(17);
		Bus.getpenumpang(24);
		Bus.cetakpenumpang();
		// penambahan penumpang
		Bus.addpenumpang(10);
		Bus.cetakpenumpang();
		// penambahan penumpang
		Bus.addpenumpang(10);
		Bus.cetakpenumpang();
		// penambahan penumpang
		Bus.addpenumpang(10);
		Bus.cetakpenumpang();
		// penambahan penumpang
		Bus.addpenumpang(5);
		Bus.cetakpenumpang();
		
		System.out.println("--------------------------------------------");
		Bus.cetak();

	}
}

