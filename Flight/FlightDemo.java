//Nouf Alfaris 444200531
import java.util.*;

public class FlightDemo{

public static Scanner input = new Scanner(System.in);

public static void main(String[] args){


System.out.println("Enter flight destination:");
String destination = input.next();
System.out.println("Enter gate number:");
String gateNumber = input.next();
while(true){
if(!isValidGateNo(gateNumber)){
System.out.println("Enter gate number:");
gateNumber = input.next();
}
else 
break;
}

System.out.println("Enter flight type:");
char flightType = input.next().charAt(0);

Character.toUpperCase(flightType);

Flight obj1 = new Flight(destination, gateNumber,flightType);
obj1.generateFlightNo();

obj1.displayInfo();
double price = obj1.calculatePrice(); 
System.out.printf("Price: %.2f SR%nPoints earned: %d%n", price, obj1.calculatePoints(price));

Flight obj2 = new Flight();

obj2.setDestination("Jeddah");
obj2.setGateNo("A05");
obj2.setFlightType('D');

obj2.generateFlightNo();

obj2.displayInfo();
double price2 = obj2.calculatePrice();
System.out.printf("Price: %.2f SR%nPoints earned: %d%n", price2, obj2.calculatePoints(price2));


}

public static boolean isValidGateNo(String gNo){

boolean isValid = false;

if(gNo.length() == 3 && (gNo.charAt(0) == 'A' || gNo.charAt(0) == 'B')){
for(int i = 1; i<=2; i++){
if(Character.isDigit(gNo.charAt(i)))
isValid = true;
else {
isValid=false;
break;}
}
}

return isValid;
}
}