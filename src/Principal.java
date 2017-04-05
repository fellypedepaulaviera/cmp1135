package exemplos;

public class Principal 
{
	public static void main(String[] args) 
	{
		System.out.println("Codigo ASCII : "+args[0]);
		byte codigoAsc = Byte.valueOf(args[0]).byteValue();
		char letra = (char) codigoAsc;
		System.out.println("O codigo ASCII: " + codigoAsc + 
				" = ao caracter = " + letra);
	}
}
