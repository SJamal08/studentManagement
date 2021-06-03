package achProject;

import achProject.service.Service;
import achProject.utils.Clavier;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub



		System.out.println("MENU");
		System.out.println("************************************");
		System.out.println(" 1-  Read a file");
		System.out.println(" 2-  Manage students ");
		System.out.println(" 3-  Manage courses ");
		System.out.println(" 4-  Exit");
		System.out.println("Select the correct number of your choice : ");
		System.out.print(">>> ");
		int choix = Clavier.readInt();

		switch (choix) {
			case 1:
				new Service().ReadFile();
				break;
			case 2:
				studentMenu();
				break;
			case 3:
				courseMenu();
				break;
			case 4:
				break;

		}

	}

	private static void courseMenu() throws IOException, ClassNotFoundException {

		System.out.println("COURSE MANAGER");
		System.out.println("************************************");
		System.out.println(" 1-  Add a course");
		System.out.println(" 2-  Update a course ");
		System.out.println(" 3-  Display list of courses ");
		System.out.println(" 4-  Delete a courses ");
		System.out.println(" 5-  Exit");
		System.out.println("Select the correct number of your choice : ");
		System.out.print(">>> ");

		int choice = Clavier.readInt();

		switch (choice) {
			case 1:
				new Service().addCours();
				break;
			case 2:
				new Service().updateCours();
				break;
			case 3:
				new Service().displayAllCours();
				break;
			case 4:
				new Service().deleteCours();
				break;
			case 5:
				break;
		}
	}

	private static void studentMenu() throws IOException, ClassNotFoundException {

		System.out.println("STUDENT MANAGER");
		System.out.println("************************************");
		System.out.println(" 1-  Add a student");
		System.out.println(" 2-  Update a student ");
		System.out.println(" 3-  Display list of students ");
		System.out.println(" 4-  Delete a student ");
		System.out.println(" 5-  Display all courses of one student ");
		System.out.println(" 6-  Exit");
		System.out.println("Select the correct number of your choice : ");
		System.out.print(">>> ");

		int choice = Clavier.readInt();

		switch (choice) {
			case 1:
				new Service().addEtudiant();
				break;
			case 2:
				new Service().updateEtudiant();
				break;
			case 3:
				new Service().displayAllEtudiants();
				break;
			case 4:
				new Service().deleteEtudiant();
				break;
			case 5:
				new Service().displayAllCoursOfOneEtudiant();
				break;
			case 6:
				break;
		}
	}

}
