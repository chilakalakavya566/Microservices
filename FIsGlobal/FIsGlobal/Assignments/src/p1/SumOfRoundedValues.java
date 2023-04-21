package p1;

public class SumOfRoundedValues {
	public int a,b,c,r1,r2,r3,sum=0;
	public int sumOfRoundedValues(int a, int b,int c){
		if(a<=0 & b<=0 & c<=0)
			return -1;
		else {
			r1=a%10;
			r2=b%10;
			r3=c%10;
			if(r1<5)
				sum=sum+a-r1;
			else
				sum=sum+a+(10-r1);
			if(r2<5)
				sum=sum+b-r2;
			else
				sum=sum+b+(10-r2);
			if(r3<5)
				sum=sum+c-r3;
			else
				sum=sum+c+(10-r3);
		}
		return sum;
		
	}
	
}
