class Stu{
	static String UnivercityName="VTU";
	
	String branch;
	int rollNo;
	
	public void eating(String Name){
		int rise =20;
		System.out.println("Student " +Name+ " eating " +rise+ "kgs");
		
		System.out.println(this.branch);
		
	}
	
public static void main(String[] args){

	//System.out.println(UnivercityName);

	Stu surya = new Stu();
	Stu akash = new Stu();	
	
	surya.branch="eee";
	surya.eating("abi");
	
	akash.branch="cse";
	akash.eating("pooja");
}

}