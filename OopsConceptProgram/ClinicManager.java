package OopsConceptProgram;

	

	import java.io.File;

	import java.io.FileReader;
	import java.io.IOException;
	import java.io.PrintWriter;
    import java.text.ParseException;
    import java.util.Iterator;
	import java.util.Random;
	import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

	public class ClinicManager 
	   {

		Scanner scanner;	//	scanner to get user input
		
		ClinicManager() 
		{
			scanner = new Scanner(System.in);
		}
		
		/** Asks user to choose between doctor and patient 
		 * @throws org.json.simple.parser.ParseException **/
		void askUser() throws org.json.simple.parser.ParseException 
		{
			System.out.println("Whom do you want to search?");
			System.out.println("1. Doctor");
			System.out.println("2. Patient");
			
			int choice = scanner.nextInt();
			//calls method depending upon user's input
			switch (choice)
			{
			case 1:
				askDoctorInput();
				break;

			default:
				askPatientInput();
				break;
			}
		}

		/** Gets user's input to search for a doctor 
		 * @throws org.json.simple.parser.ParseException **/
		void askDoctorInput() throws org.json.simple.parser.ParseException 
		{
			System.out.println("Search doctor by:");
			System.out.println("1. Name");
			System.out.println("2. ID");
			System.out.println("3. Specialization");
			System.out.println("4. Availability");
			int choice = scanner.nextInt();
			doctorChoice(choice);
		}

		/** Gets user's input to search for a patient **/
		void askPatientInput() {
			System.out.println("Search patient by:");
			System.out.println("1. Name");
			System.out.println("2. ID");
			System.out.println("3. Mobile Number");
			int choice = scanner.nextInt();
			try {
				patientChoice(choice);
			} catch (org.json.simple.parser.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/** Reads doctor's data from json file 
		 * @throws org.json.simple.parser.ParseException **/
		void readDoctorData(String key, String value) throws ParseException, org.json.simple.parser.ParseException
		{
			JSONParser parser = new JSONParser();	//	parser to read from json file
			try {
				//	adds json data to json array
				JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(""));
				//	iterator to iterate json data
				Iterator iterator = jsonArray.iterator();
				//	json objects top store json data from array
				JSONObject jsonObject, lastJasonObject = null;
				
				//	iterates over json array
				while (iterator.hasNext()) 
				{
					//	checks if data given by user matches with any json object
					//	and if present prints it
					if ((jsonObject = (JSONObject) iterator.next()).get(key).equals(value)) {
						lastJasonObject = jsonObject;
						System.out.println("\nDoctor Information:");
						System.out.println("ID: " + jsonObject.get("id") + "\t");
						System.out.println("Name: " + jsonObject.get("name") + "\t");
						System.out.println("Specialization: " + jsonObject.get("specialization") + "\t");
						System.out.println("Availability: " + jsonObject.get("availability") + "\t");
						System.out.println("Number of Patients: " + jsonObject.get("patients") + "\n");
					}
				}

				//	asks user if want to take an appointment
				System.out.println("Do you want to take an appointment?[y/n]");
				String response = scanner.next();
				if (response.equals("y")) {
					try {
						makeAppointment(lastJasonObject);
					} catch (org.json.simple.parser.ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		/** Reads patient data from json file 
		 * @throws org.json.simple.parser.ParseException **/
		void readPatientData(String key, String value) throws org.json.simple.parser.ParseException
		{
			JSONParser parser = new JSONParser();	//parser to read json file
			try {
				JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(""));
				Iterator iterator = jsonArray.iterator();
				JSONObject jsonObject;
				while (iterator.hasNext()) {
					if ((jsonObject = (JSONObject) iterator.next()).containsValue(value)) 
					{
						System.out.println("\nPatient Information:");
						System.out.println("ID: " + jsonObject.get("id") + "\t");
						System.out.println("Name: " + jsonObject.get("name") + "\t");
						System.out.println("Mobile Number: " + jsonObject.get("mobile number") + "\t");
						System.out.println("Age: " + jsonObject.get("age") + "\n");
					}
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		/** Gets user's input according to his choice 
		 * @throws org.json.simple.parser.ParseException **/
		void doctorChoice(int choice) throws org.json.simple.parser.ParseException {
			switch (choice) {
			case 1:
				scanner.nextLine();
				System.out.print("Enter name:");
				try {
					readDoctorData("name", scanner.nextLine());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 2:
				System.out.print("Enter ID:");
				try {
					readDoctorData("id", scanner.next());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.print("Enter speacialization:");
				try {
					readDoctorData("specialization", scanner.next());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.print("Enter availability::");
				try {
					readDoctorData("availability", scanner.next());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}

		/** Gets user's input according to his choice 
		 * @throws org.json.simple.parser.ParseException **/
		void patientChoice(int choice) throws org.json.simple.parser.ParseException {
			switch (choice) {
			case 1:
				scanner.nextLine();
				System.out.print("Enter name:");
				readPatientData("name", scanner.nextLine());
				break;
			case 2:
				System.out.print("Enter ID:");
				readPatientData("id", scanner.next());
				break;
			case 3:
				System.out.print("Enter mobile number:");
				readPatientData("mobile number", scanner.next());
				break;
			}
		}

		/** If doctor is not busy then makes an appointment
		 * @throws org.json.simple.parser.ParseException 
		 * @throws ParseException **/
		void makeAppointment(JSONObject doctorJsonObject) throws ParseException, org.json.simple.parser.ParseException
		{

			String numberOfPatients = (String) doctorJsonObject.get("patients");
			long patients = Long.parseLong(numberOfPatients);
			if (patients == 5) {	//	doctor is busy 
				System.out.println("Sorry!!! Doctor is busy today. Make an appointment tomorrow.");
			} else {	// doctor is not busy. Increases number of patients and updates json file	
				String id = getRandomId();	//generates random id
				updatePatientData(id);	//	updates patient json file
				numberOfPatients = String.valueOf((patients + 1));
				doctorJsonObject.put("patients", numberOfPatients);
				updateDoctorData(doctorJsonObject);
				System.out.println("You have got an appointment. Your Patient ID is " + id + "\n");
				askUser();
			}

		}

		/** Updates patient's data 
		 * @throws org.json.simple.parser.ParseException **/
		void updatePatientData(String id) throws ParseException, org.json.simple.parser.ParseException{
			System.out.println("Enter your name, mobile number, age: ");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id", id);
			jsonObject.put("name", scanner.next());
			jsonObject.put("mobile number", scanner.next());
			jsonObject.put("age", scanner.next());

			JSONParser parser = new JSONParser();	//parser to read the file
			try {
				JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(""));
				jsonArray.add(jsonObject);
				PrintWriter printWriter = null;	//	print writer to write to the file
				File file = new File("");
				try {
					printWriter = new PrintWriter(file);
				} catch (IOException e) {
					e.printStackTrace();
				}
				printWriter.write(jsonArray.toJSONString());	//writes data to the file
				printWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/** Updates doctor's data 
		 * @throws org.json.simple.parser.ParseException **/
		void updateDoctorData(JSONObject doctorJsonObject) throws ParseException, org.json.simple.parser.ParseException
		{
			JSONParser parser = new JSONParser();
			JSONArray jsonArray;
			try {
				jsonArray = (JSONArray) parser.parse(new FileReader(""));

				JSONArray updatedArray = new JSONArray();	// new array with updated elements
				Iterator iterator = jsonArray.iterator();

				//	iterates over array
				while (iterator.hasNext()) 
				{
					JSONObject object = (JSONObject) iterator.next();
					if (object.get("id").equals(doctorJsonObject.get("id"))) 
					{
						updatedArray.add(doctorJsonObject);
					} 
					else 
					{
						updatedArray.add(object);
					}
				}
				PrintWriter printWriter = null;
				File file = new File("");
				try {
					printWriter = new PrintWriter(file);
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				printWriter.write(updatedArray.toJSONString());
				printWriter.close();
			} 
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
		}

		/** Generates a random ID for patient **/
		String getRandomId() 
		{
			Random random = new Random();
			return String.valueOf(random.nextInt(1000)+ 1);
		}
	}







