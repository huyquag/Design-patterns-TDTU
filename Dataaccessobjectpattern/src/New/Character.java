package New;

import java.util.List; 
import java.util.ArrayList; 
import java.util.List; 

public class Character 
{ 
    private String name; 
    private int Skills; 
  
    Character(String name,int Skills) 
    { 
        this.name = name; 
        this.Skills = Skills; 
    } 
  
    public String getName()  
    { 
    	return name; 
    } 
  
    public void setName(String name)  
    { 
        this.name = name; 
    } 
  
    public int getSkills()  
    { 
    	return Skills; 
    } 
  
    public void setSkills(int Skills)  
    { 
    	this.Skills = Skills; 
    } 
} 