package pkg1;

import java.util.ListResourceBundle;

public class MyColors extends ListResourceBundle{
	static final Object[][] contents = {
			{ "colour.c1", "RED" },  
            { "colour.c2", "GREEN" },
            { "colour.c3", "BLUE" }, 
	};  

	public Object[][] getContents() {
		return contents;
	}
}
