
package basics.inheritance.polimorfism;

import java.util.List;

import com.google.common.collect.Lists;

public class Application {

	public static void doSomething(ParentInterface i) {
		i.doSomething();
	}

	public static void main(String[] args) {
		List<ParentInterface> is = Lists.newArrayList(new ChildClass1(), new ChildClass2());
		is.forEach(Application::doSomething);
	}
}
