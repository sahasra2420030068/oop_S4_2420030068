package WrapperClass;

public class DataType {

	public static void main(String[] args) {
		// All primitive data types
		
		int i = 13;
		Integer a = new Integer(i);
		System.out.println("Integer datatype : " + a);
		
		float f = 31.1f;
		Float x = new Float(f);
		System.out.println("Float datatype : " + x);

		double d = 13.2323;
		Double y = new Double(d);
		System.out.println("Double datatype : " + y);
	
		long l = 2420030050L;
		Long g = new Long(l);
		System.out.println("Long datatype : " + g);
		
		char c = 'p';
		Character r = new Character(c);
		System.out.println("Character datatype : " + r);
		
		boolean o = true;
		Boolean n = new Boolean(o);
		System.out.println("Boolean datatype : " + n);

	}

}
