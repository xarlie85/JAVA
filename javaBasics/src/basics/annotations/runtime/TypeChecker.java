package basics.annotations.runtime;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TypeChecker {

	public static Map<String, String> checkType(Object object) {
		
		Map<String, String> jsonElements = new HashMap<>();
		
		try {
			Class<?> objectClass = Objects.requireNonNull(object).getClass();

			if (objectClass.isAnnotationPresent(CheckType.class)) {
				System.out.println("This class has the annotation.");
				for (Field field: objectClass.getDeclaredFields()) {
	                field.setAccessible(true);
	                if (field.isAnnotationPresent(JsonField.class)) {
	                    jsonElements.put(getSerializedKey(field), (String) field.get(object));
	                }
	            }
			}
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		return jsonElements;
	}
	
	public static String toJsonString(Map<String, String> jsonMap) {
        String elementsString = jsonMap.entrySet()
                .stream()
                .map(entry -> "\""  + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + elementsString + "}";
    }
	
    private static String getSerializedKey(Field field) {
        String annotationValue = field.getAnnotation(JsonField.class).value();
        
        if (annotationValue.isEmpty()) {
            return field.getName();
        }
        else {
            return annotationValue;
        }
    }
	
	public static void main(String[] args) {
		System.out.println();TypeChecker.toJsonString(TypeChecker.checkType(new Animal("Lucas")));
	}
}
