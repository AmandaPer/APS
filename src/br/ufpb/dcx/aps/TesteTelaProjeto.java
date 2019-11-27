package br.ufpb.dcx.aps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTelaProjeto {

	@Test
	public void test1() {
		TelaProjeto T = new TelaProjeto();
		T.setFabrica(new FabricaWindows());
		T.montar();
		assertEquals("Janela Windows{menuWindows, botaoWindows}",T.desenhar());
	}

}
