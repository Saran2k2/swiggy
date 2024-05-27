import java.util.Scanner;
class  swiggy
{
	static Scanner sc =new Scanner(System.in);
	static int price,bill,n,hotel,qty;
	static String dish;
	public static void main(String[] args)throws Exception 
	{
		System.out.println("\t\t\t\t Welcome to swiggy\n");
		System.out.println("************************************************************************************");
		System.out.print("Enter your name:");
		String ch =sc.next();
		System.out.print("Enter your phone number:");
		long num=sc.nextLong();
		System.out.println("Select the hotel:\n\n"+" 1.Buhari\n 2.A2b\n 3.S.S.Hyderabad");
		hotel =sc.nextInt();
		switch(hotel)
		{
			case 1:
				{// buhari
				System.out.println("select your dish (enter dish number:)\n\n" +" 1.chicken biriyani\n 2.Mutton biriyani\n 3.Egg fried rice \n 4.Egg noodels");
                int food =sc.nextInt();
				System.out.println("Enter the quantity:");
				qty=sc.nextInt();
				switch (food)
				{
				case 1:
					{//chicken biriyani
					price=280;
					dish ="chicken biriyani";
					break;
					}
                case 2:
					{
					//mutton biriyani
					price=300;
					dish ="mutton biriyani";
					break;
					}
				case 3:
					{
					//eggrice
					price=220;
					dish ="egg rice";
					break;
					}
				case 4:
					{//egg noodles
					price=250;
					dish ="egg noodles";
					break;
					}
				}
				System.out.println("\t\t\tProcessing....\n");
				Thread.sleep(1000);
				bill=qty*price;
				System.out.println("\t\t\tTotal Bill: "+bill);
				break;
				}
			case 2:
				{// A2B
				System.out.println("select your dish (enter dish number:)\n" +" 1.Veg biriyani \n 2.sambar rice \n 3.curd rice & chips \n 4.full meals \n ");
                int food =sc.nextInt();
				System.out.println("Enter the quantity:");
				qty =sc.nextInt();
				switch (food)
				{
				case 1:
					{//veg biriyani
					price=200;
					dish ="veg biriyani";
					break;
					}
                case 2:
					{
					//sambar
					price=170;
					dish ="sambar";
					break;
					}
				case 3:
					{
					//curd
					price=120;
					dish ="curd rice";
					break;
					}
				case 4:
					{//meals
					price=220;
					dish ="meals";
					break;
					}
				}
				System.out.println("\t\t\tProcessing....");
				Thread.sleep(1000);
				bill=qty*price;
				System.out.println("\t\t\tTotal Bill: "+bill);
				break;
			    }
		   case 3:
				{// ss
				System.out.println("select your dish (enter dish number:)\n" +" 1.chicken biriyani \n 2.Mutton biriyani \n 3.Egg fried rice \n 4.Egg noodels");
                int food =sc.nextInt();
				System.out.println("Enter the quantity:");
				qty =sc.nextInt();
				switch (food)
				{
				case 1:
					{//chicken biriyani
					price=200;
					dish ="chicken biriyani";
					break;
					}
                case 2:
					{
					//mutton biriyani
					price=220;
					dish ="mutton biriyani";
					break;
					}
				case 3:
					{
					//egg rice
					price=150;
					dish ="egg rice";
					break;
					}
				case 4:
					{//egg noodles
					price=180;
					dish ="egg noodles";
					break;
					}
				}
				System.out.println("\t\t\tProcessing....");
				Thread.sleep(1000);
				bill=qty*price;
				System.out.println("\t\t\tTotal Bill: "+bill);
				break;
			    }
		}//hotel
		System.out.println("Select the Payment Mode\n");
		System.out.println("1.G-pay\n2.Phone-pay");
		int payment =sc.nextInt();
		switch (payment)
		{
			case 1:
				{//Gpay
				System.out.println("\t\t\tRedirecting to Gpay Server...");
				Thread.sleep(3000);
				System.out.println("Enter the Amount:"+bill);
				double user_entered_amount=sc.nextDouble();
				if (bill == user_entered_amount)
					{//Bill Entered is Correct
					//Gen Otp
					int sys_otp=(int)(Math.random());
					System.out.print("\t\t\tEnter the OTP:");
					Thread.sleep(3000);
					System.out.println(sys_otp);
					int user_entered_otp=sc.nextInt();
					if (sys_otp == user_entered_otp)
						{//Payment Success
						System.out.println("\t\t\tPayment Succesfull...");
						Thread.sleep(2000);
						System.out.println("\t\t\tOrder Received & Will be Delivered");
						}
					else
						{
						//Payment Fail
						System.out.println("\t\t\tPayment failed ,please try again ..");
						}
						break;
					}
					else
						{
						//Payment Fail
						System.out.println("\t\t\tPayment failed ,please check otp and bill amount");
						}
						break;
				 }//Gpay
		    case 2:
				{//phone pay
				System.out.println("\t\t\tRedirecting to Phone pay Server...");
				Thread.sleep(3000);
				System.out.println("Enter the Amount:"+bill);
				double user_entered_amount=sc.nextDouble();
				if (bill == user_entered_amount)
					{//Bill Entered is Correct
					 //Gen Otp
					 int sys_otp=(int)(Math.random()+9999-9999);
					 System.out.print("\t\t\tEnter the OTP:");
					 Thread.sleep(3000);
					 System.out.println(sys_otp);
				     int user_entered_otp=sc.nextInt();
					 if (sys_otp == user_entered_otp)
							{//Payment Success
							  System.out.println("\t\t\tPayment Succesfull...");
							  Thread.sleep(2000);
							  System.out.println("\t\t\tOrder Received & Will be Delivered By Next Year...");
							}
					else
						{
						//Payment Fail
						System.out.println("\t\t\tPayment failed ,please try again ..");
						}
						break;
					}
				else
				    {
				      System.out.println("check otp and entered amount ");
					}
		        }//phonepay
		}//switch payment
		System.out.print("BILL \n");
		System.out.println("Customer name:\t\t\t"+ch);
		System.out.println("Phone number:\t\t\t"+ num);
		System.out.println("ORDERED DISH:\t\t\t"+dish);
		System.out.println("quantity\t\t\t"+qty);
		

  } 
}
