//Tests a class extending one class, but attempts to reach a method of a class that it does not extend.
class TestExtends {
	public static void main(String[] args) {
		A a;
	}
}

class A extends B {
	int a;
	public int amethod1(int param) {
		int first;
		int second;
		first = this.dmethod1(1);
		return 1;
	}
}

class B {
	int b;
	public int bmethod1(int param) {
		return 1;
	}
}

class C extends D {
	int c;
	public int cmethod1(int param) {
		return 1;
	}
}

class D {
	int d;
	public int dmethod1(int param) {
		return 1;
	}
}
