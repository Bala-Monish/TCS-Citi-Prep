
public class CurrencyConverter{
			// Currency exchange rates of different currencies relative to 1 US dollar
			//double[] exchangeRates; // static method can't access instance method because instance method is specific to particular object.
			//static double[] exchangeRates; //instance methods can access static method because its global which is accessable accross all of the object.
	double[] exchangeRates = new double[]{63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
	
	void setExchangeRates(double[] rates){ //instance method
		exchangeRates = rates;
	}
	
	void updateExchangeRate(int countryIndex, double newVal){ // instance method
		exchangeRates[countryIndex] = newVal;
	}
	
	double getExchangeRate(int countryIndex){
		return exchangeRates[countryIndex];
	}
	
	double computeTransferAmount(int countryIndex, double amount){
		return amount * getExchangeRate(countryIndex);
	}
	
	
	void printCurriencies(){ // this is an instance method
	//static void printCurriencies(){ // this is an static method
		System.out.println("\nRupee: " + exchangeRates[0]);
		System.out.println("Dirham: " + exchangeRates[1]);
		System.out.println("Real: " + exchangeRates[2]);
		System.out.println("Chilean Peso: " + exchangeRates[3]);
		System.out.println("Mexican Peso: " + exchangeRates[4]);
		System.out.println("Yen: " + exchangeRates[5]);
		System.out.println("Australian: " + exchangeRates[exchangeRates.length - 1]);
		
	}
	
}
	
