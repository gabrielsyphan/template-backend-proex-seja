package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		gerarAquivoSql();
	}

	private static void gerarAquivoSql() {
		System.out.println("Gerando arquivo SQL");
		File file = new File("src/main/resources/data.sql");

		if (!file.exists()) {
			criaArquivo(file);
		}

		for(int i = 1; i <= 5000; i++) {
			String sql = "INSERT INTO concentrador.mov_cad_bio_cnv\n" +
					"(dat_alt, cod_emp, cod_cnv, cod_hdw, seq, cod_loj, ori_atu, cod_usu, dig, tip_atu, dat_ult_atu)\n" +
					"VALUES('2021-09-28 09:44:09', '50', '50', 115, 1, 2, 17, 11, 0x41514141414251414141446B4141414141514153414145415A414141414141413141414141462A63436E652F344B436D786967763648346D6F304F6462396A4F6B56515A41546D4E6341374C7751526E34396D6C6753377749735A4A4B44637265397074456979756435694E704559505846766259536F534E765377664C6C5843416E59383772654A4538574344514C677A74617A634971372F6141547362376751703775513554754B5859755371586779364D484568326C6B675637334E4449324C6664516F612F2A4E554D544E71616442765873446C4A51774A48576345387231564F6D3475655879454F62316F736849383558774D7132302F6D76752A61317166534143716C6E477A514A73765579586A4F75715653653655464C4C79674468753754626479514A684E354B4453566E6D6866784B5878634C53355A43415467317274516A6545343753393247, 1, '1971-01-01 00:00:00');";
		}
	}

	private static void criaArquivo(File file) {
		System.out.println("Arquivo não existe, criando...");
		try {
			file.createNewFile();
			System.out.println("Arquivo criado com sucesso");
		} catch (Exception e) {
			System.out.println("Erro ao criar arquivo");
			e.printStackTrace();
		}
	}
}
