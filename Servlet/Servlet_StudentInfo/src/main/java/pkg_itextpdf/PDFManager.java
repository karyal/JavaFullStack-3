package pkg_itextpdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class PDFManager {
	
	public boolean exportIndividual(Student student) {
		boolean result=false;
		try {
			String fileName = student.getFullName()+"_"+student.getSid()+".pdf"; 
			PdfWriter writer = new PdfWriter(fileName);
			PdfDocument pdfDoc = new PdfDocument(writer);
			Document document = new Document(pdfDoc); 
			
			String str1 = "Individual Student Details";
			Paragraph para1 = new Paragraph (str1);
			
			document.add(para1);
			
			document.close();
			result = true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
}