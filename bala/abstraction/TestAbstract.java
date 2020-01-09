package abstraction;

public class TestAbstract {
	public static void main(String[] args) {
		SecretStuff myAbstractObject = new Implementation();
//		SecretStuff test = new SecretStuff(){
//			@Override
//			void description() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		myAbstractObject.moreInfo();
		String demo = myAbstractObject.myDefaultMethod();
		System.out.print("Result: "+demo);
		SecretStuff.show();
		Stuff.show();
	}
	
			
}
