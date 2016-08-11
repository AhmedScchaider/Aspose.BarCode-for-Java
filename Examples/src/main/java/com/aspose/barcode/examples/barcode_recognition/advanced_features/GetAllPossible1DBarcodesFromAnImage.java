package com.aspose.barcode.examples.barcode_recognition.advanced_features;

import java.awt.Point;

import com.aspose.barcode.barcoderecognition.BarCodeReadType;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.examples.ApplyALicense;
import com.aspose.barcode.examples.Utils;
import com.aspose.barcode.examples.barcode.basic_features.SpecifySymbology;

public class GetAllPossible1DBarcodesFromAnImage {

	public static void main(String[] args) throws Exception {
		ApplyALicense.applyALicense();

		// The path to the resource directory.
		String dataDir = Utils.getDataDir(SpecifySymbology.class) + "BarcodeReader/advanced_features/";

		// Initialize the BarCodeReader object
		BarCodeReader reader = new BarCodeReader(dataDir + "MultipleBarcodes.png", BarCodeReadType.Code128);

		// Call read method
		reader.read();

		// Now get all possible barcodes
		BarCodeReader.PossibleBarCode[] barcodes = reader.getAllPossibleBarCodes();

		for (int i = 0; i < barcodes.length; i++) {
			// Display code text, symbology, detected angle, recognition percentage of the barcode
			System.out.println("Code Text: " + barcodes[i].getCodetext() + " Symbology: " + barcodes[i].getBarCodeReadType() + " Recognition percentage: " + barcodes[i].getAngle());

			// Display x and y coordinates of barcode detected
			Point[] point = barcodes[i].getRegion().getPoints();

			System.out.println("Top left coordinates: X = " + point[0].getX() + ", Y = " + point[0].getY());
			System.out.println("Bottom left coordinates: X = " + point[1].getX() + ", Y = " + point[1].getY());
			System.out.println("Bottom right coordinates: X = " + point[2].getX() + ", Y = " + point[2].getY());
			System.out.println("Top right coordinates: X = " + point[3].getX() + ", Y = " + point[3].getY());
		}
	}

}
