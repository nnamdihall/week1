package classwork1;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;


public class House {
	private int id;
	private float price;
	private String location;
	private String advertiser;
	public Photo image;
	
	public House() {
		super();
		id=0;
		price=0.0f;
		location="";
		advertiser="";
	}

	public House(int id, float price, String location, String advertiser, Photo image) {
		super();
		this.id = id;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Photo getImage() {
		return image;
	}

	public void setImage(Photo image) {
		this.image = image;
	}
	
	/*public String Houseinfo()
	{
		Scanner price= new Scanner(System.in);
		Scanner location= new Scanner(System.in);
     	Scanner id= new Scanner(System.in);
     	Scanner advertiser= new Scanner(System.in);
		System.out.println("What is the house ID:");
		setId(id.nextInt());
		System.out.println("What is the house price:");
		setPrice(price.nextFloat());
		System.out.println("What is the house location:");
		setLocation(location.nextLine());
		System.out.println("Who is the house advertiser:");
		setAdvertiser(advertiser.nextLine());
		return this.location + this.advertiser+ this.price+ this.id;
	}*/
	
	public void toFile()
	{
		Scanner price= new Scanner(System.in);
		Scanner location= new Scanner(System.in);
     	Scanner id= new Scanner(System.in);
     	Scanner advertiser= new Scanner(System.in);
		System.out.println("What is the house ID:");
		setId(id.nextInt());
		System.out.println("What is the house price:");
		setPrice(price.nextFloat());
		System.out.println("What is the house location:");
		setLocation(location.nextLine());
		System.out.println("Who is the house advertiser:");
		setAdvertiser(advertiser.nextLine());
		try
		{
			File file=new File("HouseFile.txt");
			if (!file.exists())
			{
				file.createNewFile();
			}
		
			
		PrintWriter pw=new PrintWriter(file);
		FileWriter fw= new FileWriter(file);
		
		pw.println("ID\t\t\t\tPrice\t\t\tLocation\t\t\tAdvertiser");
		fw.write(this.getId()+"\t\t\t"+this.getPrice()+"\t\t\t"+this.getLocation()+"\t\t\t"+ this.getAdvertiser());
		pw.close();
		fw.close();
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
			
		}
	}

}
