package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Realme XT");
	}
	private void phoneMieiNum() {
		System.out.println("AXZ6501255868635");
		System.out.println("Ramarajan");
		System.out.println("Kumar");
		System.out.println("sivaraman");
	}
	private void camera() {
		System.out.println("240 Px");
	}
	private void storage() {
		System.out.println("120 Gb");
	}
	private void OsName() {
		System.out.println("Android 11");
	}
	public static void main(String[]arg) {
		PhoneInfo phoneSpec=new PhoneInfo();
		phoneSpec.phoneName();
		phoneSpec.phoneMieiNum();
		phoneSpec.camera();
		phoneSpec.storage();
		phoneSpec.OsName();
	}
}

