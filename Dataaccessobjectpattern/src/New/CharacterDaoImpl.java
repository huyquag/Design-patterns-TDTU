package New;

import java.util.List; 
import java.util.ArrayList; 
import java.util.List; 
  
public class CharacterDaoImpl implements CharacterDao  
{ 
    List<Character> Characters; 
  
    public CharacterDaoImpl() 
    { 
        Characters = new ArrayList<Character>(); 
        Character Character1 = new Character("Doncic",0); 
        Character Character2 = new Character("LebronJames",2); 
        Characters.add(Character1); 
        Characters.add(Character2);      
    } 

    public void deleteCharacter(Character Character)  
    { 
        Characters.remove(Character.getSkills()); 
        System.out.println("Skills " + Character.getSkills() + ", Xoa khoi CSDL"); 
    } 

    public List<Character> getAllCharacter()  
    { 
        return Characters; 
    } 
  

    public Character getCharacter(int Skills)  
    { 
        return Characters.get(Skills); 
    } 
  

    public void updateCharacter(Character Character)  
    { 
        Characters.get(Character.getSkills()).setName(Character.getName()); 
        System.out.println("Skills " + Character.getSkills() + ", Cap nhat du lieu moi"); 
    } 
} 
  
