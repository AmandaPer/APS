package br.ufpb.dcx.aps;

public class FabricaWindows implements FabricaAbstrata {

	@Override
	public Janela criarJanela() {
		return new JanelaWindows();
	}

	@Override
	public Menu criarMenu() {
		return new MenuWindows();
	}

	@Override
	public Botao criarBotao() {
		return new BotaoWindows();
	}

}
