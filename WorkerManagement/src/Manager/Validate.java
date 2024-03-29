package Manager;

import java.util.ArrayList;
import java.util.Scanner;

import Entity.Worker;

public class Validate {
	private static Scanner in = new Scanner(System.in);

	public static int checkInputIntLimit(int min, int max) {
		while (true) {
			try {
				int result = Integer.parseInt(in.nextLine().trim());
				if (result < min || result > max) {
					throw new NumberFormatException();
				}
				return result;
			} catch (NumberFormatException e) {
				System.err.println("Please input number in range[" + min + "," + max + "]");
				System.out.print("Enter again: ");
			}
		}
	}

	public static String checkInputString() {
		while (true) {
			String result = in.nextLine().trim();
			if (result.isEmpty()) {
				System.err.println("List empty");
				System.out.print("Enter again: ");
			} else {
				return result;
			}

		}
	}

	public static boolean checkIdExist(ArrayList<Worker> lw, String id) {
		// check from first to last list id worker exist or not
		for (Worker worker : lw) {
			if (id.equalsIgnoreCase(worker.getId())) {
				return true;
			}

		}
		return false;
	}

	public static int checkInputSalary() {
		while (true) {
			try {
				int result = Integer.parseInt(in.nextLine().trim());
				if (result < 0) {
					throw new NumberFormatException();
				}
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Please must be greater than zero!");
				System.out.print("Enter again: ");
			}
		}
	}

	public static boolean checkWorkerExist(ArrayList<Worker> lw, String id, String name, int age, int salary,
			String workLocation) {
		for (Worker worker : lw) {
			if (id.equalsIgnoreCase(worker.getId()) && name.equalsIgnoreCase(worker.getName()) && age == worker.getAge()
					&& salary == worker.getSalary()) {
				return false;
			}

		}
		return true;
	}

}
