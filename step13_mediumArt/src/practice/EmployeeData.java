package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeData {

	private static List<Employee> employeeList = new ArrayList<Employee>();

	public static void loadEmpRecords() {
		employeeList.add(new Employee(111, "Jennifer Flores", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Mr. Jacob Parker", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Tony Williams", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "David King", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Christina Baker", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "John Murphy", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Daniel Jackson", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "William Foster", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Linda Li", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Justin Ward", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Lisa Aguilar", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Daniel Morris", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Elizabeth Moody", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "William Williams", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Dr. John Obrien", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sara Farrell", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Eric Smith", 31, "Male", "Product Development", 2012, 35700.0));
	}

	public static void main(String[] args) {

		loadEmpRecords();
//		System.out.println(employeeList);

		System.err.println("----- 1. ������ ������ �� -----");
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);

		System.err.println("\n----- 2. �� �μ��� -----");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		System.err.println("\n----- 3. ���� ��տ��� -----");
		Map<String, Double> averageAgeOfMaleAndFemaleEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(averageAgeOfMaleAndFemaleEmp);

		System.err.println("\n----- 4. ���� ���� �޿��� �޴� �ο� ���� -----");
		Optional<Employee> maxSal = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(maxSal.get());

		System.err.println("\n----- 5. 2015�� ���� �Ի��� ��� -----");
		employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

		System.err.println("\n----- 6. �μ��� �ѿ� -----");
		Map<String, Long> noEmployeesInDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Map.Entry<String, Long>> entrySet = noEmployeesInDept.entrySet();
		for (Map.Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue() + "��");
		}

		System.err.println("\n----- 7. �μ��� ��� �޿� -----");
		Map<String, Double> avgSalDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		Set<Map.Entry<String, Double>> entries = avgSalDept.entrySet();
		for (Map.Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.err.println("\n----- 8. [Product Development] �μ� �� �ֿ��� ���� ���� -----");
		Optional<Employee> youngestEmployee = employeeList.stream().filter(emp -> emp.getGender().equals("Male") && emp.getDepartment().equals("Product Development")).min(Comparator.comparing(Employee::getAge));
		System.out.println(youngestEmployee);

		System.err.println("\n----- 9. �ְ� �Ի��� ���� -----");
		Optional<Employee> mostWorkingExpEmp = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
		System.out.println(mostWorkingExpEmp.get());

		System.err.println("\n----- 10. [Sales And Marketing] �μ��� ���� �ο� -----");
		Map<String, Long> maleAndFemaleInSaleMarketTeam = employeeList.stream().filter(emp -> emp.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(maleAndFemaleInSaleMarketTeam);

		System.err.println("\n----- 11. ���� �޿� ��� -----");
		Map<String, Double> avgSalaryOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryOfMaleAndFemale);

		System.err.println("\n----- 12. �μ��� �ο� �̸� -----");
		Map<String, List<Employee>> employeesDepartmentList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Map.Entry<String, List<Employee>>> entriess = employeesDepartmentList.entrySet();
		for (Map.Entry<String, List<Employee>> entry : entriess) {
			System.out.println("\nDepartment : " + entry.getKey());
			System.out.println("------------------------------------");
			for (Employee emp : entry.getValue()) {
				System.out.println(emp.getName());
			}
		}

		System.err.println("\n----- 13. �ѿ� �޿� ���/�� -----");
		DoubleSummaryStatistics employeeLStats = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary : " + employeeLStats.getAverage());
		System.out.println("Total Salary : " + employeeLStats.getSum());

		System.err.println("\n----- 14. 25�� ���� ���� ��� -----");
		Map<Boolean, List<Employee>> partitionEmployees = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
		Set<Map.Entry<Boolean, List<Employee>>> entriesss = partitionEmployees.entrySet();
		for (Map.Entry<Boolean, List<Employee>> entry : entriesss) {
			if (entry.getKey()) {
				System.out.println("\n25�� ���� �ο�");
			} else {
				System.out.println("\n25�� �ʰ� �ο�");
			}
			System.out.println("------------------------------------------------");
			for (Employee emp : entry.getValue()) {
				System.out.println(emp.getName());
			}
		}

		System.err.println("\n----- 15. �ְ�� �ο��� �̸�, ����, �ҼӺμ� ----- ");
		Optional<Employee> oldEmployee = employeeList.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println("Name: " + oldEmployee.get().getName());
		System.out.println("Age: " + oldEmployee.get().getAge());
		System.out.println("Department: " + oldEmployee.get().getDepartment());

		System.err.println("\n----- 16. �޿� �� 2�� �ο� ���� -----");
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).forEach(System.out::println);

		System.err.println("\n----- 17. �޿� �� ���� 3�� ���� -----");
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);

		System.err.println("\n----- 18. �μ��� �ִ� �޿� �ο� ���� -----");
		Comparator<Employee> salDept = Comparator.comparing(Employee::getSalary);
//		Map<String, Optional<Employee>> maxSalDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.reducing(BinaryOperator.maxBy(salDept))));
		Map<String, Optional<Employee>> maxSalDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		maxSalDept.forEach((department, emp) -> {
			System.out.println("\n�μ��� : " + department);
			Employee employee = emp.get();
			System.out.println(employee);
		});
	}

}