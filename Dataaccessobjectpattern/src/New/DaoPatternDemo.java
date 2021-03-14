package New;

import java.util.List; 
import java.util.ArrayList; 
import java.util.List; 

public class DaoPatternDemo  
{ 
    public static void main(String[] args)  
    { 
        CharacterDaoImpl Same = new CharacterDaoImpl(); 
          
        for (Character Samee : Same.getAllCharacter())  
        { 
            System.out.println("Skills : " + Samee.getSkills() + ", Name : " + Samee.getName()); 
        } 
  
        Character Developer =Same.getAllCharacter().get(0); 
        Developer.setName("Simbat"); 
        Same.updateCharacter(Developer); 
  
        Same.getCharacter(0); 
        System.out.println("Skills : " + Developer.getSkills() + ", Name : " + Developer.getName());      
    } 
} 
