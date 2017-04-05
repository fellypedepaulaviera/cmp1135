package exemplos.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Teclado {

	private static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	
	private static String[] tipos = {"STRING", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE"};

	private static enum TIPO {
		STRING, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE
	};

	private static String string;
	private static String mensagem;

	private static String leia(TIPO tipo, String msg) {
		System.out.println(msg);
		return leia(tipo);
	}
	
	private static String leia(TIPO tipo) {

		while (true) {
			if (mensagem != null) {
				System.out.println(mensagem);
			}
			try {
				string = br.readLine();
				// Se nao String e nao digitou nada, entao retorne "0"
				if (tipo != TIPO.STRING && string.equals("")) {
					string = "0";
				}
				switch (tipo) {
				case STRING:
					return string;
				case BYTE:
					return String.valueOf(Byte.parseByte(string));
				case SHORT:
					return String.valueOf(Short.parseShort(string));
				case INT:
					return String.valueOf(Integer.parseInt(string));
				case LONG:
					return String.valueOf(Long.parseLong(string));
				case FLOAT:
					return String.valueOf(Float.parseFloat(string));
				case DOUBLE:
					return String.valueOf(Double.parseDouble(string));
				default:
					return string;
				}
			} catch (IOException ioe) {
				System.out.println("Erro, " + ioe.getMessage());
				System.exit(0);
			} catch (Exception ex) {
				System.out.println("Erro! Digite novamente um dado do tipo "+tipos[tipo.ordinal()]);
			}
		}
	}

	// Sem mensagens
	
	public static String leiaString() {
		return leia(TIPO.STRING);
	}

	public static byte leiaByte() {
		return Byte.parseByte(leia(TIPO.BYTE));
	}

	public static short leiaShort() {
		return Short.parseShort(leia(TIPO.SHORT));
	}

	public static int leiaInt() {
		return Integer.parseInt(leia(TIPO.INT));
	}

	public static long leiaLong() {
		return Long.parseLong(leia(TIPO.LONG));
	}

	public static float leiaFloat() {
		return Float.parseFloat(leia(TIPO.FLOAT));
	}

	public static double leiaDouble() {
		return Double.parseDouble(leia(TIPO.DOUBLE));
	}
	
	// Com mensagens
	
	public static String leiaString(String msg) {
		return leia(TIPO.STRING, msg);
	}

	public static byte leiaByte(String msg) {
		return Byte.parseByte(leia(TIPO.BYTE, msg));
	}

	public static short leiaShort(String msg) {
		return Short.parseShort(leia(TIPO.SHORT, msg));
	}

	public static int leiaInt(String msg) {
		return Integer.parseInt(leia(TIPO.INT, msg));
	}

	public static long leiaLong(String msg) {
		return Long.parseLong(leia(TIPO.LONG, msg));
	}

	public static float leiaFloat(String msg) {
		return Float.parseFloat(leia(TIPO.FLOAT, msg));
	}

	public static double leiaDouble(String msg) {
		return Double.parseDouble(leia(TIPO.DOUBLE, msg));
	}

}