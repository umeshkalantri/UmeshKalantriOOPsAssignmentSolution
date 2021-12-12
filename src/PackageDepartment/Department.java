package PackageDepartment;

	import java.util.Scanner;

	public class Department{
		private static Scanner sc = new Scanner(System.in);
		
		public static void main(String args[]) {
		System.out.println("Enter your first Name");
		String firstName = sc.next();
		System.out.println("Enter your last Name");
		String lastName = sc.next();
		
		System.out.println("Choose your department");
		System.out.println("1.Admin Department");
		System.out.println("2.HR Department");
		System.out.println("3.Tech Department");
		
		int choice = sc.nextInt();
		SuperDepartment dept;
		switch(choice) {
			// object creation
			
			case 1:
				dept = new AdminDepartment(); {
					System.out.println("Welcome to " + dept.departmentName());
					System.out.println(dept.getTodaysWork());
					System.out.println(dept.getWorkDeadline());
					System.out.println(dept.isTodayAHoliday());
					
					
				}
				break;
			case 2:
				dept = new HrDepartment(); {
					System.out.println("Welcome to " + dept.departmentName());
					System.out.println(((HrDepartment) dept).doActivity());
					System.out.println(dept.getTodaysWork());
					System.out.println(dept.getWorkDeadline());
					System.out.println(dept.isTodayAHoliday());
					System.out.println("................");
					System.out.println();
				};
				break;
			case 3:
				dept = new TechDepartment(); {
					System.out.println("Welcome to " + dept.departmentName());
					System.out.println(dept.getTodaysWork());
					System.out.println(dept.getWorkDeadline());
					System.out.println(((TechDepartment) dept).getTechStackInformation());
					System.out.println(dept.isTodayAHoliday());
					System.out.println(".................");
					System.out.println();
					
					
				}
				break;
			default:
				System.out.println("Wrong Choice");
				return;
			}
		}
	}