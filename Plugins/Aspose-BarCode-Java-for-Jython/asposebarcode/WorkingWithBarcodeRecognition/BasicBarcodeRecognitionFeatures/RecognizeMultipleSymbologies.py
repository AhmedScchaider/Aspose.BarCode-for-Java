from asposebarcode import Settings
from com.aspose.barcoderecognition import BarCodeReadType
from com.aspose.barcoderecognition import BarCodeReader

class RecognizeMultipleSymbologies:

    def __init__(self):
        dataDir = Settings.dataDir + 'WorkingWithBarcodeRecognition/AdvancedBarcodeRecognitionFeatures/RecognizeMultipleSymbologies/'
        
        # initialize barcode reader
        img = dataDir + "symbologies.png"
        barcode_reader_type = BarCodeReadType

        rd =BarCodeReader(img, barcode_reader_type.Code39Standard)

        # read barcode
        while(java_values(rd.read())):
            # print the code text, if barcode found
            print "CodeText: " 
            print rd.getCodeText()

            # print the symbology type
            print "Type: " 
            print rd.getReadType()

if __name__ == '__main__':        
    RecognizeMultipleSymbologies()