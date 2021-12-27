package quanlyxe;

import java.util.Scanner;

public class QuanLy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Xe xe1 = new XeDap(1,"California R570","California","USA",4570000);
		xe1.hienthi();
		Xe xe2 = new XeMay(2,"Honda Wave Alpha","Honda","China",18500000);
		xe2.hienthi();
		Xe xe3 = new XeOTo(3,"Vinfast President 2022","Vinfast","Vietnam",380000000);
		xe3.hienthi();
	}
}
