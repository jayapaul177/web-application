package Com.ItestLinsenerPrg;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfReaderPrg
{
	public static void main(String[] arg) throws IOException
	{
		PDDocument pd;
		pd=PDDocument.load(new File("E:\\truths\\Microsoft Word - My Journey With God 8 UP Through Bible Reading Program.pdf"));
		System.out.println("total page:"+pd.getNumberOfPages());
		PDFTextStripper pdf=new PDFTextStripper();
		System.out.println(pdf.getText(pd));
		
	}

}
