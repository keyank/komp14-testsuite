class TestOrBinding {
	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean c;
		boolean d;
		a = true;
		b = false;
		c = true;
		d = false;

		if(a || b)
			System.out.println(true);

		if(a && b || c && d)
			System.out.println(false);

		if((a && b) || (c && d))
			System.out.println(false);

		if(a || b && c || d)
			System.out.println(true);

		if(a && b && a || c && c && d)
			System.out.println(false);

		if(a ||a && b && a || c && c && d)
			System.out.println(false);
	}
}
