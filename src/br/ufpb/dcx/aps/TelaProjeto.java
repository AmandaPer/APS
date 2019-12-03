package br.ufpb.dcx.aps;

public class TelaProjeto{
	
	private FabricaAbstrata fabrica;
	private Janela janela;
	private Menu menu;
	private Botao botao;

	public void montar(){
		this.janela = fabrica.criarJanela();
		this.menu = fabrica.criarMenu();
		this.botao = fabrica.criarBotao();
	}

	public String desenhar() {
		return janela.desenhar() + "{" + menu.desenhar() +", " + botao.desenhar() + "}";
	}

	public FabricaAbstrata getFabrica() {
		return fabrica;
	}

	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
	}

	public Janela getJanela() {
		return janela;
	}

	public void setJanela(Janela janela) {
		this.janela = janela;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Botao getBotao() {
		return botao;
	}

	public void setBotao(Botao botao) {
		this.botao = botao;
	}
	

}
