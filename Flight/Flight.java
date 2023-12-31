public class Flight {

public static int numOfFlights;
private String destination;
private String flightNo;
private String gateNo;
private char flightType;


public Flight(){

destination = "";
gateNo = "";
flightType = ' ';
numOfFlights++;
}

public Flight(String dest, String gate, char fltType){

destination = dest;
gateNo = gate;
flightType = fltType;
numOfFlights++;
}


public void generateFlightNo(){

flightNo = destination.substring(0,3).toUpperCase() + "00" + numOfFlights;

}

public double calculatePrice(){

double price = 0;

String dest = destination.toLowerCase();
if(flightType == 'N' || flightType == 'n') {
switch (dest){

case "dammam":
price = 100 * (65.0/15);
break;

case "jeddah": case "yanbu": case "abha":
price = 100 * (105.0/15);
break;

case "hail": 
price = 100 * (85.0/15);
break;

case "tabuk":
price = 100 * (135.0/15);
break;

case "baha":
price = 100 * (95.0/15);
break; 

default:
price = 0;

}

}

else if (flightType == 'D' || flightType == 'd'){

switch (dest){

case "dammam":
price = 70 * (65.0/15);
break;

case "jeddah": case "yanbu": case "abha":
price = 70 * (105.0/15);
break;

case "hail": 
price = 70 * (85.0/15);
break;

case "tabuk":
price = 70 * (135.0/15);
break;

case "baha":
price = 70 * (95.0/15);
break; 

default:
price = 0;

}
}

else if (flightType == 'C' || flightType == 'c'){

switch (dest){

case "dammam":
price = 50 * (65.0/15);
break;

case "jeddah": case "yanbu": case "abha":
price = 50 * (105.0/15);
break;

case "hail": 
price = 50 * (85.0/15);
break;

case "tabuk":
price = 50 * (135.0/15);
break;

case "baha":
price = 50 * (95.0/15);
break; 

default:
price = 0;

}

}

return price;
}

public int calculatePoints(double price){

return (int) (4 * (price/10.0));

}

public void displayInfo(){

System.out.println("*** Flight Information ***");
System.out.printf("Destination: %s%nGate number: %s%nFlight type: %c%n" , destination, gateNo, flightType);
System.out.println("Flight number: " + flightNo);
}

public void setDestination(String dest){
destination = dest;
}

public void setGateNo(String gate){
gateNo = gate;
}

public void setFlightType(char fltType){
flightType = fltType;
}

public String getDestination(){
return destination;
}

public String getGateNo(){
return gateNo;
}

public char getFlightType(){
return flightType;
}

}
