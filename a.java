//����100���ڵ��������ʵ�ּӼ��˳�
import java.util.Random;
import java.util.Scanner;

public class a {

	@SuppressWarnings("null")
	public static void main(String[] args) {

				// TODO Auto-generated method stub

				int max=100;
				
				Random ra=new Random();
				
				System.out.println("��������Ҫ�ش���Ŀ������:");
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				
					 for(int i=1;i<=n;i++){
						 int[] arr=new int[100];arr[0]=0;
						 int[] brr=new int[100];brr[0]=0;
						 
						int a=ra.nextInt(max)+1;
						int b=ra.nextInt(max)+1;
						
						//
						boolean flag=false;
						while(true){
							for(int j=1;j<i;j++){
								if(a==arr[j]&&b==brr[j])
								{	flag=false;
								    break;
								 }
								}
							if(flag==false){
								a=ra.nextInt(max)+1;
								b=ra.nextInt(max)+1;
								flag=true;
								System.out.print("");
							}
							else{break;}
						}
						
						arr[i]=a;
						brr[i]=b;
							
						int c=ra.nextInt(4);
						
						double answer=0;
						System.out.print("��ش��"+i+"����:");
						switch(c){
						case 1:{System.out.println(a+"+"+b);answer=a+b;break;}
						case 2:{System.out.println(a+"-"+b);answer=a-b;break;}
						case 3:{System.out.println(a+"*"+b);answer=a*b;break;}
						case 4:{System.out.println(a+"/"+b);answer=a/b;break;}
		                default:break;
						}

						double an=sc.nextDouble();
						
						if(an==answer){System.out.println("��ϲ�㣬����ˣ�");}
						else{System.out.println("�𰸲���Ӵ��");}
					 }
				 }
}


