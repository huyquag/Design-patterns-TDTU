package Run;

import java.util.ArrayList;
import java.util.List;

public class CDType 
{
	private List<Packing> items=new ArrayList<Packing>();
    public void addItem(Packing packs)
      {  
        items.add(packs);
       }
public void getCost()
{
  for (Packing packs : items) 
    {
      packs.price();
    }	
}
  public void show()
    {
	    for (Packing packing : items) 
        {
	        System.out.print("Ten dia CD : "+packing.pack());
	        System.out.println(", Gia : "+packing.price());
	      }		
    }	
}