package number;

public class OddEven {
	
private void evenno() {
	int i,ecount=0,ocount= 0,even=0;
	for(i=0;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.printf("even number"+i);
			ecount++;
			even=even+i;
			System.out.println("\n");
		}
		else
		{
			System.out.println("odd number"+i);
			ocount++;
		}
	}
	System.out.println("even count"+ecount);
	System.out.println("odd count"+ocount);
	System.out.println("sum even"+even);
}
public static void main(String[] args) {
	OddEven n= new OddEven();
	n.evenno();
	
}
}
