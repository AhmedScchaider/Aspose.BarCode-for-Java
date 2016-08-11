package com.aspose.barcode.examples.barcode_recognition.advanced_features;

import com.aspose.barcode.barcoderecognition.BarCodeReadType;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.examples.ApplyALicense;
import com.aspose.barcode.examples.Utils;
import com.aspose.barcode.examples.barcode.basic_features.SpecifySymbology;

public class GetBarCodeRecognitionQualityInPercent {

	public static void main(String[] args) throws Exception {
		ApplyALicense.applyALicense();
		
		// The path to the resource directory.
    	String dataDir = Utils.getDataDir(SpecifySymbology.class) + "BarcodeReader/advanced_features/";
    	
		// Initialize the BarCodeReader object
		BarCodeReader reader = new BarCodeReader(dataDir + "code39Extended.jpg", BarCodeReadType.AllSupportedTypes);

		// Call read method
		while (reader.read()) {
			System.out.println(reader.getCodeText() + " Type: " + reader.getReadTypeName());
			float percent = reader.getRecognitionQuality();
			System.out.println("Percent: " + percent);
		}
		reader.close();
	}

}
