package com.imagesreader.test;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImages {
	public static void main(String[] args) 
    { 
		ITesseract tesseract = new Tesseract();
        try { 
            tesseract.setDatapath("H:\\AutomationProjects\\eclipse-workspace\\FrameworkFromScratch\\tessdata"); 
  
            String text  = tesseract.doOCR(new File("H:\\AutomationProjects\\eclipse-workspace\\FrameworkFromScratch\\images\\a.jpeg")); 
  
            System.out.print(text); 
        } 
        catch (TesseractException e) { 
            e.printStackTrace(); 
        } 
    } 

}
