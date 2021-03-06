import info.gridworld.actor.ActorWorld; 
import info.gridworld.grid.Location; 
import java.awt.Color; 
public class DancingBugRunner 
{ 
    public static void main(String[] args) 
    { 
	ActorWorld world = new ActorWorld(); 
	int[] turns = {2,2,1,3}; 
	DancingBug ballerina = new DancingBug(turns); 
	ballerina.setColor(Color.ORANGE); 
	ZBug zach = new ZBug(5);
	world.add(new Location(9, 9), ballerina); 
	world.add(new Location(2, 1), zach);
	world.show(); 
    } 
} 
