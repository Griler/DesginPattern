package templatemethod;

public class Football extends Game {

	@Override
	protected void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	protected void start() {
		System.out.println("Game Started. Welcome to in the chess game!");
	}

	protected @Override void end() {
		System.out.println("Game Finished!");
	}
}