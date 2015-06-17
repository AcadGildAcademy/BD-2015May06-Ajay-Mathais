package classObjectChallenge1;

public class Employee {

	String name;
	char sex;
	String jobTitle;
	Organization organization;
	String birthday;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Organization google = new Organization();
		google.setName("Google!");
		google.setNumberOfEmployees(100);
		
		Organization microsoft = new Organization();
		microsoft.setName("Microsoft");
		microsoft.setNumberOfEmployees(300);
		
		Employee googleEmployee = new Employee();
		googleEmployee.setName("Alice");
		googleEmployee.setSex('F');
		googleEmployee.setJobTitle("Engineer Level 3");
		googleEmployee.setOrganization(google);
		googleEmployee.setBirthday("05-02-1991");
		
		
		Employee msEmployee = new Employee();
		msEmployee.setName("Bob");
		msEmployee.setSex('M');
		msEmployee.setJobTitle("Developer Level 3");
		msEmployee.setOrganization(microsoft);
		msEmployee.setBirthday("05-02-1991");
		
		
		

	}

}
