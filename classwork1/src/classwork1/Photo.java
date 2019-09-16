package classwork1;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Photo {
	private int resolution;
	private String type;
	
	public Photo()
	{
		
	}

	public Photo(int resolution, String type) {
		super();
		this.resolution = resolution;
		this.type = type;
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void toFile()
	{
		Scanner type= new Scanner(System.in);
		Scanner resolution= new Scanner(System.in);
		System.out.println("Enter the photo type:");
		setType(type.nextLine());
		System.out.println("Enter the photo resolution");
		setResolution(resolution.nextInt());
		try
		{
			File file=new File("HouseFile.txt");
			if (!file.exists())
			{
				file.createNewFile();
			}
		
			
		PrintWriter pw=new PrintWriter(file);
		FileWriter fw= new FileWriter(file);
		
		pw.println("ID\t\t\t\tPhoto Type\t\t\tResolution");
		fw.write(this.getType()+"\t\t\t"+this.getResolution());
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
