package basics.system.properties;

public class SystemPropReader {
	public static void main(String[] args) {
		System.out.println("***************** SYSTEM PROPERTIES *****************");
		System.getProperties().forEach((k, v) -> System.out.println(k.toString() + "::" + v.toString()));
		System.setProperty("catalina.base", "C:\\Users\\deca\\Documents\\tools\\apache-tomcat-8.5.50\\logs");
		System.out.println("***************** SYSTEM PROPERTIES (added new catalina.base) *****************");
		System.getProperties().forEach((k, v) -> System.out.println(k.toString() + "::" + v.toString()));
		System.out.println("***************** SYSTEM ENVIRONMENT VARIABLES *****************");
		System.getenv().forEach((k, v) -> System.out.println(k.toString() + "::" + v.toString()));
	}
}
