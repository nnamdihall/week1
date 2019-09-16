package classwork1;

public class Driver {

	public static void main(String[] args) {
		House house= new House();
		Photo photo=new Photo();
		int i;
		for (i=0; i<3; i++)
		{
			
			house.toFile();
			photo.toFile(); 
		}
	}

	}


