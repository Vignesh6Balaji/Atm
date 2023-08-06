package SatTask.Project;

public class InvalidPin extends RuntimeException{

	@Override
	public String getMessage() {
		return "Invalid pin";
	}
	
}
