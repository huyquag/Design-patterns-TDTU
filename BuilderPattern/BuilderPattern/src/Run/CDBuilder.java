package Run;

public class CDBuilder
{
    public CDType buildAppleCD()
        { 
            CDType cds=new CDType();
            cds.addItem(new Apple());
            return cds;
	    }
	        public CDType buildSamsungCD()
                {
		            CDType cds=new CDType();
		            cds.addItem(new Samsung());
		            return cds;
	            }
}
