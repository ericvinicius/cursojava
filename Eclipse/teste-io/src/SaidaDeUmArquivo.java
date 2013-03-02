import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SaidaDeUmArquivo {
	public static void main(String[] args) throws IOException{
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null){
			System.out.println(linha);
			linha = br.readLine();
		}

		OutputStream os = new FileOutputStream("Saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner entrada = new Scanner(is);
		
		while(entrada.hasNextLine()){
			String line = entrada.nextLine();
			bw.write(line);
			bw.newLine();
		}
		bw.close();
	}
}
