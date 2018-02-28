
public class Test {
	public static void main(String[] ages){
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);


		Person jiro =new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person saburo = new Person("saburo");
		taro.age = 0;
		System.out.println(saburo.name);
		System.out.println(taro.age);


		Person noname = new Person(25);
		noname.name = "名前なし";
		System.out.println(noname.name);
		System.out.println(noname.age);


		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}
