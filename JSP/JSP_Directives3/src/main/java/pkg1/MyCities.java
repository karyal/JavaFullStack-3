package pkg1;

import java.util.ListResourceBundle;

public class MyCities extends ListResourceBundle{
	static final Object[][] contents = { 
			{ "cities.c1", "1235.25" }, 
			{ "cities.c2", "1344.74" }, 
			{ "cities.c3", "2345.85" },
			{ "cities.c4", "3256.78" },			
	};

	public Object[][] getContents() {
		return contents;
	}
}