package com.aspose.barcode.examples.barcode_image.utility_features;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.aspose.barcode.BarCodeBuilder;
import com.aspose.barcode.BarCodeImageFormat;

public class SaveBarcodeImageToStreams {

	public static void main(String[] args) throws IOException {
    	
		BarCodeBuilder builder = new BarCodeBuilder();
		builder.setSymbologyType(com.aspose.barcode.Symbology.Code128);
		builder.setCodeText("123456");
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		builder.save(outStream, BarCodeImageFormat.Jpeg);

	}

}
