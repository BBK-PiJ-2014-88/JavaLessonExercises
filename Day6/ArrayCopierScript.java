import java.util.Scanner;
public class ArrayCopierScript
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

ArrayCopier testArrayCopier = new ArrayCopier();

int[] sameSize1 = {1,2,3,4,5,6,7,8,9,10};
int[] sameSizeEmpty = new int[10];

int[] dstIsSmaller1 = {1,2,3,4,5,6,7,8,9,10};
int[] dstIsSmallerEmpty = new int[5];

int[] srcIsSmaller1 = {1,2,3,4,5};
int[] srcIsSmallerEmpty = new int[10];

testArrayCopier.copy(sameSize1,sameSizeEmpty);
testArrayCopier.copy(dstIsSmaller1,dstIsSmallerEmpty);
testArrayCopier.copy(srcIsSmaller1,srcIsSmallerEmpty);
}}

