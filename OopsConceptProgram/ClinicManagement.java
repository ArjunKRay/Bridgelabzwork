package OopsConceptProgram;

import org.json.simple.parser.ParseException;

public class ClinicManagement
{
	public static void main(String[] args) 
	{
		ClinicManager manager = new ClinicManager();	//	manager object
		try {
			manager.askUser();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//	calls the method to ask user input
	}

}
	


