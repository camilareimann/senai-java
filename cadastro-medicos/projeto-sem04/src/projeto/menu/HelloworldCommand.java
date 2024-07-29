package projeto.menu;

public class HelloworldCommand implements BaseCommand {

	@Override
	public void Execute() {
		System.out.println("Hello word!");
	}

	@Override
	public String CommandName() {
		return "Print Hello World!";
	}

}
