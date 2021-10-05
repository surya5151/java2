class Converter{
public static void main (String[] args){
	//Convetring byte--------Byte
	System.out.println("Convetring byte---------------------------Byte" ); 
	
	String age ="50";
	byte convertedAge = Byte.parseByte(age);
	System.out.println("Age-" +(convertedAge+5)); 
	
	String NoOFStudent="35";
	byte convertedStudent = Byte.parseByte(NoOFStudent);
	System.out.println("NoOFStudent this Batch-"+convertedStudent);
	
	String hour="24";
	byte convertedHours = Byte.parseByte(hour);
	System.out.println("No of hours Per day-"+convertedHours);
	
	String districs="31";
	byte convertedDistrics = Byte.parseByte(districs);
	System.out.println("NO of Districs in karnataka- "+convertedDistrics);
	
	//Convetring short--------Short
	System.out.println("Convetring short-----------------------------Short" ); 
	
	String days ="365";
	short ConveredDays = Short.parseShort(days);
	System.out.println("No of days per year: "+ConveredDays);
	
	String Gym ="2500";
	short ConveredGym = Short.parseShort(Gym);
	System.out.println("No of Gym Center in Banglore: "+ConveredGym);
	
	String Colleges="10000";
	short convertedColleges = Short.parseShort(Colleges);
	System.out.println("No of colleges in Karnataka- "+convertedColleges);
	
	//converting int----------Integer
	System.out.println("Convetring int--------------------------Integer" ); 

	String quantityOfRice="25";
	System.out.println("Adding String-"+quantityOfRice+25);
	int convertedQuantityOfRice = Integer.parseInt(quantityOfRice);
	System.out.println("Adding value- "+(convertedQuantityOfRice+25));

	String pincode ="562120";
	int convertedPincode = Integer.parseInt(pincode);
	System.out.println("Pincode is- "+convertedPincode);
	
	String quantity="1000";
	int convertedQuantity = Integer.parseInt(quantity);
	System.out.println("Quantity is-"+convertedQuantity);
	
	String receiptNo="123";
	int convertedReceiptNo = Integer.parseInt(receiptNo);
	System.out.println("Receipt Number-"+convertedReceiptNo);
	
	String trainN0="45678";
	int convertedTrainNo = Integer.parseInt(trainN0);
	System.out.println("Train Number-" +convertedTrainNo);
	
	// convrting long -----------------Long
	System.out.println("convrting long -------------------------------Long");
	
	String phoneNo="9900128765";
	long convertedPhoneNo = Long.parseLong(phoneNo);
	System.out.println("Phone Number:- "+convertedPhoneNo);
	
	String aadharNo="234523452345";
	long convertedAadharNo = Long.parseLong(aadharNo);
	System.out.println("Aadhar Number:- "+convertedAadharNo);
	
	String accountNo="2355098593478";
	long convertedAccountNo = Long.parseLong(accountNo);
	System.out.println("Account No- "+convertedAccountNo);
	
	
	
	//Convetring double--------Double
	System.out.println("Convetring double--------------------Double" ); 
	
	String price="1000.10";
	double converedPrice = Double.parseDouble(price);
	System.out.println("Price:- "+converedPrice);
	
	String salary="30000.89";
	double convertedSalary = Double.parseDouble(salary);
	System.out.println("Salary:- "+convertedSalary);
	
	String percentage="65.67";
	double convertedPercentage = Double.parseDouble(percentage);
	System.out.println("Percentage:- "+convertedPercentage);
	
	// converting float ---------------Float
	System.out.println("Converting float -------------------------Float");
	
	String Value = "5000.568897f";
	float convertingValue = Float.parseFloat(Value);
	System.out.println("Value of the Items- "+convertingValue);
	
	String percentages= "89.68678f";
	float convertPercent = Float.parseFloat(percentages);
	System.out.println("per of student- "+convertPercent);
	
	String area="25.9870f";
	float converedArea = Float.parseFloat(area);
	System.out.println("Total Area of- "+converedArea);
	
	// Convrting boolean--------------Boolean
	System.out.println("Converting boolean--------------Boolean");
	
	String ignition="false";
	boolean convetrtedIgnition = Boolean.parseBoolean(ignition);
	System.out.println("ignition off- "+convetrtedIgnition);
	
	String switchs="true";
	boolean convertedSwitch = Boolean.parseBoolean(switchs);
	System.out.println("Switch On- "+convertedSwitch);
	
	String door="true";
	boolean convertedDoor= Boolean.parseBoolean(door);
	System.out.println("Door open- "+convertedDoor);
	
	
}
}
