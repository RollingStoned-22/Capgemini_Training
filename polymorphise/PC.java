package one_to_many;

public class PC {
	String user_name;
	Component components[];
	public int count = 0;
	
	public PC(String user_name,int size ) {
		this.user_name = user_name;
		this.components = new Component[size];
	}
	
	public void addComponent(Component component) {
		if(count < components.length){
			components[count++] = component;
			System.out.println("New Component added");
		}
	}
	
	public void displayComponents() {
		for(int i = 0; i < count; i++)
			System.out.println(this.user_name+"\t"+components[i].name+"\t"+components[i].price);
	}
	
}
