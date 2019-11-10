package basics.java8.functions;

import java.util.function.Supplier;

public class SupplierImplTest {

	public class SupplierImpl implements Supplier<String> {
		@Override
		public String get() {
			return "hola";
		}
	}

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "hola";
		System.out.println("Supplier: " + supplier.get());

		Supplier<String> supplierImpl = new SupplierImplTest().new SupplierImpl();
		System.out.println("SupplierImpl: " + supplierImpl.get());
	}

}
