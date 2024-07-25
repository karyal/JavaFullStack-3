package pkg1;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class MyCustomTagHandler extends SimpleTagSupport {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	StringWriter stringWriter = new StringWriter();

	public void doTag() throws JspException, IOException {
		if (name != null) {
			// JspWriter instance
			JspWriter out = getJspContext().getOut();
			out.println(name);
		} else {
			// make use of body content
			getJspBody().invoke(stringWriter);
			getJspContext().getOut().println(stringWriter.toString());
		}
	}
}