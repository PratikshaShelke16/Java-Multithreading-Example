package MultiThreading;



public class Pratiksha extends Thread{
	public void run()
	{
		String name="pratiksha";
				for(int i=0;i<name.length();i++)
				{
					System.out.println(name.charAt(i));
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e)
					{
						e.getMessage();
						e.printStackTrace();
						System.out.println(e);
					}
				}
			
				
	}
	public static void main(String[] args) {
		Pratiksha p=new Pratiksha();
		p.start();
	}
}



