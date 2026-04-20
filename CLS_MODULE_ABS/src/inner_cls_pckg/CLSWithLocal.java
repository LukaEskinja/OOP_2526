package inner_cls_pckg;

public class CLSWithLocal {

    public void procesStringData(String[] data){


        class StringDataParser{

            private int validInstances;

            private int invalidNumInstances;

            boolean isValid(String dataElement){
                return dataElement != null && dataElement.contains(";") && dataElement.split(";").length ==3;
            }

            String[] parseElements(String toParse){
                return toParse.split(";");
            }

             void printParsedElements(String[] elements){
                for(String el : elements){
                    System.out.println(el);

                }
                 System.out.println("=========================================\n");
             }

             void processData(String dataElement){
                if (isValid(dataElement)){
                    String[] elements =parseElements(dataElement);
                    validInstances++;


                 } else {
                    System.out.println(dataElement + "is not valid for parsing and processing!");
                    invalidNumInstances++;
                }
             }

             void giveReport(){
                 System.out.println("number of valid elements:" + validInstances);
                 System.out.println("number of invalid elements:" + invalidNumInstances);
             }

        }

        StringDataParser stringDataParser = new StringDataParser();
        for(String dataElement : data){

            stringDataParser.processData((dataElement));
        }
        stringDataParser.giveReport();
    }
}
