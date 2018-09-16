package Main;

/*
 * used to model actions to apply to generic items
 * that are not tick actions or actions derived by the
 * observation of some other object
 */

public interface ICommand {

	public void doAction();
	
}
