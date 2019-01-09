package concepts;

public class Student {
	public static String Country;
	private String name;
	private int roolNo;
	private int age;

	public Student(String name, int roolNo, int age) {
		this.name = name;
		this.roolNo = roolNo;
		this.age = age;
	}

	public static String getCountry() {
		return Country;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoolNo() {
		return roolNo;
	}

	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roolNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roolNo != other.roolNo)
			return false;
		return true;
	}



	

}
