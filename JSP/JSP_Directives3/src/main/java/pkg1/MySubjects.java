package pkg1;

import java.util.ListResourceBundle;

public class MySubjects extends ListResourceBundle{
	static final Object[][] contents = { 
			{ "subjects.s1", "PoP" }, 
			{ "subjects.s2", "CN" }, 
	};

	public Object[][] getContents() {
		return contents;
	}
}