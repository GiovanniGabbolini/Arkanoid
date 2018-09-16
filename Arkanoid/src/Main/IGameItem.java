package Main;

public interface IGameItem {

	public void tick();

	public void draw();	
	
	public IModelGameItem getState();
	
	public void setState(IModelGameItem gameItemModel);
	
}
