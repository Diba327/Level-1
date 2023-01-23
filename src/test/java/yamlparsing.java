
public class yamlparsing {
	InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
	Yaml yaml = new Yaml();
	var lhm = (LinkedHashMap) yaml.load(is);
	public class Person {
		   private String firstname;
		   private String lastname;
		//getters and setters
		}
}
