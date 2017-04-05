package exemplos.classes;

import java.io.*;

public class LeitorDeTeclado {
	
	private BufferedReader br;

	public LeitorDeTeclado() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	private String leia(String s) {
		String string = "";
		System.out.print(s);
		try {
			string = br.readLine();
		} catch (IOException ioexception) {
			System.out.println("Erro, nao foi possivel ler...");
			System.exit(1);
		}
		return string;
	}

	public byte leiaByte(String s) {
		return Byte.parseByte(leia(s));
	}

	public int leiaInt(String s) {
		return Integer.parseInt(leia(s));
	}

	public long leiaLong(String s) {
		return Long.parseLong(leia(s));
	}

	public short leiaShort(String s) {
		return Short.parseShort(leia(s));
	}

	public double leiaDouble(String s) {
		return Double.parseDouble(leia(s));
	}

	public float leiaFloat(String s) {
		return Float.parseFloat(leia(s));
	}

	public char leiaChar(String s) {
		return leia(s).charAt(0);
	}

	public String leiaString(String s) {
		return leia(s);
	}

	public boolean leiaBoolean(String s, String msgtrue, String msgfalse) {
		return msgtrue.equalsIgnoreCase(leia(s + " " + msgtrue + " " + msgfalse));
	}
}