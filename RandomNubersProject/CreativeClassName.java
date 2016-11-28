import java.util.Random;


public class CreativeClassName {

	public static void main(String[] args) {
		int n=0; 
		int count=0;
		Random creativeName=new Random();
		for (int j=0; j<33;j++)
		{
			n=71 + creativeName.nextInt(29);
			System.out.print(n+" ");
			count ++;
			if (count>15)
			{
				System.out.println(" ");
				count =0;
			}
		}
	System.out.println(" ");
	double m=0.;
	Random notSoCreative=new Random();
	for (int j=0; j<17; j++)
	{
		m=47.44+147.22*notSoCreative.nextDouble();
		System.out.print(m+" ");
	}
	
	}

	
}
