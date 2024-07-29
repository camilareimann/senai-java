package projeto.menu;

public class QuitCommand implements BaseCommand {

	@Override
	public String CommandName() {
		return "Sair";
	}

	@Override
	public void Execute() {
		System.out.println("Saindo do sistema");
		System.exit(0);
	}

}
