package New;

import java.util.List; 
import java.util.ArrayList; 
import java.util.List; 

public interface CharacterDao  
{ 
    public List<Character> getAllCharacter(); 
    public Character getCharacter(int Skills); 
    public void updateCharacter(Character Character); 
    public void deleteCharacter(Character Character); 
} 