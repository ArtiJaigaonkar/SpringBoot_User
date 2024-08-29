package com.model;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

public class User1Pdf {

List<User1> getList;
	
	public User1Pdf(List<User1> getList) {
		super();
		this.getList = getList;
	}
	
	public void writePdfHeader(PdfPTable table) {
		PdfPCell cell=new PdfPCell();
		cell.setBackgroundColor(Color.red);
		cell.setPadding(5);
		
		cell.setPhrase(new Phrase("User ID"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Name"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Email"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Password"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Gender"));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("City"));
		table.addCell(cell);
		
		
}
	
	public void writePdfData(PdfPTable table) {
		
		for(User1 user:getList) {
			table.addCell(String.valueOf(user.getId()));
			table.addCell(user.getName());
			table.addCell(user.getEmail());
			table.addCell(user.getPassword());
			table.addCell(user.getGender());
			table.addCell(user.getCity());
		}

	}
	public void export(HttpServletResponse response) throws DocumentException, IOException {
		
		
		Document doc=new Document();
		PdfWriter.getInstance(doc, response.getOutputStream());
		doc.open();
		
		PdfPTable table = new PdfPTable(6);
		table.setWidthPercentage(100);
		
		writePdfHeader(table);
		writePdfData(table);
		
		doc.add(table);
		doc.close();

	}
	
}
