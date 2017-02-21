package ua.beloff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Superhero {
		
	private int caught = 0;
	private String name = "default";
	@Autowired
	private Friend friend;
	private List <String> villains;
	
		
	public Superhero(){}

	public Superhero(int caught, String name){
		
		this.caught = caught;
		this.name = name;
		
	}
	
	public void brag() {
			
		System.out.println(name + " has caught "+ caught + " criminals. "+ friend.getName() +" helped him.");
		
	}
	
	public void showVillains(){
		
		String res = "";
		
		for(int i=0; i<villains.size(); i++){
			res += villains.get(i);
			if(i!=villains.size()-1){
				res += ", ";
			}
			else{
				res += " ";
			}
		}
		System.out.println(res+ "are still uncaught!");
	}

	public List<String> getVillains() {
		return villains;
	}

	public void setVillains(List<String> villains) {
		this.villains = villains;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}
		
}