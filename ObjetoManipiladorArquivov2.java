package POO.arquivos;

import java.io.IOException;
import java.util.Scanner;

public class ObjetoManipiladorArquivov2 {

	public static void main(String args[]) throws IOException {
		String path = "c:\\tmp\\file.doc";
		

		ManipuladorArquivo.escritor(path);
		ManipuladorArquivo.leitor(path);
	}

}

