package e_08_01;

public class HumanClass {
	private String name;
	private int age;
	private String gender;
	private String nationality;
	private float height;
	private float weight;

	final String Human_Name = new String("名前：");
	final String Age = new String("年齢：");
	final String Gender = new String("性別：");
	final String Nationality = new String("国籍：");
	final String Height = String.format("身長：%3.1fcm", this.height);
	final String Weight = String.format("体重：%3.1fkg", this.weight);
	final String BMI_Index = new String("ボディマス指数：");

	HumanClass(String name, int age, String gender, String nationality, float height, float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nationality = nationality;
		this.height = height;
		this.weight = weight;
	}

	float getBMI() {
		float BMIIndex = weight / (height / 100) / (height / 100);
		return BMIIndex;
	}

	void putHumanSpec() {
		System.out.println(Human_Name + name);
		System.out.println(Age + age);
		System.out.println(Gender + gender);
		System.out.println(Nationality + nationality);
		System.out.println(Height + height);
		System.out.println(Weight + weight);
		System.out.println(BMI_Index + getBMI());
	}

}
