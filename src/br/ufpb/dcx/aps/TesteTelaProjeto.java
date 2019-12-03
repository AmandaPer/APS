package br.ufpb.dcx.aps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTelaProjeto {

	@Test
	public void testWindows() {
		TelaProjeto T = new TelaProjeto();
		T.setFabrica(new FabricaWindows());
		T.montar();
		assertEquals("JanelaWindows{menuWindows, botaoWindows}",T.desenhar());
	}
	
	@Test
	public void testAndroid() {
		TelaProjeto T = new TelaProjeto();
		T.setFabrica(new FabricaAndroid());
		T.montar();
		assertEquals("JanelaAndroid{menuAndroid, botaoAndroid}",T.desenhar());
	}
}
