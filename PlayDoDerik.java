package aula11_10_22;

public class PlayDoDerik implements IPlay {

	@Override
	public void start() {
		System.out.println("\n");
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == j || i + j == (7 + 7 - (7 - 1))) {
					System.out.print(" # ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void back(int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fabricante() {
		// TODO Auto-generated method stub
		return "Derik exemplo:";
	}

	
}
